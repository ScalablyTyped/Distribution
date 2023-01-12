package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFilter extends StObject {
  
  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  var deltaTime: js.UndefOr[DeltaTime] = js.undefined
}
object QueryFilter {
  
  inline def apply(): QueryFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryFilter] (val x: Self) extends AnyVal {
    
    inline def setDeltaTime(value: DeltaTime): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
    
    inline def setDeltaTimeUndefined: Self = StObject.set(x, "deltaTime", js.undefined)
  }
}
