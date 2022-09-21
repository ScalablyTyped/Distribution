package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPart extends StObject {
  
  var ETag: String
  
  /** {Date} Time when a part is uploaded. */
  var LastModified: Any
  
  var PartNumber: Double
  
  var size: Double
}
object ObjectPart {
  
  inline def apply(ETag: String, LastModified: Any, PartNumber: Double, size: Double): ObjectPart = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPart]
  }
  
  extension [Self <: ObjectPart](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setLastModified(value: Any): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    inline def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
