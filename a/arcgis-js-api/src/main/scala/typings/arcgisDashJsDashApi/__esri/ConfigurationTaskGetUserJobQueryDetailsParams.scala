package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigurationTaskGetUserJobQueryDetailsParams extends Object {
  /**
    * The unique id of user query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUserJobQueryDetails)
    */
  var queryId: Double
  /**
    * The user name of the user who is requesting the information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#getUserJobQueryDetails)
    */
  var user: String
}

object ConfigurationTaskGetUserJobQueryDetailsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    queryId: Double,
    user: String
  ): ConfigurationTaskGetUserJobQueryDetailsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), queryId = queryId, user = user)
  
    __obj.asInstanceOf[ConfigurationTaskGetUserJobQueryDetailsParams]
  }
}

