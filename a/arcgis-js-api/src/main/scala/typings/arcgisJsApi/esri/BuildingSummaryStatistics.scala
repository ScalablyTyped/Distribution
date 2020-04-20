package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildingSummaryStatistics
  extends Accessor
     with Loadable
     with JSONSupport {
  /**
    * An array of statistics on all fields in all sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-BuildingSummaryStatistics.html#fields)
    */
  var fields: js.Array[BuildingFieldStatistics] = js.native
}

@JSGlobal("__esri.BuildingSummaryStatistics")
@js.native
object BuildingSummaryStatistics extends TopLevel[BuildingSummaryStatisticsConstructor]

