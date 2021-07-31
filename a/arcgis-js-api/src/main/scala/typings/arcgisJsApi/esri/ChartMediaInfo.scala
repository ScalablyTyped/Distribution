package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartMediaInfo extends StObject {
  
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: ChartMediaInfoValue
}
object ChartMediaInfo {
  
  @scala.inline
  def apply(value: ChartMediaInfoValue): ChartMediaInfo = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartMediaInfo]
  }
  
  @scala.inline
  implicit class ChartMediaInfoMutableBuilder[Self <: ChartMediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: ChartMediaInfoValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
