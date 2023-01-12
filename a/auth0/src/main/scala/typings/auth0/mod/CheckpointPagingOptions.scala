package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckpointPagingOptions extends StObject {
  
  var from: js.UndefOr[String] = js.undefined
  
  var take: js.UndefOr[Double] = js.undefined
}
object CheckpointPagingOptions {
  
  inline def apply(): CheckpointPagingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckpointPagingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckpointPagingOptions] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setTake(value: Double): Self = StObject.set(x, "take", value.asInstanceOf[js.Any])
    
    inline def setTakeUndefined: Self = StObject.set(x, "take", js.undefined)
  }
}
