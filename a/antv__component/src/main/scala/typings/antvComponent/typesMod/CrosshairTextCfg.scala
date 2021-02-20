package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairTextCfg extends CrosshairTextBaseCfg {
  
  /**
    * 是否自动旋转
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.native
  
  /**
    * 文本的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object CrosshairTextCfg {
  
  @scala.inline
  def apply(): CrosshairTextCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextCfg]
  }
  
  @scala.inline
  implicit class CrosshairTextCfgMutableBuilder[Self <: CrosshairTextCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
