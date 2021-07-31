package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalyzerResponse extends StObject {
  
  /**
    * An AnalyzerSummary object that contains information about the analyzer.
    */
  var analyzer: AnalyzerSummary
}
object GetAnalyzerResponse {
  
  @scala.inline
  def apply(analyzer: AnalyzerSummary): GetAnalyzerResponse = {
    val __obj = js.Dynamic.literal(analyzer = analyzer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzerResponse]
  }
  
  @scala.inline
  implicit class GetAnalyzerResponseMutableBuilder[Self <: GetAnalyzerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzer(value: AnalyzerSummary): Self = StObject.set(x, "analyzer", value.asInstanceOf[js.Any])
  }
}
