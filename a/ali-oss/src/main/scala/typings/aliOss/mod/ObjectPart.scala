package typings.aliOss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPart extends StObject {
  
  // {Date} Time when a part is uploaded.
  var ETag: String
  
  var LastModified: js.Any
  
  var PartNumber: Double
  
  var size: Double
}
object ObjectPart {
  
  @scala.inline
  def apply(ETag: String, LastModified: js.Any, PartNumber: Double, size: Double): ObjectPart = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPart]
  }
  
  @scala.inline
  implicit class ObjectPartMutableBuilder[Self <: ObjectPart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: js.Any): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: Double): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
