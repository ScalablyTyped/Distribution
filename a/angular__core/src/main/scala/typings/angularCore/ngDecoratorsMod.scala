package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.Decorator
import typings.typescript.mod.ImportDeclaration
import typings.typescript.mod.TypeChecker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngDecoratorsMod {
  
  @JSImport("@angular/core/schematics/utils/ng_decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAngularDecorators(typeChecker: TypeChecker, decorators: js.Array[Decorator]): js.Array[NgDecorator] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAngularDecorators")(typeChecker.asInstanceOf[js.Any], decorators.asInstanceOf[js.Any])).asInstanceOf[js.Array[NgDecorator]]
  
  @js.native
  trait CallExpressionDecorator
    extends StObject
       with Decorator {
    
    @JSName("expression")
    var expression_CallExpressionDecorator: CallExpression = js.native
  }
  
  trait NgDecorator extends StObject {
    
    var importNode: ImportDeclaration
    
    var moduleName: String
    
    var name: String
    
    var node: CallExpressionDecorator
  }
  object NgDecorator {
    
    inline def apply(importNode: ImportDeclaration, moduleName: String, name: String, node: CallExpressionDecorator): NgDecorator = {
      val __obj = js.Dynamic.literal(importNode = importNode.asInstanceOf[js.Any], moduleName = moduleName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[NgDecorator]
    }
    
    extension [Self <: NgDecorator](x: Self) {
      
      inline def setImportNode(value: ImportDeclaration): Self = StObject.set(x, "importNode", value.asInstanceOf[js.Any])
      
      inline def setModuleName(value: String): Self = StObject.set(x, "moduleName", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNode(value: CallExpressionDecorator): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
