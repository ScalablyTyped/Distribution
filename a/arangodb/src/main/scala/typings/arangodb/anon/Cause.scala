package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cause extends StObject {
  
  var cause: js.UndefOr[js.Error] = js.undefined
  
  var extra: js.UndefOr[Any] = js.undefined
}
object Cause {
  
  inline def apply(): Cause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cause]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cause] (val x: Self) extends AnyVal {
    
    inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setExtra(value: Any): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
  }
}
