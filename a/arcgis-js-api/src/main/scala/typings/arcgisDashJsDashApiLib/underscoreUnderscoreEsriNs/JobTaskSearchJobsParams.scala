package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskSearchJobsParams
  extends stdLib.Object {
  /**
    * The text which will be used to perform the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#searchJobs)
    */
  var text: java.lang.String
  /**
    * The username of the user who is requesting search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#searchJobs)
    */
  var user: java.lang.String
}

object JobTaskSearchJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    text: java.lang.String,
    user: java.lang.String
  ): JobTaskSearchJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, text = text, user = user)
  
    __obj.asInstanceOf[JobTaskSearchJobsParams]
  }
}

