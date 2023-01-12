package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesPalettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subtler extends StObject {
  
  var bolder: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
  
  var subtler: PaintToken[BaseToken]
  
  var subtlest: PaintToken[BaseToken]
}
object Subtler {
  
  inline def apply(
    bolder: PaintToken[BaseToken],
    subtle: PaintToken[BaseToken],
    subtler: PaintToken[BaseToken],
    subtlest: PaintToken[BaseToken]
  ): Subtler = {
    val __obj = js.Dynamic.literal(bolder = bolder.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any], subtler = subtler.asInstanceOf[js.Any], subtlest = subtlest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subtler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subtler] (val x: Self) extends AnyVal {
    
    inline def setBolder(value: PaintToken[BaseToken]): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def setSubtler(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtler", value.asInstanceOf[js.Any])
    
    inline def setSubtlest(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtlest", value.asInstanceOf[js.Any])
  }
}
