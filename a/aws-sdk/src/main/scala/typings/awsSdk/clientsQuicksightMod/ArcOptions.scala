package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcOptions extends StObject {
  
  /**
    * The arc thickness of a GaugeChartVisual.
    */
  var ArcThickness: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ArcThickness] = js.undefined
}
object ArcOptions {
  
  inline def apply(): ArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcOptions] (val x: Self) extends AnyVal {
    
    inline def setArcThickness(value: ArcThickness): Self = StObject.set(x, "ArcThickness", value.asInstanceOf[js.Any])
    
    inline def setArcThicknessUndefined: Self = StObject.set(x, "ArcThickness", js.undefined)
  }
}
