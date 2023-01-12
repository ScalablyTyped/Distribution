package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApFilePath extends StObject {
  
  /** 视频文件路径 */
  var apFilePath: String
  
  var creationDate: Double
  
  /** 选定视频的时间长度，单位秒 */
  var duration: Double
  
  /** 选定视频的高 */
  var height: Double
  
  var modifyDate: Double
  
  var scene: String
  
  /** 选定视频的数据量大小 */
  var size: Double
  
  var tempVideoThumbPath: String
  
  /** 选定视频的宽 */
  var width: Double
}
object ApFilePath {
  
  inline def apply(
    apFilePath: String,
    creationDate: Double,
    duration: Double,
    height: Double,
    modifyDate: Double,
    scene: String,
    size: Double,
    tempVideoThumbPath: String,
    width: Double
  ): ApFilePath = {
    val __obj = js.Dynamic.literal(apFilePath = apFilePath.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], modifyDate = modifyDate.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tempVideoThumbPath = tempVideoThumbPath.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApFilePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApFilePath] (val x: Self) extends AnyVal {
    
    inline def setApFilePath(value: String): Self = StObject.set(x, "apFilePath", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setModifyDate(value: Double): Self = StObject.set(x, "modifyDate", value.asInstanceOf[js.Any])
    
    inline def setScene(value: String): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTempVideoThumbPath(value: String): Self = StObject.set(x, "tempVideoThumbPath", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
