package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApFilePath extends StObject {
  
  /** 文件路径 */
  var apFilePath: String
  
  /** 创建时间 */
  var createTime: Double
  
  /** 文件大小 */
  var size: Double
}
object ApFilePath {
  
  @scala.inline
  def apply(apFilePath: String, createTime: Double, size: Double): ApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any], createTime = createTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePath]
  }
  
  @scala.inline
  implicit class ApFilePathMutableBuilder[Self <: ApFilePath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
