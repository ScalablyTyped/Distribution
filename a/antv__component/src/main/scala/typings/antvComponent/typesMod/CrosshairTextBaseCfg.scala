package typings.antvComponent.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairTextBaseCfg extends StObject {
  
  /**
    * 文本内容
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * 距离线的距离
    * @type {number}
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * 文本位置，只支持 start， end
    * @type {string}
    */
  var position: js.UndefOr[String] = js.native
}
object CrosshairTextBaseCfg {
  
  @scala.inline
  def apply(): CrosshairTextBaseCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextBaseCfg]
  }
  
  @scala.inline
  implicit class CrosshairTextBaseCfgMutableBuilder[Self <: CrosshairTextBaseCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
