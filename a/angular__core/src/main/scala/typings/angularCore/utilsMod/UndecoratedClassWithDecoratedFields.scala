package typings.angularCore.utilsMod

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.ImportDeclaration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndecoratedClassWithDecoratedFields extends js.Object {
  var classDeclaration: ClassDeclaration
  var importDeclaration: ImportDeclaration
}

object UndecoratedClassWithDecoratedFields {
  @scala.inline
  def apply(classDeclaration: ClassDeclaration, importDeclaration: ImportDeclaration): UndecoratedClassWithDecoratedFields = {
    val __obj = js.Dynamic.literal(classDeclaration = classDeclaration.asInstanceOf[js.Any], importDeclaration = importDeclaration.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UndecoratedClassWithDecoratedFields]
  }
}

