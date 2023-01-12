package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreationDate extends StObject {
  
  /** 创建时间 时间戳 */
  var creationDate: Double
  
  /** 文件路径 */
  var path: String
  
  /** 文件大小 */
  var size: Double
}
object CreationDate {
  
  inline def apply(creationDate: Double, path: String, size: Double): CreationDate = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreationDate] (val x: Self) extends AnyVal {
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
