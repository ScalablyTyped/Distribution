package typings.awsSdk.clientsLakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveLFTagsFromResourceResponse extends StObject {
  
  /**
    * A list of failures to untag a resource.
    */
  var Failures: js.UndefOr[LFTagErrors] = js.undefined
}
object RemoveLFTagsFromResourceResponse {
  
  inline def apply(): RemoveLFTagsFromResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveLFTagsFromResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveLFTagsFromResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setFailures(value: LFTagErrors): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
    
    inline def setFailuresVarargs(value: LFTagError*): Self = StObject.set(x, "Failures", js.Array(value*))
  }
}
