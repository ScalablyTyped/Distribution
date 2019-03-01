package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldOrder
  extends Accessor
     with JSONSupport {
  /**
    * The attribute value of the field selected that will drive the sorting of related records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo-FieldOrder.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * Set the ascending or descending sort order of the returned related records.  **Possible Values**: asc | desc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-RelatedRecordsInfo-FieldOrder.html#order)
    */
  var order: java.lang.String = js.native
}

