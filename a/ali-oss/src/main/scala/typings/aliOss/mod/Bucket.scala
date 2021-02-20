package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends StObject {
  
  var StorageClass: StorageType = js.native
  
  var creationDate: String = js.native
  
  var name: String = js.native
  
  var region: String = js.native
}
object Bucket {
  
  @scala.inline
  def apply(StorageClass: StorageType, creationDate: String, name: String, region: String): Bucket = {
    val __obj = js.Dynamic.literal(StorageClass = StorageClass.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketMutableBuilder[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageClass(value: StorageType): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
  }
}
