package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnalyzerRequest extends js.Object {
  /**
    * The name of the analyzer to delete.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
}

object DeleteAnalyzerRequest {
  @scala.inline
  def apply(analyzerName: Name, clientToken: String = null): DeleteAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalyzerRequest]
  }
}

