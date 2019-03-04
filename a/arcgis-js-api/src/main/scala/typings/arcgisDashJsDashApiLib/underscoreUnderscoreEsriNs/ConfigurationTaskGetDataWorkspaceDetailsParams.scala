package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTaskGetDataWorkspaceDetailsParams
  extends stdLib.Object {
  /**
    * The unique id of the data workspace, whose version will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getDataWorkspaceDetails)
    */
  var dataWorkspaceId: java.lang.String
  /**
    * The user name of the user who is requesting the information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getDataWorkspaceDetails)
    */
  var user: java.lang.String
}

object ConfigurationTaskGetDataWorkspaceDetailsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataWorkspaceId: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): ConfigurationTaskGetDataWorkspaceDetailsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataWorkspaceId = dataWorkspaceId, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[ConfigurationTaskGetDataWorkspaceDetailsParams]
  }
}

