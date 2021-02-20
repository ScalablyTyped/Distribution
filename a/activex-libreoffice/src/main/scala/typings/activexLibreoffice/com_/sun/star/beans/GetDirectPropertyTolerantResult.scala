package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies information being retrieved about a single property.
  *
  * This type is used for the elements in the sequence returned by com::sun::star::beans::XTolerantMultiPropertySet::GetDirectPropertyTolerantResult.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
@js.native
trait GetDirectPropertyTolerantResult extends GetPropertyTolerantResult {
  
  /** specifies the name of the property. */
  var Name: String = js.native
}
object GetDirectPropertyTolerantResult {
  
  @scala.inline
  def apply(Name: String, Result: Double, State: PropertyState, Value: js.Any): GetDirectPropertyTolerantResult = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDirectPropertyTolerantResult]
  }
  
  @scala.inline
  implicit class GetDirectPropertyTolerantResultMutableBuilder[Self <: GetDirectPropertyTolerantResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
