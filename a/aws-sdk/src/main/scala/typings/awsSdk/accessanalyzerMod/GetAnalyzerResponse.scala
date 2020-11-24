package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class GetAnalyzerResponseOps[Self <: GetAnalyzerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnalyzer(value: AnalyzerSummary): Self = this.set("analyzer", value.asInstanceOf[js.Any])
  }
}
