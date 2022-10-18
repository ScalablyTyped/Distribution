package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageRecycleBinInfo extends StObject {
  
  /**
    * The description of the AMI.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the AMI.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time when the AMI entered the Recycle Bin.
    */
  var RecycleBinEnterTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the AMI is to be permanently deleted from the Recycle Bin.
    */
  var RecycleBinExitTime: js.UndefOr[js.Date] = js.undefined
}
object ImageRecycleBinInfo {
  
  inline def apply(): ImageRecycleBinInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageRecycleBinInfo]
  }
  
  extension [Self <: ImageRecycleBinInfo](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImageId(value: String): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
    
    inline def setImageIdUndefined: Self = StObject.set(x, "ImageId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRecycleBinEnterTime(value: js.Date): Self = StObject.set(x, "RecycleBinEnterTime", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinEnterTimeUndefined: Self = StObject.set(x, "RecycleBinEnterTime", js.undefined)
    
    inline def setRecycleBinExitTime(value: js.Date): Self = StObject.set(x, "RecycleBinExitTime", value.asInstanceOf[js.Any])
    
    inline def setRecycleBinExitTimeUndefined: Self = StObject.set(x, "RecycleBinExitTime", js.undefined)
  }
}
