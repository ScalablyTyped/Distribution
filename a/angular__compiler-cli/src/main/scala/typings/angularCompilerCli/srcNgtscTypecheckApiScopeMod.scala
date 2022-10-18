package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.ClassDeclaration
import typings.angularCompilerCli.srcNgtscReflectionSrcHostMod.DeclarationNode
import typings.angularCompilerCli.srcNgtscUtilSrcTypescriptMod.SymbolWithValueDeclaration
import typings.typescript.mod.Symbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckApiScopeMod {
  
  trait DirectiveInScope extends StObject {
    
    /**
      * `true` if this directive is a component.
      */
    var isComponent: Boolean
    
    /**
      * `true` if this directive is a structural directive.
      */
    var isStructural: Boolean
    
    /**
      * The module which declares the directive.
      */
    var ngModule: ClassDeclaration[DeclarationNode] | Null
    
    /**
      * The selector for the directive or component.
      */
    var selector: String
    
    /**
      * The `ts.Symbol` for the directive class.
      */
    var tsSymbol: SymbolWithValueDeclaration
  }
  object DirectiveInScope {
    
    inline def apply(
      isComponent: Boolean,
      isStructural: Boolean,
      selector: String,
      tsSymbol: SymbolWithValueDeclaration
    ): DirectiveInScope = {
      val __obj = js.Dynamic.literal(isComponent = isComponent.asInstanceOf[js.Any], isStructural = isStructural.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any], ngModule = null)
      __obj.asInstanceOf[DirectiveInScope]
    }
    
    extension [Self <: DirectiveInScope](x: Self) {
      
      inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
      
      inline def setIsStructural(value: Boolean): Self = StObject.set(x, "isStructural", value.asInstanceOf[js.Any])
      
      inline def setNgModule(value: ClassDeclaration[DeclarationNode]): Self = StObject.set(x, "ngModule", value.asInstanceOf[js.Any])
      
      inline def setNgModuleNull: Self = StObject.set(x, "ngModule", null)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setTsSymbol(value: SymbolWithValueDeclaration): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    }
  }
  
  trait PipeInScope extends StObject {
    
    /**
      * Name of the pipe.
      */
    var name: String
    
    /**
      * The `ts.Symbol` for the pipe class.
      */
    var tsSymbol: Symbol
  }
  object PipeInScope {
    
    inline def apply(name: String, tsSymbol: Symbol): PipeInScope = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], tsSymbol = tsSymbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeInScope]
    }
    
    extension [Self <: PipeInScope](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTsSymbol(value: Symbol): Self = StObject.set(x, "tsSymbol", value.asInstanceOf[js.Any])
    }
  }
}
