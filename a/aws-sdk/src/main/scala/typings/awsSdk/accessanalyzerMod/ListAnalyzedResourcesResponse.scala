package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListAnalyzedResourcesResponse extends js.Object {
  
  /**
    * A list of resources that were analyzed.
    */
  var analyzedResources: AnalyzedResourcesList = js.native
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.native
}
object ListAnalyzedResourcesResponse {
  
  @scala.inline
  def apply(analyzedResources: AnalyzedResourcesList): ListAnalyzedResourcesResponse = {
    val __obj = js.Dynamic.literal(analyzedResources = analyzedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesResponse]
  }
  
  @scala.inline
  implicit class ListAnalyzedResourcesResponseOps[Self <: ListAnalyzedResourcesResponse] (val x: Self) extends AnyVal {
    
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
    def setAnalyzedResourcesVarargs(value: AnalyzedResourceSummary*): Self = this.set("analyzedResources", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzedResources(value: AnalyzedResourcesList): Self = this.set("analyzedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
