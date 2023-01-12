package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAlertResponse extends StObject {
  
  /**
    * Contains information about an alert.
    */
  var Alert: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Alert] = js.undefined
}
object DescribeAlertResponse {
  
  inline def apply(): DescribeAlertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAlertResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAlertResponse] (val x: Self) extends AnyVal {
    
    inline def setAlert(value: Alert): Self = StObject.set(x, "Alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "Alert", js.undefined)
  }
}
