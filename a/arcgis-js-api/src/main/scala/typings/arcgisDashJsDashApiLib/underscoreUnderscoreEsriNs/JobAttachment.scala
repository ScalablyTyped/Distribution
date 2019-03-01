package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAttachment
  extends stdLib.Object {
  /**
    * The name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var filename: java.lang.String
  /**
    * The file folder path or a URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var folder: java.lang.String
  /**
    * The unique id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var id: scala.Double
  /**
    * The storage type of the attachment.  **Possible Values:** linked-file | embedded | url
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var storageType: java.lang.String
}

object JobAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    filename: java.lang.String,
    folder: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    id: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    storageType: java.lang.String
  ): JobAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("folder")(folder)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("storageType")(storageType)
    __obj.asInstanceOf[JobAttachment]
  }
}

