package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationTaskQueryChangeRulesParams
  extends stdLib.Object {
  /**
    * A search string to find within change rule descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var description: java.lang.String
  /**
    * A search string to find within change rule names.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var name: java.lang.String
  /**
    * The type of search to perform, default is contains.  **Possible Values:** contains | exact | starts-with | ends-with
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var searchType: java.lang.String
  /**
    * The username requesting the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#queryChangeRules)
    */
  var user: java.lang.String
}

object NotificationTaskQueryChangeRulesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    name: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    searchType: java.lang.String,
    user: java.lang.String
  ): NotificationTaskQueryChangeRulesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), searchType = searchType, user = user)
  
    __obj.asInstanceOf[NotificationTaskQueryChangeRulesParams]
  }
}

