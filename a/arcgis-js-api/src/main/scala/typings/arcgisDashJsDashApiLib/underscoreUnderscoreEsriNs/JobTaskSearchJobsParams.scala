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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    text: java.lang.String,
    user: java.lang.String
  ): JobTaskSearchJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), text = text, user = user)
  
    __obj.asInstanceOf[JobTaskSearchJobsParams]
  }
}

