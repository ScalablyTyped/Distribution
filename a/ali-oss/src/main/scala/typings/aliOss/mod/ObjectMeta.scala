package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectMeta extends StObject {
  
  /** object etag contains ", e.g.: "5B3C1A2E053D763E1B002CC607C5A0FE" */
  var etag: String
  
  /** object last modified GMT date, e.g.: 2015-02-19T08:39:44.000Z */
  var lastModified: String
  
  /** object name on oss */
  var name: String
  
  var owner: js.UndefOr[OwnerType] = js.undefined
  
  /** object size, e.g.: 344606 */
  var size: Double
  
  var storageClass: StorageType
  
  /** object type, e.g.: Normal */
  var `type`: String
  
  /** object url */
  var url: String
}
object ObjectMeta {
  
  inline def apply(
    etag: String,
    lastModified: String,
    name: String,
    size: Double,
    storageClass: StorageType,
    `type`: String,
    url: String
  ): ObjectMeta = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMeta]
  }
  
  extension [Self <: ObjectMeta](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: String): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: OwnerType): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setStorageClass(value: StorageType): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
