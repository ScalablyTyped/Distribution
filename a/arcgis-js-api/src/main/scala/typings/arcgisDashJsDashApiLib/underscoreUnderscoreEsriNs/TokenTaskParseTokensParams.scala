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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: js.Any,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    stringToParse: java.lang.String,
    user: java.lang.String
  ): TokenTaskParseTokensParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("stringToParse")(stringToParse)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[TokenTaskParseTokensParams]
  }
}

