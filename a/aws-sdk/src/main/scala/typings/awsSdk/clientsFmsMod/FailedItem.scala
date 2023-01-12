package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedItem extends StObject {
  
  /**
    * The reason the resource's association could not be updated.
    */
  var Reason: js.UndefOr[FailedItemReason] = js.undefined
  
  /**
    * The univeral resource indicator (URI) of the resource that failed.
    */
  var URI: js.UndefOr[Identifier] = js.undefined
}
object FailedItem {
  
  inline def apply(): FailedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailedItem] (val x: Self) extends AnyVal {
    
    inline def setReason(value: FailedItemReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    inline def setURI(value: Identifier): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
