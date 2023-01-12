package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnalyzedResourceResponse extends StObject {
  
  /**
    * An AnalyzedResource object that contains information that IAM Access Analyzer found when it analyzed the resource.
    */
  var resource: js.UndefOr[AnalyzedResource] = js.undefined
}
object GetAnalyzedResourceResponse {
  
  inline def apply(): GetAnalyzedResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAnalyzedResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnalyzedResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setResource(value: AnalyzedResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
