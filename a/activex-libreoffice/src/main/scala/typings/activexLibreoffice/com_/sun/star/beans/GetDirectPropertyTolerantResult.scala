package typings.activexLibreoffice.com_.sun.star.beans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies information being retrieved about a single property.
  *
  * This type is used for the elements in the sequence returned by com::sun::star::beans::XTolerantMultiPropertySet::GetDirectPropertyTolerantResult.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
trait GetDirectPropertyTolerantResult extends GetPropertyTolerantResult {
  /** specifies the name of the property. */
  var Name: String
}

object GetDirectPropertyTolerantResult {
  @scala.inline
  def apply(Name: String, Result: Double, State: PropertyState, Value: js.Any): GetDirectPropertyTolerantResult = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectPropertyTolerantResult]
  }
}

