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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    queryId: scala.Double,
    user: java.lang.String
  ): ConfigurationTaskGetUserJobQueryDetailsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), queryId = queryId, user = user)
  
    __obj.asInstanceOf[ConfigurationTaskGetUserJobQueryDetailsParams]
  }
}

