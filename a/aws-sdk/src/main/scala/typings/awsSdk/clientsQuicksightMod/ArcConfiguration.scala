package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcConfiguration extends StObject {
  
  /**
    * The option that determines the arc angle of a GaugeChartVisual.
    */
  var ArcAngle: js.UndefOr[Double] = js.undefined
  
  /**
    * The options that determine the arc thickness of a GaugeChartVisual.
    */
  var ArcThickness: js.UndefOr[ArcThicknessOptions] = js.undefined
}
object ArcConfiguration {
  
  inline def apply(): ArcConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcConfiguration] (val x: Self) extends AnyVal {
    
    inline def setArcAngle(value: Double): Self = StObject.set(x, "ArcAngle", value.asInstanceOf[js.Any])
    
    inline def setArcAngleUndefined: Self = StObject.set(x, "ArcAngle", js.undefined)
    
    inline def setArcThickness(value: ArcThicknessOptions): Self = StObject.set(x, "ArcThickness", value.asInstanceOf[js.Any])
    
    inline def setArcThicknessUndefined: Self = StObject.set(x, "ArcThickness", js.undefined)
  }
}
