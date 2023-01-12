package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletedObject extends StObject {
  
  /**
    * Specifies whether the versioned object that was permanently deleted was (true) or was not (false) a delete marker. In a simple DELETE, this header indicates whether (true) or not (false) a delete marker was created.
    */
  var DeleteMarker: js.UndefOr[typings.awsSdk.clientsS3Mod.DeleteMarker] = js.undefined
  
  /**
    * The version ID of the delete marker created as a result of the DELETE operation. If you delete a specific object version, the value returned by this header is the version ID of the object version deleted.
    */
  var DeleteMarkerVersionId: js.UndefOr[typings.awsSdk.clientsS3Mod.DeleteMarkerVersionId] = js.undefined
  
  /**
    * The name of the deleted object.
    */
  var Key: js.UndefOr[ObjectKey] = js.undefined
  
  /**
    * The version ID of the deleted object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object DeletedObject {
  
  inline def apply(): DeletedObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeletedObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletedObject] (val x: Self) extends AnyVal {
    
    inline def setDeleteMarker(value: DeleteMarker): Self = StObject.set(x, "DeleteMarker", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerUndefined: Self = StObject.set(x, "DeleteMarker", js.undefined)
    
    inline def setDeleteMarkerVersionId(value: DeleteMarkerVersionId): Self = StObject.set(x, "DeleteMarkerVersionId", value.asInstanceOf[js.Any])
    
    inline def setDeleteMarkerVersionIdUndefined: Self = StObject.set(x, "DeleteMarkerVersionId", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
