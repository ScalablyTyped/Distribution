package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHsmRequest extends StObject {
  
  /**
    * The ARN of the HSM. Either the HsmArn or the SerialNumber parameter must be specified.
    */
  var HsmArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HsmArn] = js.undefined
  
  /**
    * The serial number of the HSM. Either the HsmArn or the HsmSerialNumber parameter must be specified.
    */
  var HsmSerialNumber: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HsmSerialNumber] = js.undefined
}
object DescribeHsmRequest {
  
  inline def apply(): DescribeHsmRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHsmRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeHsmRequest] (val x: Self) extends AnyVal {
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
    
    inline def setHsmArnUndefined: Self = StObject.set(x, "HsmArn", js.undefined)
    
    inline def setHsmSerialNumber(value: HsmSerialNumber): Self = StObject.set(x, "HsmSerialNumber", value.asInstanceOf[js.Any])
    
    inline def setHsmSerialNumberUndefined: Self = StObject.set(x, "HsmSerialNumber", js.undefined)
  }
}
