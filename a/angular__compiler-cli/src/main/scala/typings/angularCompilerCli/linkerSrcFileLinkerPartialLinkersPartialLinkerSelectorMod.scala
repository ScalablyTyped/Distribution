package typings.angularCompilerCli

import typings.angularCompilerCli.angularCompilerCliStrings.error
import typings.angularCompilerCli.angularCompilerCliStrings.ignore
import typings.angularCompilerCli.angularCompilerCliStrings.warn
import typings.angularCompilerCli.linkerSrcFileLinkerLinkerEnvironmentMod.LinkerEnvironment
import typings.angularCompilerCli.linkerSrcFileLinkerPartialLinkersPartialLinkerMod.PartialLinker
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.semver.mod.Range
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkerSrcFileLinkerPartialLinkersPartialLinkerSelectorMod {
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "PartialLinkerSelector")
  @js.native
  open class PartialLinkerSelector[TExpression] protected () extends StObject {
    def this(
      linkers: Map[String, js.Array[LinkerRange[TExpression]]],
      logger: Logger,
      unknownDeclarationVersionHandling: ignore | warn | error
    ) = this()
    
    /**
      * Returns the `PartialLinker` that can handle functions with the given name and version.
      * Throws an error if there is none.
      */
    def getLinker(functionName: String, minVersion: String, version: String): PartialLinker[TExpression] = js.native
    
    /* private */ val linkers: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /**
      * Returns true if there are `PartialLinker` classes that can handle functions with this name.
      */
    def supportsDeclaration(functionName: String): Boolean = js.native
    
    /* private */ val unknownDeclarationVersionHandling: Any = js.native
  }
  
  inline def createLinkerMap[TStatement, TExpression](environment: LinkerEnvironment[TStatement, TExpression], sourceUrl: AbsoluteFsPath, code: String): Map[String, js.Array[LinkerRange[TExpression]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createLinkerMap")(environment.asInstanceOf[js.Any], sourceUrl.asInstanceOf[js.Any], code.asInstanceOf[js.Any])).asInstanceOf[Map[String, js.Array[LinkerRange[TExpression]]]]
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "declarationFunctions")
  @js.native
  val declarationFunctions: js.Array[String] = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareClassMetadata")
  @js.native
  val ɵɵngDeclareClassMetadata: /* "\\u0275\\u0275ngDeclareClassMetadata" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareComponent")
  @js.native
  val ɵɵngDeclareComponent: /* "\\u0275\\u0275ngDeclareComponent" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareDirective")
  @js.native
  val ɵɵngDeclareDirective: /* "\\u0275\\u0275ngDeclareDirective" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareFactory")
  @js.native
  val ɵɵngDeclareFactory: /* "\\u0275\\u0275ngDeclareFactory" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareInjectable")
  @js.native
  val ɵɵngDeclareInjectable: /* "\\u0275\\u0275ngDeclareInjectable" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareInjector")
  @js.native
  val ɵɵngDeclareInjector: /* "\\u0275\\u0275ngDeclareInjector" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclareNgModule")
  @js.native
  val ɵɵngDeclareNgModule: /* "\\u0275\\u0275ngDeclareNgModule" */ String = js.native
  
  @JSImport("@angular/compiler-cli/linker/src/file_linker/partial_linkers/partial_linker_selector", "\u0275\u0275ngDeclarePipe")
  @js.native
  val ɵɵngDeclarePipe: /* "\\u0275\\u0275ngDeclarePipe" */ String = js.native
  
  trait LinkerRange[TExpression] extends StObject {
    
    var linker: PartialLinker[TExpression]
    
    var range: Range
  }
  object LinkerRange {
    
    inline def apply[TExpression](linker: PartialLinker[TExpression], range: Range): LinkerRange[TExpression] = {
      val __obj = js.Dynamic.literal(linker = linker.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkerRange[TExpression]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkerRange[?], TExpression] (val x: Self & LinkerRange[TExpression]) extends AnyVal {
      
      inline def setLinker(value: PartialLinker[TExpression]): Self = StObject.set(x, "linker", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
}
