package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendBackgroundCfg extends StObject {
  
  /**
    * @type {number|number[]}
    * 背景的留白
    */
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * @type {ShapeAttrs}
    * 背景配置项
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object LegendBackgroundCfg {
  
  inline def apply(): LegendBackgroundCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendBackgroundCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendBackgroundCfg] (val x: Self) extends AnyVal {
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
