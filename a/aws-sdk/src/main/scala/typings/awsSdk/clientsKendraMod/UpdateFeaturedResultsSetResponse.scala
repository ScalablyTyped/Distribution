package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFeaturedResultsSetResponse extends StObject {
  
  /**
    * Information on the set of featured results. This includes the identifier of the featured results set, whether the featured results set is active or inactive, when the featured results set was last updated, and more.
    */
  var FeaturedResultsSet: js.UndefOr[typings.awsSdk.clientsKendraMod.FeaturedResultsSet] = js.undefined
}
object UpdateFeaturedResultsSetResponse {
  
  inline def apply(): UpdateFeaturedResultsSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFeaturedResultsSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFeaturedResultsSetResponse] (val x: Self) extends AnyVal {
    
    inline def setFeaturedResultsSet(value: FeaturedResultsSet): Self = StObject.set(x, "FeaturedResultsSet", value.asInstanceOf[js.Any])
    
    inline def setFeaturedResultsSetUndefined: Self = StObject.set(x, "FeaturedResultsSet", js.undefined)
  }
}
