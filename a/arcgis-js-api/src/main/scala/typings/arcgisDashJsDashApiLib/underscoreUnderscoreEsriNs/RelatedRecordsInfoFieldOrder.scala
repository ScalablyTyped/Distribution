package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedRecordsInfoFieldOrder
  extends Accessor
     with JSONSupport {
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * Set the ascending or descending sort order of the returned related records.  **Possible Values**: asc | desc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-support-RelatedRecordsInfoFieldOrder.html#order)
    */
  var order: java.lang.String = js.native
}

@JSGlobal("__esri.RelatedRecordsInfoFieldOrder")
@js.native
class RelatedRecordsInfoFieldOrderCls () extends RelatedRecordsInfoFieldOrder {
  def this(properties: RelatedRecordsInfoFieldOrderProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

