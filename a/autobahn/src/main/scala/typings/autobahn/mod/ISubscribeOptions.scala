package typings.autobahn.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISubscribeOptions extends StObject {
  
  var get_retained: js.UndefOr[Boolean] = js.undefined
  
  var `match`: js.UndefOr[String] = js.undefined
}
object ISubscribeOptions {
  
  inline def apply(): ISubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISubscribeOptions]
  }
  
  extension [Self <: ISubscribeOptions](x: Self) {
    
    inline def setGet_retained(value: Boolean): Self = StObject.set(x, "get_retained", value.asInstanceOf[js.Any])
    
    inline def setGet_retainedUndefined: Self = StObject.set(x, "get_retained", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
