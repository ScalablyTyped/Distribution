package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAnalyzerRequest extends StObject {
  
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
  def apply(analyzerName: Name): DeleteAnalyzerRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnalyzerRequest]
  }
  
  @scala.inline
  implicit class DeleteAnalyzerRequestMutableBuilder[Self <: DeleteAnalyzerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzerName(value: Name): Self = StObject.set(x, "analyzerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
