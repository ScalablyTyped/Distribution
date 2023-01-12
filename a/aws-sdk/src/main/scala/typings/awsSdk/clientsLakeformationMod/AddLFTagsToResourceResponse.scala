package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddLFTagsToResourceResponse extends StObject {
  
  /**
    * A list of failures to tag the resource.
    */
  var Failures: js.UndefOr[LFTagErrors] = js.undefined
}
object AddLFTagsToResourceResponse {
  
  inline def apply(): AddLFTagsToResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLFTagsToResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddLFTagsToResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: LFTagErrors): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: LFTagError*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
