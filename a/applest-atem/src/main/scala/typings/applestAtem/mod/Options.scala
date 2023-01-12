package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /** set forceOldStyle if you upgraded this library from from `0.1.x`. state returns extract 1ME stats. */
  var forceOldStyle: js.UndefOr[Boolean] = js.undefined
  
  /** a random port will be used if not specified */
  var localPort: js.UndefOr[Double] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setForceOldStyle(value: Boolean): Self = StObject.set(x, "forceOldStyle", value.asInstanceOf[js.Any])
    
    inline def setForceOldStyleUndefined: Self = StObject.set(x, "forceOldStyle", js.undefined)
    
    inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
    
    inline def setLocalPortUndefined: Self = StObject.set(x, "localPort", js.undefined)
  }
}
