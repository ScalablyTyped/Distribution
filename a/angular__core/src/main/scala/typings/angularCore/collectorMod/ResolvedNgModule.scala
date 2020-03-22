package typings.angularCore.collectorMod

import typings.angularCore.ngDecoratorsMod.NgDecorator
import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.MethodDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedNgModule extends js.Object {
  var decorator: NgDecorator
  var name: String
  var node: ClassDeclaration
  /**
    * List of found static method declarations on the module which do not
    * declare an explicit return type.
    */
  var staticMethodsWithoutType: js.Array[MethodDeclaration]
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
}

