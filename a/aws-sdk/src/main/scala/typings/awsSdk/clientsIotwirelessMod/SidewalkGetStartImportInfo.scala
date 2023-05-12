package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkGetStartImportInfo extends StObject {
  
  /**
    * List of Sidewalk devices that are added to the import task.
    */
  var DeviceCreationFileList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceCreationFileList] = js.undefined
  
  /**
    * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Role] = js.undefined
}
object SidewalkGetStartImportInfo {
  
  inline def apply(): SidewalkGetStartImportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkGetStartImportInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkGetStartImportInfo] (val x: Self) extends AnyVal {
    
    inline def setDeviceCreationFileList(value: DeviceCreationFileList): Self = StObject.set(x, "DeviceCreationFileList", value.asInstanceOf[js.Any])
    
    inline def setDeviceCreationFileListUndefined: Self = StObject.set(x, "DeviceCreationFileList", js.undefined)
    
    inline def setDeviceCreationFileListVarargs(value: DeviceCreationFile*): Self = StObject.set(x, "DeviceCreationFileList", js.Array(value*))
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
