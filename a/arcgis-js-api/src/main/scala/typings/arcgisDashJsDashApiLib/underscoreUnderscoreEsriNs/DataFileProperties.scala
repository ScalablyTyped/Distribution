package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFileProperties extends js.Object {
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater services that support uploads, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#itemId)
    */
  var itemId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * URL to the location of the data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DataFileProperties {
  @scala.inline
  def apply(itemId: java.lang.String = null, url: java.lang.String = null): DataFileProperties = {
    val __obj = js.Dynamic.literal()
    if (itemId != null) __obj.updateDynamic("itemId")(itemId)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DataFileProperties]
  }
}

