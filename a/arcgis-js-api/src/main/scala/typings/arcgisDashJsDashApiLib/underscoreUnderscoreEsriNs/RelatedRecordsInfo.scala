package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelatedRecordsInfo
  extends Accessor
     with JSONSupport {
  /**
    * An array of [FieldOrder](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo-FieldOrder.html) objects indicating the field display order for the related records and whether they should be sorted in ascending `asc` or descending `desc` order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo.html#orderByFields)
    */
  var orderByFields: js.Array[FieldOrder] = js.native
  /**
    * Indicates whether to display related records in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo.html#showRelatedRecords)
    */
  var showRelatedRecords: scala.Boolean = js.native
}

