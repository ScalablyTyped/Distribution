package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single value which is used with EnhancedCustomShapes */
trait EnhancedCustomShapeParameter extends js.Object {
  var Type: Double
  /** the any can be of type long or double */
  var Value: js.Any
}

object EnhancedCustomShapeParameter {
  @scala.inline
  def apply(Type: Double, Value: js.Any): EnhancedCustomShapeParameter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeParameter]
  }
}

