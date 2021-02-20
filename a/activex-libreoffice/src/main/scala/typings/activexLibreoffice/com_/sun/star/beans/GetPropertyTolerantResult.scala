package typings.activexLibreoffice.com_.sun.star.beans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies information being retrieved about a single property.
  * @see com.sun.star.beans.XTolerantMultiPropertySet
  */
@js.native
trait GetPropertyTolerantResult extends StObject {
  
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
  implicit class GetPropertyTolerantResultMutableBuilder[Self <: GetPropertyTolerantResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Double): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PropertyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
