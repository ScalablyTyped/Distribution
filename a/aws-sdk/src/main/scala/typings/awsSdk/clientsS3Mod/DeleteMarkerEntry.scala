package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMarkerEntry extends StObject {
  
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
    * The account that created the delete marker.&gt;
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsS3Mod.Owner] = js.undefined
  
  /**
    * Version ID of an object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object DeleteMarkerEntry {
  
  inline def apply(): DeleteMarkerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteMarkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMarkerEntry] (val x: Self) extends AnyVal {
    
    inline def setIsLatest(value: IsLatest): Self = StObject.set(x, "IsLatest", value.asInstanceOf[js.Any])
    
    inline def setIsLatestUndefined: Self = StObject.set(x, "IsLatest", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setLastModified(value: js.Date): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
