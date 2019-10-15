package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeDomain extends Domain {
  /**
    * The maximum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#maxValue)
    */
  var maxValue: Double = js.native
  /**
    * The minimum valid value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#minValue)
    */
  var minValue: Double = js.native
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html#type)
    */
  @JSName("type")
  val type_RangeDomain: range = js.native
}

@JSGlobal("__esri.RangeDomain")
@js.native
object RangeDomain extends TopLevel[RangeDomainConstructor]

