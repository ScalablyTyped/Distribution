package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairTextCfg
  extends StObject
     with CrosshairTextBaseCfg {
  
  /**
    * 是否自动旋转
    * @type {boolean}
    */
  var autoRotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 文本的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object CrosshairTextCfg {
  
  inline def apply(): CrosshairTextCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairTextCfg]
  }
  
  extension [Self <: CrosshairTextCfg](x: Self) {
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
    
    inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
