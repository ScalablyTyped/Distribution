package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.TypographyToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Regular[BaseToken] extends StObject {
  
  var bold: TypographyToken[BaseToken]
  
  var medium: TypographyToken[BaseToken]
  
  var regular: TypographyToken[BaseToken]
  
  var semibold: TypographyToken[BaseToken]
}
object Regular {
  
  inline def apply[BaseToken](
    bold: TypographyToken[BaseToken],
    medium: TypographyToken[BaseToken],
    regular: TypographyToken[BaseToken],
    semibold: TypographyToken[BaseToken]
  ): Regular[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any], semibold = semibold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regular[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Regular[?], BaseToken] (val x: Self & Regular[BaseToken]) extends AnyVal {
    
    inline def setBold(value: TypographyToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: TypographyToken[BaseToken]): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setRegular(value: TypographyToken[BaseToken]): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setSemibold(value: TypographyToken[BaseToken]): Self = StObject.set(x, "semibold", value.asInstanceOf[js.Any])
  }
}
