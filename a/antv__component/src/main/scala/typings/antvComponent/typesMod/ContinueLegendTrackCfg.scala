package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinueLegendTrackCfg extends StObject {
  
  /**
    * 选定范围的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object ContinueLegendTrackCfg {
  
  @scala.inline
  def apply(): ContinueLegendTrackCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendTrackCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendTrackCfgMutableBuilder[Self <: ContinueLegendTrackCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
