package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobAttachment extends Object {
  /**
    * The name of the file attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var filename: String
  /**
    * The file folder path or a URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var folder: String
  /**
    * The unique id of the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var id: Double
  /**
    * The storage type of the attachment.  **Possible Values:** linked-file | embedded | url
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobAttachment)
    */
  var storageType: String
}

object JobAttachment {
  @scala.inline
  def apply(
    constructor: js.Function,
    filename: String,
    folder: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    storageType: String
  ): JobAttachment = {
    val __obj = js.Dynamic.literal(constructor = constructor, filename = filename, folder = folder, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), storageType = storageType)
  
    __obj.asInstanceOf[JobAttachment]
  }
}

