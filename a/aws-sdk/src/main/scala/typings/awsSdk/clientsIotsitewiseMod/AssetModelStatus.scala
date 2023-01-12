package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetModelStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * The current state of the asset model.
    */
  var state: AssetModelState
}
object AssetModelStatus {
  
  inline def apply(state: AssetModelState): AssetModelStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetModelStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetModelStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: AssetModelState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
