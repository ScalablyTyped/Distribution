package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrosshairLineCfg extends StObject {
  
  /**
    * 线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object CrosshairLineCfg {
  
  inline def apply(): CrosshairLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairLineCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrosshairLineCfg] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
