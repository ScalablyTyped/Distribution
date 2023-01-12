package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscIncrementalSemanticGraphSrcApiMod {
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/incremental/semantic_graph/src/api", "SemanticSymbol")
  @js.native
  open class SemanticSymbol protected () extends StObject {
    def this(/**
      * The declaration for this symbol.
      */
    decl: ClassDeclaration[DeclarationNode]) = this()
    
    /**
      * The declaration for this symbol.
      */
    val decl: ClassDeclaration[DeclarationNode] = js.native
    
    /**
      * The identifier of this symbol, or null if no identifier could be determined. It should
      * uniquely identify the symbol relative to `file`. This is typically just the name of a
      * top-level class declaration, as that uniquely identifies the class within the file.
      *
      * If the identifier is null, then this symbol cannot be recognized across rebuilds. In that
      * case, the symbol is always assumed to have semantically changed to guarantee a proper
      * rebuild.
      */
    val identifier: String | Null = js.native
    
    /**
      * Allows the symbol to determine whether its emit is affected. The equivalent symbol from a prior
      * build is given, in addition to the set of symbols of which the public API has changed.
      *
      * This method determines whether a change to _other_ symbols, i.e. those present in
      * `publicApiAffected`, should cause _this_ symbol to be re-emitted.
      *
      * @param previousSymbol The equivalent symbol from a prior compilation. Note that it may be a
      * different type of symbol, if e.g. a Component was changed into a Directive with the same name.
      * @param publicApiAffected The set of symbols of which the public API has changed.
      */
    var isEmitAffected: js.UndefOr[
        js.Function2[/* previousSymbol */ this.type, /* publicApiAffected */ Set[this.type], Boolean]
      ] = js.native
    
    /**
      * Allows the symbol to be compared to the equivalent symbol in the previous compilation. The
      * return value indicates whether the symbol has been changed in a way such that its public API
      * is affected.
      *
      * This method determines whether a change to _this_ symbol require the symbols that
      * use to this symbol to be re-emitted.
      *
      * Note: `previousSymbol` is obtained from the most recently succeeded compilation. Symbols of
      * failed compilations are never provided.
      *
      * @param previousSymbol The symbol from a prior compilation.
      */
    def isPublicApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    /**
      * Similar to `isPublicApiAffected`, but here equivalent symbol from a prior compilation needs
      * to be compared to see if the type-check block of components that use this symbol is affected.
      *
      * This method determines whether a change to _this_ symbol require the symbols that
      * use to this symbol to have their type-check block regenerated.
      *
      * Note: `previousSymbol` is obtained from the most recently succeeded compilation. Symbols of
      * failed compilations are never provided.
      *
      * @param previousSymbol The symbol from a prior compilation.
      */
    def isTypeCheckApiAffected(previousSymbol: SemanticSymbol): Boolean = js.native
    
    /**
      * Similar to `isEmitAffected`, but focused on the type-check block of this symbol. This method
      * determines whether a change to _other_ symbols, i.e. those present in `typeCheckApiAffected`,
      * should cause _this_ symbol's type-check block to be regenerated.
      *
      * @param previousSymbol The equivalent symbol from a prior compilation. Note that it may be a
      * different type of symbol, if e.g. a Component was changed into a Directive with the same name.
      * @param typeCheckApiAffected The set of symbols of which the type-check API has changed.
      */
    var isTypeCheckBlockAffected: js.UndefOr[
        js.Function2[/* previousSymbol */ this.type, /* typeCheckApiAffected */ Set[this.type], Boolean]
      ] = js.native
    
    /**
      * The path of the file that declares this symbol.
      */
    val path: AbsoluteFsPath = js.native
  }
  
  trait SemanticReference extends StObject {
    
    /**
      * The path by which the symbol has been referenced.
      */
    var importPath: String | Null
    
    var symbol: SemanticSymbol
  }
  object SemanticReference {
    
    inline def apply(symbol: SemanticSymbol): SemanticReference = {
      val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any], importPath = null)
      __obj.asInstanceOf[SemanticReference]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SemanticReference] (val x: Self) extends AnyVal {
      
      inline def setImportPath(value: String): Self = StObject.set(x, "importPath", value.asInstanceOf[js.Any])
      
      inline def setImportPathNull: Self = StObject.set(x, "importPath", null)
      
      inline def setSymbol(value: SemanticSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
}
