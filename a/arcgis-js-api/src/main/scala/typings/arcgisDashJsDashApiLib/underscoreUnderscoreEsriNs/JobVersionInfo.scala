package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobVersionInfo
  extends stdLib.Object {
  /**
    * Indicates whether the version has been created or not.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var created: scala.Boolean
  /**
    * The unique id of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The name of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var name: java.lang.String
  /**
    * The name of the version owner.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var owner: java.lang.String
  /**
    * The parent version of the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobVersionInfo)
    */
  var parent: java.lang.String
}

object JobVersionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    created: scala.Boolean,
    dataWorkspaceId: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    name: java.lang.String,
    owner: java.lang.String,
    parent: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): JobVersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("dataWorkspaceId")(dataWorkspaceId)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[JobVersionInfo]
  }
}

