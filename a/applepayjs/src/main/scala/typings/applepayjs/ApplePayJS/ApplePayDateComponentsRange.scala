package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dictionary that specifies the start and end dates for a range of time.
  */
trait ApplePayDateComponentsRange extends StObject {
  
  /**
    * The end date and time of the range.
    */
  var endDateComponents: ApplePayDateComponents
  
  /**
    * The start date and time of the range.
    */
  var startDateComponents: ApplePayDateComponents
}
object ApplePayDateComponentsRange {
  
  inline def apply(endDateComponents: ApplePayDateComponents, startDateComponents: ApplePayDateComponents): ApplePayDateComponentsRange = {
    val __obj = js.Dynamic.literal(endDateComponents = endDateComponents.asInstanceOf[js.Any], startDateComponents = startDateComponents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayDateComponentsRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayDateComponentsRange] (val x: Self) extends AnyVal {
    
    inline def setEndDateComponents(value: ApplePayDateComponents): Self = StObject.set(x, "endDateComponents", value.asInstanceOf[js.Any])
    
    inline def setStartDateComponents(value: ApplePayDateComponents): Self = StObject.set(x, "startDateComponents", value.asInstanceOf[js.Any])
  }
}
