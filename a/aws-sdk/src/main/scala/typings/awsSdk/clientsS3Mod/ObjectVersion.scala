package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectVersion extends StObject {
  
  /**
    * The algorithm that was used to create a checksum of the object.
    */
  var ChecksumAlgorithm: js.UndefOr[ChecksumAlgorithmList] = js.undefined
  
  /**
    * The entity tag is an MD5 hash of that version of the object.
    */
  var ETag: js.UndefOr[typings.awsSdk.clientsS3Mod.ETag] = js.undefined
  
  /**
    * Specifies whether the object is (true) or is not (false) the latest version of an object.
    */
  var IsLatest: js.UndefOr[typings.awsSdk.clientsS3Mod.IsLatest] = js.undefined
  
  /**
    * The object key.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  
  /**
    * Date and time the object was last modified.
    */
  var LastModified: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the owner of the object.
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsS3Mod.Owner] = js.undefined
  
  /**
    * Size in bytes of the object.
    */
  var Size: js.UndefOr[typings.awsSdk.clientsS3Mod.Size] = js.undefined
  
  /**
    * The class of storage used to store the object.
    */
  var StorageClass: js.UndefOr[ObjectVersionStorageClass] = js.undefined
  
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object ObjectVersion {
  
  inline def apply(): ObjectVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectVersion]
  }
  
  extension [Self <: ObjectVersion](x: Self) {
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithmList): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setChecksumAlgorithmVarargs(value: ChecksumAlgorithm*): Self = StObject.set(x, "ChecksumAlgorithm", js.Array(value*))
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setIsLatest(value: IsLatest): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
    
    inline def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setSize(value: Size): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setStorageClass(value: ObjectVersionStorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
