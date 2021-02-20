package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnChartMediaInfo
  extends JSONSupport
     with MediaInfo
     with ChartMediaInfo {
  
  /**
    * Indicates the type of chart.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-ColumnChartMediaInfo.html#type)
    */
  val `type`: String = js.native
}
object ColumnChartMediaInfo {
  
  @scala.inline
  def apply(
    altText: String,
    caption: String,
    title: String,
    toJSON: () => js.Any,
    `type`: String,
    value: ChartMediaInfoValue
  ): ColumnChartMediaInfo = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnChartMediaInfo]
  }
  
  @scala.inline
  implicit class ColumnChartMediaInfoMutableBuilder[Self <: ColumnChartMediaInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
