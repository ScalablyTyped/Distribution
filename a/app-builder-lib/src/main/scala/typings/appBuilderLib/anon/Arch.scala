package typings.appBuilderLib.anon

import org.scalablytyped.runtime.StringDictionary
import typings.appBuilderLib.appBuilderLibStrings.FAILED
import typings.appBuilderLib.appBuilderLibStrings.UPLOADED
import typings.appBuilderLib.appBuilderLibStrings.WAITING
import typings.appBuilderLib.appBuilderLibStrings.YANKED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arch extends StObject {
  
  var arch: String | Null
  
  var checksum: String | Null
  
  var created: String
  
  var filename: String
  
  var filesize: Double | Null
  
  var filetype: String | Null
  
  var metadata: StringDictionary[Any]
  
  var platform: String | Null
  
  var signature: String | Null
  
  var status: WAITING | UPLOADED | FAILED | YANKED
  
  var updated: String
}
object Arch {
  
  inline def apply(
    created: String,
    filename: String,
    metadata: StringDictionary[Any],
    status: WAITING | UPLOADED | FAILED | YANKED,
    updated: String
  ): Arch = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], arch = null, checksum = null, filesize = null, filetype = null, platform = null, signature = null)
    __obj.asInstanceOf[Arch]
  }
  
  extension [Self <: Arch](x: Self) {
    
    inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setArchNull: Self = StObject.set(x, "arch", null)
    
    inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumNull: Self = StObject.set(x, "checksum", null)
    
    inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilesize(value: Double): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
    
    inline def setFilesizeNull: Self = StObject.set(x, "filesize", null)
    
    inline def setFiletype(value: String): Self = StObject.set(x, "filetype", value.asInstanceOf[js.Any])
    
    inline def setFiletypeNull: Self = StObject.set(x, "filetype", null)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    inline def setPlatformNull: Self = StObject.set(x, "platform", null)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setStatus(value: WAITING | UPLOADED | FAILED | YANKED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
  }
}
