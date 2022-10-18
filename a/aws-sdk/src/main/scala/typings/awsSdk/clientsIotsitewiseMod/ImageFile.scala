package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageFile extends StObject {
  
  /**
    * The image file contents, represented as a base64-encoded string. The file size must be less than 1 MB.
    */
  var data: ImageFileData
  
  /**
    * The file type of the image.
    */
  var `type`: ImageFileType
}
object ImageFile {
  
  inline def apply(data: ImageFileData, `type`: ImageFileType): ImageFile = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageFile]
  }
  
  extension [Self <: ImageFile](x: Self) {
    
    inline def setData(value: ImageFileData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: ImageFileType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
