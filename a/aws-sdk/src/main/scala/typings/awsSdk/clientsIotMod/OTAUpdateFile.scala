package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OTAUpdateFile extends StObject {
  
  /**
    * A list of name/attribute pairs.
    */
  var attributes: js.UndefOr[AttributesMap] = js.undefined
  
  /**
    * The code signing method of the file.
    */
  var codeSigning: js.UndefOr[CodeSigning] = js.undefined
  
  /**
    * The location of the updated firmware.
    */
  var fileLocation: js.UndefOr[FileLocation] = js.undefined
  
  /**
    * The name of the file.
    */
  var fileName: js.UndefOr[FileName] = js.undefined
  
  /**
    * An integer value you can include in the job document to allow your devices to identify the type of file received from the cloud.
    */
  var fileType: js.UndefOr[FileType] = js.undefined
  
  /**
    * The file version.
    */
  var fileVersion: js.UndefOr[OTAUpdateFileVersion] = js.undefined
}
object OTAUpdateFile {
  
  inline def apply(): OTAUpdateFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OTAUpdateFile]
  }
  
  extension [Self <: OTAUpdateFile](x: Self) {
    
    inline def setAttributes(value: AttributesMap): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCodeSigning(value: CodeSigning): Self = StObject.set(x, "codeSigning", value.asInstanceOf[js.Any])
    
    inline def setCodeSigningUndefined: Self = StObject.set(x, "codeSigning", js.undefined)
    
    inline def setFileLocation(value: FileLocation): Self = StObject.set(x, "fileLocation", value.asInstanceOf[js.Any])
    
    inline def setFileLocationUndefined: Self = StObject.set(x, "fileLocation", js.undefined)
    
    inline def setFileName(value: FileName): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFileType(value: FileType): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    
    inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
    
    inline def setFileVersion(value: OTAUpdateFileVersion): Self = StObject.set(x, "fileVersion", value.asInstanceOf[js.Any])
    
    inline def setFileVersionUndefined: Self = StObject.set(x, "fileVersion", js.undefined)
  }
}
