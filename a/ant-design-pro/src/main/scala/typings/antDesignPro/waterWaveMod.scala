package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterWaveMod {
  
  @JSImport("ant-design-pro/lib/Charts/WaterWave", JSImport.Default)
  @js.native
  open class default () extends Component[IWaterWaveProps, Any, Any]
  
  trait IWaterWaveProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var height: Double
    
    var percent: Double
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: ReactNode
  }
  object IWaterWaveProps {
    
    inline def apply(height: Double, percent: Double): IWaterWaveProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWaterWaveProps]
    }
    
    extension [Self <: IWaterWaveProps](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type WaterWave = Component[IWaterWaveProps, Any, Any]
}
