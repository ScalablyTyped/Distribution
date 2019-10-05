package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TokenTask extends Task {
  /**
    * Parses a string with embedded tokens using user and job information. The string is returned with embedded tokens replaced by their actual values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-TokenTask.html#parseTokens)
    *
    * @param params See the object specifications in table below for the structure of the `params` object.
    * @param params.jobId A unique id for the job.
    * @param params.stringToParse The string representing the tokens to be parsed.
    * @param params.user The username of the user requesting token parsing.
    * @param requestOptions Additional [options](https://developers.arcgis.com/javascript/latest/api-reference/esri-request.html#esriRequest) to be used for the data request (will override requestOptions defined during construction).
    *
    */
  def parseTokens(params: TokenTaskParseTokensParams): IPromise[String] = js.native
  def parseTokens(params: TokenTaskParseTokensParams, requestOptions: js.Any): IPromise[String] = js.native
}

@JSGlobal("__esri.TokenTask")
@js.native
object TokenTask extends TopLevel[TokenTaskConstructor]

