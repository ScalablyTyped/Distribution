package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetViewOutput extends StObject {
  
  /**
    * If any of the specified ARNs result in an error, then this structure describes the error.
    */
  var Errors: js.UndefOr[BatchGetViewErrors] = js.undefined
  
  /**
    * A structure with a list of objects with details for each of the specified views.
    */
  var Views: js.UndefOr[ViewList] = js.undefined
}
object BatchGetViewOutput {
  
  inline def apply(): BatchGetViewOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetViewOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetViewOutput] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchGetViewErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchGetViewError*): Self = StObject.set(x, "Errors", js.Array(value*))
    
    inline def setViews(value: ViewList): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "Views", js.undefined)
    
    inline def setViewsVarargs(value: View*): Self = StObject.set(x, "Views", js.Array(value*))
  }
}
