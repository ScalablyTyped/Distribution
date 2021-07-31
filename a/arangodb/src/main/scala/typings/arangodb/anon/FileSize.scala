package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSize extends StObject {
  
  var count: Double
  
  var fileSize: Double
}
object FileSize {
  
  @scala.inline
  def apply(count: Double, fileSize: Double): FileSize = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSize]
  }
  
  @scala.inline
  implicit class FileSizeMutableBuilder[Self <: FileSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
  }
}
