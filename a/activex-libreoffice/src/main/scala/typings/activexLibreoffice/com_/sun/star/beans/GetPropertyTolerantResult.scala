package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies information being retrieved about a single property.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
trait GetPropertyTolerantResult extends js.Object {
  /**
    * specifies a success or error code for the retrieval operation.
    * @see com.sun.star.beans.TolerantPropertySetResultType
    */
  var Result: Double
  /**
    * contains the state of the property.
    *
    * The value is undefined if **Result** is not {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    */
  var State: PropertyState
  /**
    * contains the value of the property.
    *
    * The value is undefined if **Result** is not {@link com.sun.star.beans.TolerantPropertySetResultType.SUCCESS} .
    */
  var Value: js.Any
}

object GetPropertyTolerantResult {
  @scala.inline
  def apply(Result: Double, State: PropertyState, Value: js.Any): GetPropertyTolerantResult = {
    val __obj = js.Dynamic.literal(Result = Result.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyTolerantResult]
  }
}

