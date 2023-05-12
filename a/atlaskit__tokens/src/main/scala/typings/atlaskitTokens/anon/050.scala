package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ShapeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `050` extends StObject {
  
  var `0`: ShapeToken
  
  var `050`: ShapeToken
  
  var `100`: ShapeToken
}
object `050` {
  
  inline def apply(`0`: ShapeToken, `050`: ShapeToken, `100`: ShapeToken): `050` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("050")(`050`.asInstanceOf[js.Any])
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`050`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `050`] (val x: Self) extends AnyVal {
    
    inline def set0(value: ShapeToken): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def set050(value: ShapeToken): Self = StObject.set(x, "050", value.asInstanceOf[js.Any])
    
    inline def set100(value: ShapeToken): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
  }
}
