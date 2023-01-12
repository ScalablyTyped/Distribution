package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectionResponse extends StObject {
  
  /**
    * The Protection that you requested. 
    */
  var Protection: js.UndefOr[typings.awsSdk.clientsShieldMod.Protection] = js.undefined
}
object DescribeProtectionResponse {
  
  inline def apply(): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProtectionResponse] (val x: Self) extends AnyVal {
    
    inline def setProtection(value: Protection): Self = StObject.set(x, "Protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "Protection", js.undefined)
  }
}
