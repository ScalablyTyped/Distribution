package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInvalidationResult extends StObject {
  
  /**
    * The invalidation's information.
    */
  var Invalidation: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.Invalidation] = js.undefined
  
  /**
    * The fully qualified URI of the distribution and invalidation batch request, including the Invalidation ID.
    */
  var Location: js.UndefOr[String] = js.undefined
}
object CreateInvalidationResult {
  
  inline def apply(): CreateInvalidationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateInvalidationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInvalidationResult] (val x: Self) extends AnyVal {
    
    inline def setInvalidation(value: Invalidation): Self = StObject.set(x, "Invalidation", value.asInstanceOf[js.Any])
    
    inline def setInvalidationUndefined: Self = StObject.set(x, "Invalidation", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
