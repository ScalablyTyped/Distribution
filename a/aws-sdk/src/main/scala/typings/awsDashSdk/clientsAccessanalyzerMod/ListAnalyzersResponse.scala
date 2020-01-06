package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAnalyzersResponse extends js.Object {
  /**
    * The analyzers retrieved.
    */
  var analyzers: AnalyzersList = js.native
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}

object ListAnalyzersResponse {
  @scala.inline
  def apply(analyzers: AnalyzersList, nextToken: Token = null): ListAnalyzersResponse = {
    val __obj = js.Dynamic.literal(analyzers = analyzers.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzersResponse]
  }
}

