package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamInstanceProfileRole extends StObject {
  
  /**
    * The ARN of the role.
    */
  var Arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The policy that grants an entity permission to assume the role.
    */
  var AssumeRolePolicyDocument: js.UndefOr[AwsIamRoleAssumeRolePolicyDocument] = js.undefined
  
  /**
    * Indicates when the role was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreateDate: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The path to the role.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the role.
    */
  var RoleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the role.
    */
  var RoleName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamInstanceProfileRole {
  
  inline def apply(): AwsIamInstanceProfileRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamInstanceProfileRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsIamInstanceProfileRole] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setAssumeRolePolicyDocument(value: AwsIamRoleAssumeRolePolicyDocument): Self = StObject.set(x, "AssumeRolePolicyDocument", value.asInstanceOf[js.Any])
    
    inline def setAssumeRolePolicyDocumentUndefined: Self = StObject.set(x, "AssumeRolePolicyDocument", js.undefined)
    
    inline def setCreateDate(value: NonEmptyString): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setCreateDateUndefined: Self = StObject.set(x, "CreateDate", js.undefined)
    
    inline def setPath(value: NonEmptyString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setRoleId(value: NonEmptyString): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    inline def setRoleName(value: NonEmptyString): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
  }
}
