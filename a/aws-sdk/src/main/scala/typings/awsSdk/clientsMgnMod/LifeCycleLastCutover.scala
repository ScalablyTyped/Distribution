package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LifeCycleLastCutover extends StObject {
  
  /**
    * Lifecycle Cutover finalized date and time.
    */
  var finalized: js.UndefOr[LifeCycleLastCutoverFinalized] = js.undefined
  
  /**
    * Lifecycle last Cutover initiated.
    */
  var initiated: js.UndefOr[LifeCycleLastCutoverInitiated] = js.undefined
  
  /**
    * Lifecycle last Cutover reverted.
    */
  var reverted: js.UndefOr[LifeCycleLastCutoverReverted] = js.undefined
}
object LifeCycleLastCutover {
  
  inline def apply(): LifeCycleLastCutover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifeCycleLastCutover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LifeCycleLastCutover] (val x: Self) extends AnyVal {
    
    inline def setFinalized(value: LifeCycleLastCutoverFinalized): Self = StObject.set(x, "finalized", value.asInstanceOf[js.Any])
    
    inline def setFinalizedUndefined: Self = StObject.set(x, "finalized", js.undefined)
    
    inline def setInitiated(value: LifeCycleLastCutoverInitiated): Self = StObject.set(x, "initiated", value.asInstanceOf[js.Any])
    
    inline def setInitiatedUndefined: Self = StObject.set(x, "initiated", js.undefined)
    
    inline def setReverted(value: LifeCycleLastCutoverReverted): Self = StObject.set(x, "reverted", value.asInstanceOf[js.Any])
    
    inline def setRevertedUndefined: Self = StObject.set(x, "reverted", js.undefined)
  }
}
