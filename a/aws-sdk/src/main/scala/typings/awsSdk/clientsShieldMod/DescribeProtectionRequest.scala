package typings.awsSdk.clientsShieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProtectionRequest extends StObject {
  
  /**
    * The unique identifier (ID) for the Protection object to describe. You must provide either the ResourceArn of the protected resource or the ProtectionID of the protection, but not both.
    */
  var ProtectionId: js.UndefOr[typings.awsSdk.clientsShieldMod.ProtectionId] = js.undefined
  
  /**
    * The ARN (Amazon Resource Name) of the protected Amazon Web Services resource. You must provide either the ResourceArn of the protected resource or the ProtectionID of the protection, but not both.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsShieldMod.ResourceArn] = js.undefined
}
object DescribeProtectionRequest {
  
  inline def apply(): DescribeProtectionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProtectionRequest] (val x: Self) extends AnyVal {
    
    inline def setProtectionId(value: ProtectionId): Self = StObject.set(x, "ProtectionId", value.asInstanceOf[js.Any])
    
    inline def setProtectionIdUndefined: Self = StObject.set(x, "ProtectionId", js.undefined)
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
