package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Expression
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object definitionCollectorMod {
  
  @JSImport("@angular/core/schematics/migrations/missing-injectable/definition_collector", "NgDefinitionCollector")
  @js.native
  class NgDefinitionCollector protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    var _visitDirectiveClass: js.Any = js.native
    
    var _visitNgModuleClass: js.Any = js.native
    
    var resolvedDirectives: js.Array[ResolvedDirective] = js.native
    
    var resolvedModules: js.Array[ResolvedNgModule] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    var visitClassDeclaration: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  @js.native
  trait ResolvedDirective extends StObject {
    
    var decorator: NgDecorator = js.native
    
    var name: String = js.native
    
    var node: ClassDeclaration = js.native
    
    var providersExpr: Expression | Null = js.native
    
    var viewProvidersExpr: Expression | Null = js.native
  }
  object ResolvedDirective {
    
    @scala.inline
    def apply(decorator: NgDecorator, name: String, node: ClassDeclaration): ResolvedDirective = {
      val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedDirective]
    }
    
    @scala.inline
    implicit class ResolvedDirectiveMutableBuilder[Self <: ResolvedDirective] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorator(value: NgDecorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ClassDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersExpr(value: Expression): Self = StObject.set(x, "providersExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersExprNull: Self = StObject.set(x, "providersExpr", null)
      
      @scala.inline
      def setViewProvidersExpr(value: Expression): Self = StObject.set(x, "viewProvidersExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewProvidersExprNull: Self = StObject.set(x, "viewProvidersExpr", null)
    }
  }
  
  @js.native
  trait ResolvedNgModule extends StObject {
    
    var decorator: NgDecorator = js.native
    
    var name: String = js.native
    
    var node: ClassDeclaration = js.native
    
    var providersExpr: Expression | Null = js.native
  }
  object ResolvedNgModule {
    
    @scala.inline
    def apply(decorator: NgDecorator, name: String, node: ClassDeclaration): ResolvedNgModule = {
      val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedNgModule]
    }
    
    @scala.inline
    implicit class ResolvedNgModuleMutableBuilder[Self <: ResolvedNgModule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecorator(value: NgDecorator): Self = StObject.set(x, "decorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ClassDeclaration): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersExpr(value: Expression): Self = StObject.set(x, "providersExpr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProvidersExprNull: Self = StObject.set(x, "providersExpr", null)
    }
  }
}
