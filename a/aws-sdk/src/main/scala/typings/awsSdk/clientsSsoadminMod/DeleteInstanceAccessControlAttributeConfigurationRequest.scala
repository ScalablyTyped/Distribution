package typings.awsSdk.clientsSsoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceAccessControlAttributeConfigurationRequest extends StObject {
  
  /**
    * The ARN of the IAM Identity Center instance under which the operation will be executed.
    */
  var InstanceArn: typings.awsSdk.clientsSsoadminMod.InstanceArn
}
object DeleteInstanceAccessControlAttributeConfigurationRequest {
  
  inline def apply(InstanceArn: InstanceArn): DeleteInstanceAccessControlAttributeConfigurationRequest = {
    val __obj = js.Dynamic.literal(InstanceArn = InstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceAccessControlAttributeConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInstanceAccessControlAttributeConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "InstanceArn", value.asInstanceOf[js.Any])
  }
}
