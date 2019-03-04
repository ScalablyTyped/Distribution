package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTaskGetUserJobQueryDetailsParams
  extends stdLib.Object {
  /**
    * The unique id of user query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUserJobQueryDetails)
    */
  var queryId: scala.Double
  /**
    * The user name of the user who is requesting the information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUserJobQueryDetails)
    */
  var user: java.lang.String
}

object ConfigurationTaskGetUserJobQueryDetailsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    queryId: scala.Double,
    user: java.lang.String
  ): ConfigurationTaskGetUserJobQueryDetailsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, queryId = queryId, user = user)
  
    __obj.asInstanceOf[ConfigurationTaskGetUserJobQueryDetailsParams]
  }
}

