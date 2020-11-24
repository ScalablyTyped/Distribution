package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAnalyzedResourceRequest extends js.Object {
  
  /**
    * The ARN of the analyzer to retrieve information from.
    */
  var analyzerArn: AnalyzerArn = js.native
  
  /**
    * The ARN of the resource to retrieve information about.
    */
  var resourceArn: ResourceArn = js.native
}
object GetAnalyzedResourceRequest {
  
  @scala.inline
  def apply(analyzerArn: AnalyzerArn, resourceArn: ResourceArn): GetAnalyzedResourceRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnalyzedResourceRequest]
  }
  
  @scala.inline
  implicit class GetAnalyzedResourceRequestOps[Self <: GetAnalyzedResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setAnalyzerArn(value: AnalyzerArn): Self = this.set("analyzerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("resourceArn", value.asInstanceOf[js.Any])
  }
}
