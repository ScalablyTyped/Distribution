package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies information being retrieved about a single property.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
@js.native
trait GetPropertyTolerantResult extends js.Object {
  /**
    * specifies a success or error code for the retrieval operation.
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: Double = js.native
  /**
    * contains the state of the property.
    *
    * The value is undefined if **Result** is not {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    */
  var State: PropertyState = js.native
  /**
    * contains the value of the property.
    *
    * The value is undefined if **Result** is not {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    */
  var Value: js.Any = js.native
}

object GetPropertyTolerantResult {
  @scala.inline
  def apply(Result: Double, State: PropertyState, Value: js.Any): GetPropertyTolerantResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyTolerantResult]
  }
  @scala.inline
  implicit class GetPropertyTolerantResultOps[Self <: GetPropertyTolerantResult] (val x: Self) extends AnyVal {
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
    def setResult(value: Double): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: PropertyState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

