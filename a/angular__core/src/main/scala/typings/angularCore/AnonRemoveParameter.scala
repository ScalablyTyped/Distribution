package typings.angularCore

import typings.typescript.mod.CallExpression
import typings.typescript.mod.ObjectLiteralExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRemoveParameter extends js.Object {
  var removeParameter: js.Array[CallExpression]
  var removeProperty: js.Array[ObjectLiteralExpression]
}

object AnonRemoveParameter {
  @scala.inline
  def apply(removeParameter: js.Array[CallExpression], removeProperty: js.Array[ObjectLiteralExpression]): AnonRemoveParameter = {
    val __obj = js.Dynamic.literal(removeParameter = removeParameter.asInstanceOf[js.Any], removeProperty = removeProperty.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRemoveParameter]
  }
}

