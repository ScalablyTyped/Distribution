package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrosshairLineCfg extends StObject {
  
  /**
    * 线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object CrosshairLineCfg {
  
  @scala.inline
  def apply(): CrosshairLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrosshairLineCfg]
  }
  
  @scala.inline
  implicit class CrosshairLineCfgMutableBuilder[Self <: CrosshairLineCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
