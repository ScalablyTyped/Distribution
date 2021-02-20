package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendHandlerCfg extends StObject {
  
  /**
    * 滑块大小
    * @type {number}
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * 滑块样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object ContinueLegendHandlerCfg {
  
  @scala.inline
  def apply(): ContinueLegendHandlerCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendHandlerCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendHandlerCfgMutableBuilder[Self <: ContinueLegendHandlerCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
