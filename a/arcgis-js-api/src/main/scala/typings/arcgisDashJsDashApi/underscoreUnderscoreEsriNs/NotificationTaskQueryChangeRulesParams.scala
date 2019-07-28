package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskQueryChangeRulesParams extends Object {
  /**
    * A search string to find within change rule descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var description: String
  /**
    * A search string to find within change rule names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var name: String
  /**
    * The type of search to perform, default is contains.  **Possible Values:** contains | exact | starts-with | ends-with
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var searchType: String
  /**
    * The username requesting the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var user: String
}

object NotificationTaskQueryChangeRulesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    searchType: String,
    user: String
  ): NotificationTaskQueryChangeRulesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), searchType = searchType, user = user)
  
    __obj.asInstanceOf[NotificationTaskQueryChangeRulesParams]
  }
}

