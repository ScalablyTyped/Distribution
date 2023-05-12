package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSwitch extends StObject {
  
  var ngSwitch: `20`
}
object NgSwitch {
  
  inline def apply(ngSwitch: `20`): NgSwitch = {
    val __obj = js.Dynamic.literal(ngSwitch = ngSwitch.asInstanceOf[js.Any])
    __obj.asInstanceOf[NgSwitch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NgSwitch] (val x: Self) extends AnyVal {
    
    inline def setNgSwitch(value: `20`): Self = StObject.set(x, "ngSwitch", value.asInstanceOf[js.Any])
  }
}
