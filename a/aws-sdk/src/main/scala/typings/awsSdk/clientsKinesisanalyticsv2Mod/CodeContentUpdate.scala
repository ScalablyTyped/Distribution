package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeContentUpdate extends StObject {
  
  /**
    * Describes an update to the location of code for an application.
    */
  var S3ContentLocationUpdate: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.S3ContentLocationUpdate] = js.undefined
  
  /**
    * Describes an update to the text code for an application.
    */
  var TextContentUpdate: js.UndefOr[TextContent] = js.undefined
  
  /**
    * Describes an update to the zipped code for an application.
    */
  var ZipFileContentUpdate: js.UndefOr[ZipFileContent] = js.undefined
}
object CodeContentUpdate {
  
  inline def apply(): CodeContentUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeContentUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeContentUpdate] (val x: Self) extends AnyVal {
    
    inline def setS3ContentLocationUpdate(value: S3ContentLocationUpdate): Self = StObject.set(x, "S3ContentLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setS3ContentLocationUpdateUndefined: Self = StObject.set(x, "S3ContentLocationUpdate", js.undefined)
    
    inline def setTextContentUpdate(value: TextContent): Self = StObject.set(x, "TextContentUpdate", value.asInstanceOf[js.Any])
    
    inline def setTextContentUpdateUndefined: Self = StObject.set(x, "TextContentUpdate", js.undefined)
    
    inline def setZipFileContentUpdate(value: ZipFileContent): Self = StObject.set(x, "ZipFileContentUpdate", value.asInstanceOf[js.Any])
    
    inline def setZipFileContentUpdateUndefined: Self = StObject.set(x, "ZipFileContentUpdate", js.undefined)
  }
}
