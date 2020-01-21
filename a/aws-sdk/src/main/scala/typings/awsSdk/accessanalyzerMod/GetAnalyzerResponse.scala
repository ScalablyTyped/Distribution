package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAnalyzerResponse extends js.Object {
  /**
    * An AnalyzerSummary object that contains information about the analyzer.
    */
  var analyzer: AnalyzerSummary = js.native
}

object GetAnalyzerResponse {
  @scala.inline
  def apply(analyzer: AnalyzerSummary): GetAnalyzerResponse = {
    val __obj = js.Dynamic.literal(analyzer = analyzer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAnalyzerResponse]
  }
}

