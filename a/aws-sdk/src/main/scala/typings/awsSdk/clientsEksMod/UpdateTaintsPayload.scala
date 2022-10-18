package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTaintsPayload extends StObject {
  
  /**
    * Kubernetes taints to be added or updated.
    */
  var addOrUpdateTaints: js.UndefOr[taintsList] = js.undefined
  
  /**
    * Kubernetes taints to be removed.
    */
  var removeTaints: js.UndefOr[taintsList] = js.undefined
}
object UpdateTaintsPayload {
  
  inline def apply(): UpdateTaintsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTaintsPayload]
  }
  
  extension [Self <: UpdateTaintsPayload](x: Self) {
    
    inline def setAddOrUpdateTaints(value: taintsList): Self = StObject.set(x, "addOrUpdateTaints", value.asInstanceOf[js.Any])
    
    inline def setAddOrUpdateTaintsUndefined: Self = StObject.set(x, "addOrUpdateTaints", js.undefined)
    
    inline def setAddOrUpdateTaintsVarargs(value: Taint*): Self = StObject.set(x, "addOrUpdateTaints", js.Array(value*))
    
    inline def setRemoveTaints(value: taintsList): Self = StObject.set(x, "removeTaints", value.asInstanceOf[js.Any])
    
    inline def setRemoveTaintsUndefined: Self = StObject.set(x, "removeTaints", js.undefined)
    
    inline def setRemoveTaintsVarargs(value: Taint*): Self = StObject.set(x, "removeTaints", js.Array(value*))
  }
}
