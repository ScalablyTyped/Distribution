package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.TypographyToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `400`[BaseToken] extends StObject {
  
  var `100`: TypographyToken[BaseToken]
  
  var `200`: TypographyToken[BaseToken]
  
  var `300`: TypographyToken[BaseToken]
  
  var `400`: TypographyToken[BaseToken]
  
  var `500`: TypographyToken[BaseToken]
  
  var `600`: TypographyToken[BaseToken]
}
object `400` {
  
  inline def apply[BaseToken](
    `100`: TypographyToken[BaseToken],
    `200`: TypographyToken[BaseToken],
    `300`: TypographyToken[BaseToken],
    `400`: TypographyToken[BaseToken],
    `500`: TypographyToken[BaseToken],
    `600`: TypographyToken[BaseToken]
  ): `400`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
    __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
    __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
    __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
    __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
    __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`400`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `400`[?], BaseToken] (val x: Self & `400`[BaseToken]) extends AnyVal {
    
    inline def set100(value: TypographyToken[BaseToken]): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
    
    inline def set200(value: TypographyToken[BaseToken]): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
    
    inline def set300(value: TypographyToken[BaseToken]): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
    
    inline def set400(value: TypographyToken[BaseToken]): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
    
    inline def set500(value: TypographyToken[BaseToken]): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
    
    inline def set600(value: TypographyToken[BaseToken]): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
  }
}
