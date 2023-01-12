package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssetStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * The current status of the asset.
    */
  var state: AssetState
}
object AssetStatus {
  
  inline def apply(state: AssetState): AssetStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssetStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: AssetState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
