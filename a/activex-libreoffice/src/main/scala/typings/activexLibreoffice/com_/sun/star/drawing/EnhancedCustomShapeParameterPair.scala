package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the coordinates used with EnhancedCustomShapes */
trait EnhancedCustomShapeParameterPair extends js.Object {
  var First: EnhancedCustomShapeParameter
  var Second: EnhancedCustomShapeParameter
}

object EnhancedCustomShapeParameterPair {
  @scala.inline
  def apply(First: EnhancedCustomShapeParameter, Second: EnhancedCustomShapeParameter): EnhancedCustomShapeParameterPair = {
    val __obj = js.Dynamic.literal(First = First.asInstanceOf[js.Any], Second = Second.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeParameterPair]
  }
}

