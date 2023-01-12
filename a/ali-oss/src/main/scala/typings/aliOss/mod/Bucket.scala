package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bucket extends StObject {
  
  var StorageClass: StorageType
  
  var creationDate: String
  
  var name: String
  
  var region: String
}
object Bucket {
  
  inline def apply(StorageClass: StorageType, creationDate: String, name: String, region: String): Bucket = {
    val __obj = js.Dynamic.literal(StorageClass = StorageClass.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setStorageClass(value: StorageType): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
  }
}
