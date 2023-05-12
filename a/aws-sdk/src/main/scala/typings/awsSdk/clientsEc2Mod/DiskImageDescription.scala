package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiskImageDescription extends StObject {
  
  /**
    * The checksum computed for the disk image.
    */
  var Checksum: js.UndefOr[String] = js.undefined
  
  /**
    * The disk image format.
    */
  var Format: js.UndefOr[DiskImageFormat] = js.undefined
  
  /**
    * A presigned URL for the import manifest stored in Amazon S3. For information about creating a presigned URL for an Amazon S3 object, read the "Query String Request Authentication Alternative" section of the Authenticating REST Requests topic in the Amazon Simple Storage Service Developer Guide. For information about the import manifest referenced by this API action, see VM Import Manifest.
    */
  var ImportManifestUrl: js.UndefOr[typings.awsSdk.clientsEc2Mod.ImportManifestUrl] = js.undefined
  
  /**
    * The size of the disk image, in GiB.
    */
  var Size: js.UndefOr[Long] = js.undefined
}
object DiskImageDescription {
  
  inline def apply(): DiskImageDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskImageDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiskImageDescription] (val x: Self) extends AnyVal {
    
    inline def setChecksum(value: String): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
    
    inline def setFormat(value: DiskImageFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setImportManifestUrl(value: ImportManifestUrl): Self = StObject.set(x, "ImportManifestUrl", value.asInstanceOf[js.Any])
    
    inline def setImportManifestUrlUndefined: Self = StObject.set(x, "ImportManifestUrl", js.undefined)
    
    inline def setSize(value: Long): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
