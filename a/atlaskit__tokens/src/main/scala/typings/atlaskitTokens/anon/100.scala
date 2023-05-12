package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.ShapeToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `100` extends StObject {
  
  var `050`: ShapeToken
  
  var `100`: ShapeToken
  
  var `200`: ShapeToken
  
  var `300`: ShapeToken
  
  var `400`: ShapeToken
  
  var round: ShapeToken
}
object `100` {
  
  inline def apply(
    `050`: ShapeToken,
    `100`: ShapeToken,
    `200`: ShapeToken,
    `300`: ShapeToken,
    `400`: ShapeToken,
    round: ShapeToken
  ): `100` = {
    val __obj = js.Dynamic.literal(round = round.asInstanceOf[js.Any])
    __obj.updateDynamic("050")(`050`.asInstanceOf[js.Any])
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`100`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `100`] (val x: Self) extends AnyVal {
    
    inline def set050(value: ShapeToken): Self = StObject.set(x, "050", value.asInstanceOf[js.Any])
    
    inline def set100(value: ShapeToken): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
    
    inline def set200(value: ShapeToken): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set300(value: ShapeToken): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
    
    inline def set400(value: ShapeToken): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def setRound(value: ShapeToken): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
  }
}
