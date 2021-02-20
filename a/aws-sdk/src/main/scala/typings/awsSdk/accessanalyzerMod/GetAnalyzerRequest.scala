package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnalyzerRequest extends StObject {
  
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
  
  @scala.inline
  implicit class GetAnalyzerRequestMutableBuilder[Self <: GetAnalyzerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
  }
}
