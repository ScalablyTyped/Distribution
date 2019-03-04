package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs

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
  var Name: java.lang.String
}

object GetDirectPropertyTolerantResult {
  @scala.inline
  def apply(Name: java.lang.String, Result: scala.Double, State: PropertyState, Value: js.Any): GetDirectPropertyTolerantResult = {
    val __obj = js.Dynamic.literal(Name = Name, Result = Result, State = State, Value = Value)
  
    __obj.asInstanceOf[GetDirectPropertyTolerantResult]
  }
}

