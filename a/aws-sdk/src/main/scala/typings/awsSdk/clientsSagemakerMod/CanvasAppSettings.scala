package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasAppSettings extends StObject {
  
  /**
    * Time series forecast settings for the Canvas app.
    */
  var TimeSeriesForecastingSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.TimeSeriesForecastingSettings] = js.undefined
}
object CanvasAppSettings {
  
  inline def apply(): CanvasAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasAppSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasAppSettings] (val x: Self) extends AnyVal {
    
    inline def setTimeSeriesForecastingSettings(value: TimeSeriesForecastingSettings): Self = StObject.set(x, "TimeSeriesForecastingSettings", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesForecastingSettingsUndefined: Self = StObject.set(x, "TimeSeriesForecastingSettings", js.undefined)
  }
}
