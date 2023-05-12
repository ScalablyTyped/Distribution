package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SidewalkUpdateImportInfo extends StObject {
  
  /**
    * The CSV file contained in an S3 bucket that's used for appending devices to an existing import task.
    */
  var DeviceCreationFile: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.DeviceCreationFile] = js.undefined
}
object SidewalkUpdateImportInfo {
  
  inline def apply(): SidewalkUpdateImportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SidewalkUpdateImportInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SidewalkUpdateImportInfo] (val x: Self) extends AnyVal {
    
    inline def setDeviceCreationFile(value: DeviceCreationFile): Self = StObject.set(x, "DeviceCreationFile", value.asInstanceOf[js.Any])
    
    inline def setDeviceCreationFileUndefined: Self = StObject.set(x, "DeviceCreationFile", js.undefined)
  }
}
