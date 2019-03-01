package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataFile
  extends Accessor
     with JSONSupport {
  /**
    * The ID of the uploaded file returned as a result of the upload operation. For ArcGIS Server 10.1 and greater services that support uploads, this class can be used to specify an uploaded item as input by specifying the ItemID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#itemId)
    */
  var itemId: java.lang.String = js.native
  /**
    * URL to the location of the data file.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataFile.html#url)
    */
  var url: java.lang.String = js.native
}

