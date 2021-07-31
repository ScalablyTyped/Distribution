package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalyzedResourceResponse extends StObject {
  
  /**
    * An AnalyedResource object that contains information that Access Analyzer found when it analyzed the resource.
    */
  var resource: js.UndefOr[AnalyzedResource] = js.undefined
}
object GetAnalyzedResourceResponse {
  
  @scala.inline
  def apply(): GetAnalyzedResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnalyzedResourceResponse]
  }
  
  @scala.inline
  implicit class GetAnalyzedResourceResponseMutableBuilder[Self <: GetAnalyzedResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResource(value: AnalyzedResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
