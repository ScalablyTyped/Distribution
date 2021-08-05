package typings.aliApp.my

import typings.aliApp.aliAppStrings.more
import typings.aliApp.aliAppStrings.none
import typings.aliApp.aliAppStrings.num
import typings.aliApp.aliAppStrings.point
import typings.aliApp.aliAppStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Badge extends StObject {
  
  /** 需要飘红的选项的索引，从0开始 */
  var index: Double
  
  /**
    * 自定义飘红文案：
    *
    * 1、type为none/point/more时本文案可不填
    * 2、type为num时本文案为小数或<=0均不显示, >100 显示"..."
    */
  var text: String
  
  /**
    * 飘红类型，支持 none（无红点）/ point（纯红点） / num（数字红点）/ text（文案红点）/ more（...）
    *
    */
  var `type`: none | point | num | text | more | String
}
object Badge {
  
  inline def apply(index: Double, text: String, `type`: none | point | num | text | more | String): Badge = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  extension [Self <: Badge](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setType(value: none | point | num | text | more | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
