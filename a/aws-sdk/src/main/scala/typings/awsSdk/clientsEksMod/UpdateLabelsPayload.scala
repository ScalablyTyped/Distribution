package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLabelsPayload extends StObject {
  
  /**
    * Kubernetes labels to be added or updated.
    */
  var addOrUpdateLabels: js.UndefOr[labelsMap] = js.undefined
  
  /**
    * Kubernetes labels to be removed.
    */
  var removeLabels: js.UndefOr[labelsKeyList] = js.undefined
}
object UpdateLabelsPayload {
  
  inline def apply(): UpdateLabelsPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLabelsPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLabelsPayload] (val x: Self) extends AnyVal {
    
    inline def setAddOrUpdateLabels(value: labelsMap): Self = StObject.set(x, "addOrUpdateLabels", value.asInstanceOf[js.Any])
    
    inline def setAddOrUpdateLabelsUndefined: Self = StObject.set(x, "addOrUpdateLabels", js.undefined)
    
    inline def setRemoveLabels(value: labelsKeyList): Self = StObject.set(x, "removeLabels", value.asInstanceOf[js.Any])
    
    inline def setRemoveLabelsUndefined: Self = StObject.set(x, "removeLabels", js.undefined)
    
    inline def setRemoveLabelsVarargs(value: String*): Self = StObject.set(x, "removeLabels", js.Array(value*))
  }
}
