package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a single value which is used with EnhancedCustomShapes */
@js.native
trait EnhancedCustomShapeParameter extends js.Object {
  var Type: Double = js.native
  /** the any can be of type long or double */
  var Value: js.Any = js.native
}

object EnhancedCustomShapeParameter {
  @scala.inline
  def apply(Type: Double, Value: js.Any): EnhancedCustomShapeParameter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeParameter]
  }
  @scala.inline
  implicit class EnhancedCustomShapeParameterOps[Self <: EnhancedCustomShapeParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: Double): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

