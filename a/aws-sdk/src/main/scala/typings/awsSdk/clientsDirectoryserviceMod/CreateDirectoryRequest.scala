package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDirectoryRequest extends StObject {
  
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Description] = js.undefined
  
  /**
    * The fully qualified name for the directory, such as corp.example.com.
    */
  var Name: DirectoryName
  
  /**
    * The password for the directory administrator. The directory creation process creates a directory administrator account with the user name Administrator and this password. If you need to change the password for the administrator account, you can use the ResetUserPassword API call. The regex pattern for this string is made up of the following conditions:   Length (?=^.{8,64}$) – Must be between 8 and 64 characters   AND any 3 of the following password complexity rules required by Active Directory:   Numbers and upper case and lowercase (?=.*\d)(?=.*[A-Z])(?=.*[a-z])   Numbers and special characters and lower case (?=.*\d)(?=.*[^A-Za-z0-9\s])(?=.*[a-z])   Special characters and upper case and lower case (?=.*[^A-Za-z0-9\s])(?=.*[A-Z])(?=.*[a-z])   Numbers and upper case and special characters (?=.*\d)(?=.*[A-Z])(?=.*[^A-Za-z0-9\s])   For additional information about how Active Directory passwords are enforced, see Password must meet complexity requirements on the Microsoft website.
    */
  var Password: typings.awsSdk.clientsDirectoryserviceMod.Password
  
  /**
    * The NetBIOS name of the directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  
  /**
    * The size of the directory.
    */
  var Size: DirectorySize
  
  /**
    * The tags to be assigned to the Simple AD directory.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Tags] = js.undefined
  
  /**
    * A DirectoryVpcSettings object that contains additional information for the operation.
    */
  var VpcSettings: js.UndefOr[DirectoryVpcSettings] = js.undefined
}
object CreateDirectoryRequest {
  
  inline def apply(Name: DirectoryName, Password: Password, Size: DirectorySize): CreateDirectoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: DirectoryShortName): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    inline def setSize(value: DirectorySize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcSettings(value: DirectoryVpcSettings): Self = StObject.set(x, "VpcSettings", value.asInstanceOf[js.Any])
    
    inline def setVpcSettingsUndefined: Self = StObject.set(x, "VpcSettings", js.undefined)
  }
}
