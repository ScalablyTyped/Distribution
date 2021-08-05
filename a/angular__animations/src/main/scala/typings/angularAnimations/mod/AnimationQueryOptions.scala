package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationQueryOptions
  extends StObject
     with AnimationOptions {
  
  /**
    * A maximum total number of results to return from the query.
    * If negative, results are limited from the end of the query list towards the beginning.
    * By default, results are not limited.
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * True if this query is optional, false if it is required. Default is false.
    * A required query throws an error if no elements are retrieved when
    * the query is executed. An optional query does not.
    *
    */
  var optional: js.UndefOr[Boolean] = js.undefined
}
object AnimationQueryOptions {
  
  inline def apply(): AnimationQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationQueryOptions]
  }
  
  extension [Self <: AnimationQueryOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
  }
}
