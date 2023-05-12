package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.FamilySans
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFamilyTokenSchema[BaseToken] extends StObject {
  
  var font: FamilySans[BaseToken]
}
object FontFamilyTokenSchema {
  
  inline def apply[BaseToken](font: FamilySans[BaseToken]): FontFamilyTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFamilyTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFamilyTokenSchema[?], BaseToken] (val x: Self & FontFamilyTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setFont(value: FamilySans[BaseToken]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
