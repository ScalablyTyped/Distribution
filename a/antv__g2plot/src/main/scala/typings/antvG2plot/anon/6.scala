package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.transpose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  /** send (x, y) to (y, x) */
  var `type`: transpose
}
object `6` {
  
  inline def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("transpose")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `6`] (val x: Self) extends AnyVal {
    
    inline def setType(value: transpose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
