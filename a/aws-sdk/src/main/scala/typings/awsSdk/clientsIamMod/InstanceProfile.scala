package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceProfile extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) specifying the instance profile. For more information about ARNs and how to use them in policies, see IAM identifiers in the IAM User Guide. 
    */
  var Arn: arnType
  
  /**
    * The date when the instance profile was created.
    */
  var CreateDate: js.Date
  
  /**
    *  The stable and unique string identifying the instance profile. For more information about IDs, see IAM identifiers in the IAM User Guide. 
    */
  var InstanceProfileId: idType
  
  /**
    * The name identifying the instance profile.
    */
  var InstanceProfileName: instanceProfileNameType
  
  /**
    *  The path to the instance profile. For more information about paths, see IAM identifiers in the IAM User Guide. 
    */
  var Path: pathType
  
  /**
    * The role associated with the instance profile.
    */
  var Roles: roleListType
  
  /**
    * A list of tags that are attached to the instance profile. For more information about tagging, see Tagging IAM resources in the IAM User Guide.
    */
  var Tags: js.UndefOr[tagListType] = js.undefined
}
object InstanceProfile {
  
  inline def apply(
    Arn: arnType,
    CreateDate: js.Date,
    InstanceProfileId: idType,
    InstanceProfileName: instanceProfileNameType,
    Path: pathType,
    Roles: roleListType
  ): InstanceProfile = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], CreateDate = CreateDate.asInstanceOf[js.Any], InstanceProfileId = InstanceProfileId.asInstanceOf[js.Any], InstanceProfileName = InstanceProfileName.asInstanceOf[js.Any], Path = Path.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceProfile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceProfile] (val x: Self) extends AnyVal {
    
    inline def setArn(value: arnType): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreateDate(value: js.Date): Self = StObject.set(x, "CreateDate", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileId(value: idType): Self = StObject.set(x, "InstanceProfileId", value.asInstanceOf[js.Any])
    
    inline def setInstanceProfileName(value: instanceProfileNameType): Self = StObject.set(x, "InstanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: roleListType): Self = StObject.set(x, "Roles", value.asInstanceOf[js.Any])
    
    inline def setRolesVarargs(value: Role*): Self = StObject.set(x, "Roles", js.Array(value*))
    
    inline def setTags(value: tagListType): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
