package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnsurePreconnect extends StObject {
  
  var ensurePreconnect: js.UndefOr[Boolean] = js.undefined
}
object EnsurePreconnect {
  
  inline def apply(): EnsurePreconnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnsurePreconnect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnsurePreconnect] (val x: Self) extends AnyVal {
    
    inline def setEnsurePreconnect(value: Boolean): Self = StObject.set(x, "ensurePreconnect", value.asInstanceOf[js.Any])
    
    inline def setEnsurePreconnectUndefined: Self = StObject.set(x, "ensurePreconnect", js.undefined)
  }
}
