package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceMetadata extends StObject {
  
  /**
    * The identifier of the identity store that is connected to the IAM Identity Center instance.
    */
  var IdentityStoreId: js.UndefOr[Id] = js.undefined
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed. For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces in the AWS General Reference.
    */
  var InstanceArn: js.UndefOr[typings.awsSdk.clientsSsoadminMod.InstanceArn] = js.undefined
}
object InstanceMetadata {
  
  inline def apply(): InstanceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceMetadata] (val x: Self) extends AnyVal {
    
    inline def setIdentityStoreId(value: Id): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStoreIdUndefined: Self = StObject.set(x, "IdentityStoreId", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "InstanceArn", js.undefined)
  }
}
