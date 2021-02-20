package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAnalyzerResponse extends StObject {
  
  /**
    * The ARN of the analyzer that was created by the request.
    */
  var arn: js.UndefOr[AnalyzerArn] = js.native
}
object CreateAnalyzerResponse {
  
  @scala.inline
  def apply(): CreateAnalyzerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAnalyzerResponse]
  }
  
  @scala.inline
  implicit class CreateAnalyzerResponseMutableBuilder[Self <: CreateAnalyzerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: AnalyzerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
  }
}
