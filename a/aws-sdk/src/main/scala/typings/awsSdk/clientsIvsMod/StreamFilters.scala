package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamFilters extends StObject {
  
  /**
    * The stream’s health.
    */
  var health: js.UndefOr[StreamHealth] = js.undefined
}
object StreamFilters {
  
  inline def apply(): StreamFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamFilters] (val x: Self) extends AnyVal {
    
    inline def setHealth(value: StreamHealth): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
  }
}
