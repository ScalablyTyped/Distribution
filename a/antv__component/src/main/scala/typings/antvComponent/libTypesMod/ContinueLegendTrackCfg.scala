package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
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
  
  inline def apply(): ContinueLegendTrackCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendTrackCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContinueLegendTrackCfg] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
