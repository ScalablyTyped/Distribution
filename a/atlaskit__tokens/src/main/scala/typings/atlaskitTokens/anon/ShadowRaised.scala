package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowRaised extends StObject {
  
  var shadow: Raised
}
object ShadowRaised {
  
  inline def apply(shadow: Raised): ShadowRaised = {
    val __obj = js.Dynamic.literal(shadow = shadow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRaised]
  }
  
  extension [Self <: ShadowRaised](x: Self) {
    
    inline def setShadow(value: Raised): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
  }
}
