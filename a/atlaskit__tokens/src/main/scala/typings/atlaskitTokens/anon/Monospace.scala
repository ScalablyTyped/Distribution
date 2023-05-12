package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesTypographyPaletteMod.FontFamilyBaseToken
import typings.atlaskitTokens.distTypesTypesMod.TypographyToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Monospace extends StObject {
  
  var monospace: TypographyToken[FontFamilyBaseToken]
  
  var sans: TypographyToken[FontFamilyBaseToken]
}
object Monospace {
  
  inline def apply(monospace: TypographyToken[FontFamilyBaseToken], sans: TypographyToken[FontFamilyBaseToken]): Monospace = {
    val __obj = js.Dynamic.literal(monospace = monospace.asInstanceOf[js.Any], sans = sans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Monospace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Monospace] (val x: Self) extends AnyVal {
    
    inline def setMonospace(value: TypographyToken[FontFamilyBaseToken]): Self = StObject.set(x, "monospace", value.asInstanceOf[js.Any])
    
    inline def setSans(value: TypographyToken[FontFamilyBaseToken]): Self = StObject.set(x, "sans", value.asInstanceOf[js.Any])
  }
}
