package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHoursOfOperationResponse extends StObject {
  
  /**
    * The hours of operation.
    */
  var HoursOfOperation: js.UndefOr[typings.awsSdk.clientsConnectMod.HoursOfOperation] = js.undefined
}
object DescribeHoursOfOperationResponse {
  
  inline def apply(): DescribeHoursOfOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHoursOfOperationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHoursOfOperationResponse] (val x: Self) extends AnyVal {
    
    inline def setHoursOfOperation(value: HoursOfOperation): Self = StObject.set(x, "HoursOfOperation", value.asInstanceOf[js.Any])
    
    inline def setHoursOfOperationUndefined: Self = StObject.set(x, "HoursOfOperation", js.undefined)
  }
}
