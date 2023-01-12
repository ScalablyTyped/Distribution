package typings.antvComponent.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairTextBaseCfg extends StObject {
  
  /**
    * 文本内容
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * 距离线的距离
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * 文本位置，只支持 start， end
    * @type {string}
    */
  var position: js.UndefOr[String] = js.undefined
}
object CrosshairTextBaseCfg {
  
  inline def apply(): CrosshairTextBaseCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextBaseCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrosshairTextBaseCfg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
