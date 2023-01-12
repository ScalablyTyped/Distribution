package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavedFileInfoData extends StObject {
  
  /**
    * 创建时间
    */
  var createTime: Double
  
  /**
    * 文件大小，单位B
    */
  var size: Double
}
object SavedFileInfoData {
  
  inline def apply(createTime: Double, size: Double): SavedFileInfoData = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedFileInfoData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavedFileInfoData] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
