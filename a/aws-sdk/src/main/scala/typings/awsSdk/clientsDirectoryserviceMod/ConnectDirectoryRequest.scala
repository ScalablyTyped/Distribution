package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectDirectoryRequest extends StObject {
  
  /**
    * A DirectoryConnectSettings object that contains additional information for the operation.
    */
  var ConnectSettings: DirectoryConnectSettings
  
  /**
    * A description for the directory.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Description] = js.undefined
  
  /**
    * The fully qualified name of your self-managed directory, such as corp.example.com.
    */
  var Name: DirectoryName
  
  /**
    * The password for your self-managed user account.
    */
  var Password: ConnectPassword
  
  /**
    * The NetBIOS name of your self-managed directory, such as CORP.
    */
  var ShortName: js.UndefOr[DirectoryShortName] = js.undefined
  
  /**
    * The size of the directory.
    */
  var Size: DirectorySize
  
  /**
    * The tags to be assigned to AD Connector.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Tags] = js.undefined
}
object ConnectDirectoryRequest {
  
  inline def apply(
    ConnectSettings: DirectoryConnectSettings,
    Name: DirectoryName,
    Password: ConnectPassword,
    Size: DirectorySize
  ): ConnectDirectoryRequest = {
    val __obj = js.Dynamic.literal(ConnectSettings = ConnectSettings.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectDirectoryRequest]
  }
  
  extension [Self <: ConnectDirectoryRequest](x: Self) {
    
    inline def setConnectSettings(value: DirectoryConnectSettings): Self = StObject.set(x, "ConnectSettings", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: DirectoryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: ConnectPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setShortName(value: DirectoryShortName): Self = StObject.set(x, "ShortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameUndefined: Self = StObject.set(x, "ShortName", js.undefined)
    
    inline def setSize(value: DirectorySize): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
