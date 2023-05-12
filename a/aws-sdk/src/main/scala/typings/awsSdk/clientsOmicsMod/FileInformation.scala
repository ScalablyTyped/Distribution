package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileInformation extends StObject {
  
  /**
    * The file's content length.
    */
  var contentLength: js.UndefOr[FileInformationContentLengthLong] = js.undefined
  
  /**
    * The file's part size.
    */
  var partSize: js.UndefOr[FileInformationPartSizeLong] = js.undefined
  
  /**
    * The file's total parts.
    */
  var totalParts: js.UndefOr[FileInformationTotalPartsInteger] = js.undefined
}
object FileInformation {
  
  inline def apply(): FileInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileInformation] (val x: Self) extends AnyVal {
    
    inline def setContentLength(value: FileInformationContentLengthLong): Self = StObject.set(x, "contentLength", value.asInstanceOf[js.Any])
    
    inline def setContentLengthUndefined: Self = StObject.set(x, "contentLength", js.undefined)
    
    inline def setPartSize(value: FileInformationPartSizeLong): Self = StObject.set(x, "partSize", value.asInstanceOf[js.Any])
    
    inline def setPartSizeUndefined: Self = StObject.set(x, "partSize", js.undefined)
    
    inline def setTotalParts(value: FileInformationTotalPartsInteger): Self = StObject.set(x, "totalParts", value.asInstanceOf[js.Any])
    
    inline def setTotalPartsUndefined: Self = StObject.set(x, "totalParts", js.undefined)
  }
}
