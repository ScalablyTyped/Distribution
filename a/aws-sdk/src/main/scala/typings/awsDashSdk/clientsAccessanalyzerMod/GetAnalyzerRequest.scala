package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzerRequest extends js.Object {
  /**
    * The name of the analyzer retrieved.
    */
  var analyzerName: Name = js.native
}

object GetAnalyzerRequest {
  @scala.inline
  def apply(analyzerName: Name): GetAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAnalyzerRequest]
  }
}

