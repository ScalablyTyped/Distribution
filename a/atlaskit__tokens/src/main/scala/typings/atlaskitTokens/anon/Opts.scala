package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Opts extends StObject {
  
  var opts: ShouldUseAutoFallback
}
object Opts {
  
  inline def apply(opts: ShouldUseAutoFallback): Opts = {
    val __obj = js.Dynamic.literal(opts = opts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opts]
  }
  
  extension [Self <: Opts](x: Self) {
    
    inline def setOpts(value: ShouldUseAutoFallback): Self = StObject.set(x, "opts", value.asInstanceOf[js.Any])
  }
}
