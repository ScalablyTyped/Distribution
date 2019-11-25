package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobVersionInfo extends Object {
  /**
    * Indicates whether the version has been created or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var created: Boolean
  /**
    * The unique id of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var dataWorkspaceId: String
  /**
    * The name of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var name: String
  /**
    * The name of the version owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var owner: String
  /**
    * The parent version of the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var parent: String
}

object JobVersionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    created: Boolean,
    dataWorkspaceId: String,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    owner: String,
    parent: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): JobVersionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], dataWorkspaceId = dataWorkspaceId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobVersionInfo]
  }
}

