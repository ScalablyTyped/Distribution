package typings.angularCompilerCli

import typings.angularCompilerCli.anon.ClassDeclarationDeclarati
import typings.angularCompilerCli.srcNgtscImportsMod.Reference
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiScopeMod {
  
  @js.native
  sealed trait PotentialImportKind extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/scope", "PotentialImportKind")
  @js.native
  object PotentialImportKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PotentialImportKind & Double] = js.native
    
    @js.native
    sealed trait NgModule
      extends StObject
         with PotentialImportKind
    /* 0 */ val NgModule: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportKind.NgModule & Double = js.native
    
    @js.native
    sealed trait Standalone
      extends StObject
         with PotentialImportKind
    /* 1 */ val Standalone: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportKind.Standalone & Double = js.native
  }
  
  @js.native
  sealed trait PotentialImportMode extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/api/scope", "PotentialImportMode")
  @js.native
  object PotentialImportMode extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PotentialImportMode & Double] = js.native
    
    /**
      * An import is assumed to be standalone and is imported directly. This is useful for migrations
      * where a declaration wasn't standalone when the program was created, but will become standalone
      * as a part of the migration.
      */
    @js.native
    sealed trait ForceDirect
      extends StObject
         with PotentialImportMode
    /* 1 */ val ForceDirect: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportMode.ForceDirect & Double = js.native
    
    /** Whether an import is standalone is inferred based on its metadata. */
    @js.native
    sealed trait Normal
      extends StObject
         with PotentialImportMode
    /* 0 */ val Normal: typings.angularCompilerCli.srcNgtscTypecheckApiScopeMod.PotentialImportMode.Normal & Double = js.native
  }
  
  trait PotentialDirective extends StObject {
    
    /**
      * `true` if this directive is a component.
      */
    var isComponent: Boolean
    
    /**
      * Whether or not this directive is in scope.
      */
    var isInScope: Boolean
    
    /**
      * `true` if this directive is a structural directive.
      */
    var isStructural: Boolean
    
    /**
      * The module which declares the directive.
      */
    var ngModule: ClassDeclarationDeclarati | Null
    
    var ref: Reference[ClassDeclarationDeclarati]
    
    /**
      * The selector for the directive or component.
      */
    var selector: String | Null
    
    /**
      * The `ts.Symbol` for the directive class.
      */
    var tsSymbol: SymbolWithValueDeclaration
  }
  object PotentialDirective {
    
    inline def apply(
      isComponent: Boolean,
      isInScope: Boolean,
      isStructural: Boolean,
      ref: Reference[ClassDeclarationDeclarati],
      tsSymbol: SymbolWithValueDeclaration
    ): PotentialDirective = {
      val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isInScope = isInScope.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], ngModule = null, selector = null)
      __obj.asInstanceOf[PotentialDirective]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotentialDirective] (val x: Self) extends AnyVal {
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsInScope(value: Boolean): Self = StObject.set(x, "isInScope", value.asInstanceOf[js.Any])
      
      inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: ClassDeclarationDeclarati): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
      
      inline def setNgModuleNull: Self = StObject.set(x, "ngModule", null)
      
      inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSelectorNull: Self = StObject.set(x, "selector", null)
      
      inline def setTsSymbol(value: SymbolWithValueDeclaration): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait PotentialImport extends StObject {
    
    var isForwardReference: Boolean
    
    var kind: PotentialImportKind
    
    var moduleSpecifier: js.UndefOr[String] = js.undefined
    
    var symbolName: String
  }
  object PotentialImport {
    
    inline def apply(isForwardReference: Boolean, kind: PotentialImportKind, symbolName: String): PotentialImport = {
      val __obj = js.Dynamic.literal(isForwardReference = isForwardReference.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], symbolName = symbolName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotentialImport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotentialImport] (val x: Self) extends AnyVal {
      
      inline def setIsForwardReference(value: Boolean): Self = StObject.set(x, "isForwardReference", value.asInstanceOf[js.Any])
      
      inline def setKind(value: PotentialImportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModuleSpecifier(value: String): Self = StObject.set(x, "moduleSpecifier", value.asInstanceOf[js.Any])
      
      inline def setModuleSpecifierUndefined: Self = StObject.set(x, "moduleSpecifier", js.undefined)
      
      inline def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
    }
  }
  
  trait PotentialPipe extends StObject {
    
    /**
      * Whether or not this pipe is in scope.
      */
    var isInScope: Boolean
    
    /**
      * Name of the pipe.
      */
    var name: String
    
    var ref: Reference[ClassDeclarationDeclarati]
    
    /**
      * The `ts.Symbol` for the pipe class.
      */
    var tsSymbol: Symbol
  }
  object PotentialPipe {
    
    inline def apply(isInScope: Boolean, name: String, ref: Reference[ClassDeclarationDeclarati], tsSymbol: Symbol): PotentialPipe = {
      val __obj = js.Dynamic.literal(isInScope = isInScope.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[PotentialPipe]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PotentialPipe] (val x: Self) extends AnyVal {
      
      inline def setIsInScope(value: Boolean): Self = StObject.set(x, "isInScope", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRef(value: Reference[ClassDeclarationDeclarati]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setTsSymbol(value: Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    }
  }
}
