package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.reflectY
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  /** send (x, y) to (x, -y) */
  var `type`: reflectY
}
object `5` {
  
  inline def apply(): `5` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("reflectY")
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`] (val x: Self) extends AnyVal {
    
    inline def setType(value: reflectY): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
