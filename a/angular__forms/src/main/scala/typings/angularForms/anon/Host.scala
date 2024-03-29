package typings.angularForms.anon

import typings.angularForms.angularFormsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: `true`
  
  var optional: `true`
  
  var skipSelf: `true`
}
object Host {
  
  inline def apply(): Host = {
    val __obj = js.Dynamic.literal(host = true, optional = true, skipSelf = true)
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    inline def setHost(value: `true`): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setSkipSelf(value: `true`): Self = StObject.set(x, "skipSelf", value.asInstanceOf[js.Any])
  }
}
