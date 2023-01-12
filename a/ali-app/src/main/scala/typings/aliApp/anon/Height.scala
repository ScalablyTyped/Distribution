package typings.aliApp.anon

import typings.aliApp.aliAppStrings.`Spacedown-mirrored`
import typings.aliApp.aliAppStrings.`left-mirrored`
import typings.aliApp.aliAppStrings.`lright-mirrored`
import typings.aliApp.aliAppStrings.`up-mirrored`
import typings.aliApp.aliAppStrings.bmp
import typings.aliApp.aliAppStrings.down
import typings.aliApp.aliAppStrings.gif
import typings.aliApp.aliAppStrings.heic
import typings.aliApp.aliAppStrings.hevc
import typings.aliApp.aliAppStrings.jpg
import typings.aliApp.aliAppStrings.left
import typings.aliApp.aliAppStrings.png
import typings.aliApp.aliAppStrings.right
import typings.aliApp.aliAppStrings.up
import typings.aliApp.aliAppStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height extends StObject {
  
  // 图片宽度（单位px）
  var height: Double
  
  // 图片本地路径
  var orientation: up | `up-mirrored` | down | `Spacedown-mirrored` | `left-mirrored` | right | `lright-mirrored` | left
  
  // 图片高度（单位px）
  var path: String
  
  var `type`: png | jpg | gif | webp | hevc | bmp | heic
  
  var width: Double
}
object Height {
  
  inline def apply(
    height: Double,
    orientation: up | `up-mirrored` | down | `Spacedown-mirrored` | `left-mirrored` | right | `lright-mirrored` | left,
    path: String,
    `type`: png | jpg | gif | webp | hevc | bmp | heic,
    width: Double
  ): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setOrientation(
      value: up | `up-mirrored` | down | `Spacedown-mirrored` | `left-mirrored` | right | `lright-mirrored` | left
    ): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setType(value: png | jpg | gif | webp | hevc | bmp | heic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
