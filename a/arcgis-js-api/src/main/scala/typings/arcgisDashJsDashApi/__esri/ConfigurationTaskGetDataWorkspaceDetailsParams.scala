package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTaskGetDataWorkspaceDetailsParams extends Object {
  /**
    * The unique id of the data workspace, whose version will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getDataWorkspaceDetails)
    */
  var dataWorkspaceId: String
  /**
    * The user name of the user who is requesting the information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getDataWorkspaceDetails)
    */
  var user: String
}

object ConfigurationTaskGetDataWorkspaceDetailsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataWorkspaceId: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): ConfigurationTaskGetDataWorkspaceDetailsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dataWorkspaceId = dataWorkspaceId.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigurationTaskGetDataWorkspaceDetailsParams]
  }
}

