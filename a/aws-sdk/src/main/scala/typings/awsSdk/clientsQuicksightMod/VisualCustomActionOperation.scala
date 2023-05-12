package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualCustomActionOperation extends StObject {
  
  /**
    * The filter operation that filters data included in a visual or in an entire sheet.
    */
  var FilterOperation: js.UndefOr[CustomActionFilterOperation] = js.undefined
  
  /**
    * The navigation operation that navigates between different sheets in the same analysis.
    */
  var NavigationOperation: js.UndefOr[CustomActionNavigationOperation] = js.undefined
  
  /**
    * The set parameter operation that sets parameters in custom action.
    */
  var SetParametersOperation: js.UndefOr[CustomActionSetParametersOperation] = js.undefined
  
  /**
    * The URL operation that opens a link to another webpage.
    */
  var URLOperation: js.UndefOr[CustomActionURLOperation] = js.undefined
}
object VisualCustomActionOperation {
  
  inline def apply(): VisualCustomActionOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualCustomActionOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualCustomActionOperation] (val x: Self) extends AnyVal {
    
    inline def setFilterOperation(value: CustomActionFilterOperation): Self = StObject.set(x, "FilterOperation", value.asInstanceOf[js.Any])
    
    inline def setFilterOperationUndefined: Self = StObject.set(x, "FilterOperation", js.undefined)
    
    inline def setNavigationOperation(value: CustomActionNavigationOperation): Self = StObject.set(x, "NavigationOperation", value.asInstanceOf[js.Any])
    
    inline def setNavigationOperationUndefined: Self = StObject.set(x, "NavigationOperation", js.undefined)
    
    inline def setSetParametersOperation(value: CustomActionSetParametersOperation): Self = StObject.set(x, "SetParametersOperation", value.asInstanceOf[js.Any])
    
    inline def setSetParametersOperationUndefined: Self = StObject.set(x, "SetParametersOperation", js.undefined)
    
    inline def setURLOperation(value: CustomActionURLOperation): Self = StObject.set(x, "URLOperation", value.asInstanceOf[js.Any])
    
    inline def setURLOperationUndefined: Self = StObject.set(x, "URLOperation", js.undefined)
  }
}
