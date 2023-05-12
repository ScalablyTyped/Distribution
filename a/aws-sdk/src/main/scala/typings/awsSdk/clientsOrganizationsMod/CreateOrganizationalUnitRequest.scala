package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrganizationalUnitRequest extends StObject {
  
  /**
    * The friendly name to assign to the new OU.
    */
  var Name: OrganizationalUnitName
  
  /**
    * The unique identifier (ID) of the parent root or OU that you want to create the new OU in. The regex pattern for a parent ID string requires one of the following:    Root - A string that begins with "r-" followed by from 4 to 32 lowercase letters or digits.    Organizational unit (OU) - A string that begins with "ou-" followed by from 4 to 32 lowercase letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lowercase letters or digits.  
    */
  var ParentId: typings.awsSdk.clientsOrganizationsMod.ParentId
  
  /**
    * A list of tags that you want to attach to the newly created OU. For each tag in the list, you must specify both a tag key and a value. You can set the value to an empty string, but you can't set it to null. For more information about tagging, see Tagging Organizations resources in the Organizations User Guide.  If any one of the tags is not valid or if you exceed the allowed number of tags for an OU, then the entire request fails and the OU is not created. 
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.Tags] = js.undefined
}
object CreateOrganizationalUnitRequest {
  
  inline def apply(Name: OrganizationalUnitName, ParentId: ParentId): CreateOrganizationalUnitRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], ParentId = ParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrganizationalUnitRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOrganizationalUnitRequest] (val x: Self) extends AnyVal {
    
    inline def setName(value: OrganizationalUnitName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setParentId(value: ParentId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
