package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartMediaInfoProperties extends StObject {
  
  /**
    * Defines the chart value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-mixins-ChartMediaInfo.html#value)
    */
  var value: js.UndefOr[ChartMediaInfoValueProperties] = js.native
}
object ChartMediaInfoProperties {
  
  @scala.inline
  def apply(): ChartMediaInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartMediaInfoProperties]
  }
  
  @scala.inline
  implicit class ChartMediaInfoPropertiesMutableBuilder[Self <: ChartMediaInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: ChartMediaInfoValueProperties): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
