package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbClusterAssociatedRole extends StObject {
  
  /**
    * The ARN of the IAM role.
    */
  var RoleArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the association between the IAM role and the DB cluster. Valid values are as follows:    ACTIVE     INVALID     PENDING   
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbClusterAssociatedRole {
  
  inline def apply(): AwsRdsDbClusterAssociatedRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbClusterAssociatedRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsRdsDbClusterAssociatedRole] (val x: Self) extends AnyVal {
    
    inline def setRoleArn(value: NonEmptyString): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
