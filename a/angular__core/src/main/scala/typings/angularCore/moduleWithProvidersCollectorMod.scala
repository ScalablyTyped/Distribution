package typings.angularCore

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.MethodDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.TypeChecker
import typings.typescript.mod.TypeReferenceNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleWithProvidersCollectorMod {
  
  @JSImport("@angular/core/schematics/migrations/module-with-providers/collector", "Collector")
  @js.native
  class Collector protected () extends StObject {
    def this(typeChecker: TypeChecker) = this()
    
    var _visitNgModuleClass: js.Any = js.native
    
    var resolvedModules: js.Array[ResolvedNgModule] = js.native
    
    var resolvedNonGenerics: js.Array[TypeReferenceNode] = js.native
    
    var typeChecker: TypeChecker = js.native
    
    var visitClassDeclaration: js.Any = js.native
    
    def visitNode(node: Node): Unit = js.native
  }
  
  @js.native
  trait ResolvedNgModule extends StObject {
    
    var decorator: NgDecorator = js.native
    
    var name: String = js.native
    
    var node: ClassDeclaration = js.native
    
    /**
      * List of found static method declarations on the module which do not
      * declare an explicit return type.
      */
    var staticMethodsWithoutType: js.Array[MethodDeclaration] = js.native
  }
  object ResolvedNgModule {
    
    @scala.inline
    def apply(
      decorator: NgDecorator,
      name: String,
      node: ClassDeclaration,
      staticMethodsWithoutType: js.Array[MethodDeclaration]
    ): ResolvedNgModule = {
      val __obj = js.Dynamic.literal(decorator = decorator.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], staticMethodsWithoutType = staticMethodsWithoutType.asInstanceOf[js.Any])
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
      def setStaticMethodsWithoutType(value: js.Array[MethodDeclaration]): Self = StObject.set(x, "staticMethodsWithoutType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticMethodsWithoutTypeVarargs(value: MethodDeclaration*): Self = StObject.set(x, "staticMethodsWithoutType", js.Array(value :_*))
    }
  }
}
