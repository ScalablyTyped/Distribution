package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInvalidationsResult extends StObject {
  
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.InvalidationList] = js.undefined
}
object ListInvalidationsResult {
  
  inline def apply(): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvalidationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInvalidationsResult] (val x: Self) extends AnyVal {
    
    inline def setInvalidationList(value: InvalidationList): Self = StObject.set(x, "InvalidationList", value.asInstanceOf[js.Any])
    
    inline def setInvalidationListUndefined: Self = StObject.set(x, "InvalidationList", js.undefined)
  }
}
