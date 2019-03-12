package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenTaskParseTokensParams
  extends stdLib.Object {
  /**
    * A unique id for the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-TokenTask.html#parseTokens)
    */
  var jobId: js.Any
  /**
    * The string representing the tokens to be parsed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-TokenTask.html#parseTokens)
    */
  var stringToParse: java.lang.String
  /**
    * The username of the user requesting token parsing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-TokenTask.html#parseTokens)
    */
  var user: java.lang.String
}

object TokenTaskParseTokensParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: js.Any,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    stringToParse: java.lang.String,
    user: java.lang.String
  ): TokenTaskParseTokensParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), stringToParse = stringToParse, user = user)
  
    __obj.asInstanceOf[TokenTaskParseTokensParams]
  }
}

