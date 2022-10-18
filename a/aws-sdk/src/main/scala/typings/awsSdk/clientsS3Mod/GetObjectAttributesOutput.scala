package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectAttributesOutput extends StObject {
  
  /**
    * The checksum or digest of the object.
    */
  var Checksum: js.UndefOr[typings.awsSdk.clientsS3Mod.Checksum] = js.undefined
  
  /**
    * Specifies whether the object retrieved was (true) or was not (false) a delete marker. If false, this response header does not appear in the response.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.DeleteMarker] = js.undefined
  
  /**
    * An ETag is an opaque identifier assigned by a web server to a specific version of a resource found at a URL.
    */
  var ETag: js.UndefOr[typings.awsSdk.clientsS3Mod.ETag] = js.undefined
  
  /**
    * The creation date of the object.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A collection of parts associated with a multipart upload.
    */
  var ObjectParts: js.UndefOr[GetObjectAttributesParts] = js.undefined
  
  /**
    * The size of the object in bytes.
    */
  var ObjectSize: js.UndefOr[typings.awsSdk.clientsS3Mod.ObjectSize] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * Provides the storage class information of the object. Amazon S3 returns this header for all objects except for S3 Standard storage class objects. For more information, see Storage Classes.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.clientsS3Mod.StorageClass] = js.undefined
  
  /**
    * The version ID of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object GetObjectAttributesOutput {
  
  inline def apply(): GetObjectAttributesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectAttributesOutput]
  }
  
  extension [Self <: GetObjectAttributesOutput](x: Self) {
    
    inline def setChecksum(value: Checksum): Self = StObject.set(x, "Checksum", value.asInstanceOf[js.Any])
    
    inline def setChecksumUndefined: Self = StObject.set(x, "Checksum", js.undefined)
    
    inline def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setObjectParts(value: GetObjectAttributesParts): Self = StObject.set(x, "ObjectParts", value.asInstanceOf[js.Any])
    
    inline def setObjectPartsUndefined: Self = StObject.set(x, "ObjectParts", js.undefined)
    
    inline def setObjectSize(value: ObjectSize): Self = StObject.set(x, "ObjectSize", value.asInstanceOf[js.Any])
    
    inline def setObjectSizeUndefined: Self = StObject.set(x, "ObjectSize", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
