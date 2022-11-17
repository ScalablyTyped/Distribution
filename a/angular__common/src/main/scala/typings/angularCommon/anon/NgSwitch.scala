package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgSwitch extends StObject {
  
  var ngSwitch: "ngSwitch"
}
object NgSwitch {
  
  inline def apply(): NgSwitch = {
    val __obj = js.Dynamic.literal(ngSwitch = "ngSwitch")
    __obj.asInstanceOf[NgSwitch]
  }
  
  extension [Self <: NgSwitch](x: Self) {
    
    inline def setNgSwitch(value: "ngSwitch"): Self = StObject.set(x, "ngSwitch", value.asInstanceOf[js.Any])
  }
}
