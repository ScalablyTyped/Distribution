package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSecurityGroupIpRange extends StObject {
  
  /**
    * Specifies the IP range.
    */
  var CidrIp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the status of the IP range.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSecurityGroupIpRange {
  
  inline def apply(): AwsRdsDbSecurityGroupIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSecurityGroupIpRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbSecurityGroupIpRange] (val x: Self) extends AnyVal {
    
    inline def setCidrIp(value: NonEmptyString): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    inline def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
