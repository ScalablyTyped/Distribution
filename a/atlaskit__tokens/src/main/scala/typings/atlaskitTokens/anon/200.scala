package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `200` extends StObject {
  
  var `100`: `5`
  
  var `200`: `6`
  
  var `300`: `7`
}
object `200` {
  
  inline def apply(`100`: `5`, `200`: `6`, `300`: `7`): `200` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`200`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `200`] (val x: Self) extends AnyVal {
    
    inline def set100(value: `5`): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
    
    inline def set200(value: `6`): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set300(value: `7`): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
  }
}
