package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object waterWaveMod {
  
  @JSImport("ant-design-pro/lib/Charts/WaterWave", JSImport.Default)
  @js.native
  class default ()
    extends Component[IWaterWaveProps, js.Any, js.Any]
  
  @js.native
  trait IWaterWaveProps extends StObject {
    
    var color: js.UndefOr[String] = js.native
    
    var height: Double = js.native
    
    var percent: Double = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: ReactNode = js.native
  }
  object IWaterWaveProps {
    
    @scala.inline
    def apply(height: Double, percent: Double): IWaterWaveProps = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWaterWaveProps]
    }
    
    @scala.inline
    implicit class IWaterWavePropsMutableBuilder[Self <: IWaterWaveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type WaterWave = Component[IWaterWaveProps, js.Any, js.Any]
}
