package typings.atlaskitTokens.anon

import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BolderSubtle[BaseToken] extends StObject {
  
  var bolder: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
  
  var subtler: PaintToken[BaseToken]
  
  var subtlest: PaintToken[BaseToken]
}
object BolderSubtle {
  
  inline def apply[BaseToken](
    bolder: PaintToken[BaseToken],
    subtle: PaintToken[BaseToken],
    subtler: PaintToken[BaseToken],
    subtlest: PaintToken[BaseToken]
  ): BolderSubtle[BaseToken] = {
    val __obj = js.Dynamic.literal(bolder = bolder.asInstanceOf[js.Any], subtle = subtle.asInstanceOf[js.Any], subtler = subtler.asInstanceOf[js.Any], subtlest = subtlest.asInstanceOf[js.Any])
    __obj.asInstanceOf[BolderSubtle[BaseToken]]
  }
  
  extension [Self <: BolderSubtle[?], BaseToken](x: Self & BolderSubtle[BaseToken]) {
    
    inline def setBolder(value: PaintToken[BaseToken]): Self = StObject.set(x, "bolder", value.asInstanceOf[js.Any])
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def setSubtler(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtler", value.asInstanceOf[js.Any])
    
    inline def setSubtlest(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtlest", value.asInstanceOf[js.Any])
  }
}
