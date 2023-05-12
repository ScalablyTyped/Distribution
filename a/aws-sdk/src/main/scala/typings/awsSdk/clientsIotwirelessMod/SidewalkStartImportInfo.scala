package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkStartImportInfo extends StObject {
  
  /**
    * The CSV file contained in an S3 bucket that's used for adding devices to an import task.
    */
  var DeviceCreationFile: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceCreationFile] = js.undefined
  
  /**
    * The IAM role that allows AWS IoT Wireless to access the CSV file in the S3 bucket.
    */
  var Role: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Role] = js.undefined
}
object SidewalkStartImportInfo {
  
  inline def apply(): SidewalkStartImportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkStartImportInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkStartImportInfo] (val x: Self) extends AnyVal {
    
    inline def setDeviceCreationFile(value: DeviceCreationFile): Self = StObject.set(x, "DeviceCreationFile", value.asInstanceOf[js.Any])
    
    inline def setDeviceCreationFileUndefined: Self = StObject.set(x, "DeviceCreationFile", js.undefined)
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
  }
}
