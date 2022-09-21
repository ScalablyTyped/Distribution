package typings.atlaskitTokens.typesTypesMod

import typings.atlaskitTokens.anon.BackgroundDangerDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundColorTokenSchema[BaseToken] extends StObject {
  
  var color: BackgroundDangerDisabled[BaseToken]
}
object BackgroundColorTokenSchema {
  
  inline def apply[BaseToken](color: BackgroundDangerDisabled[BaseToken]): BackgroundColorTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColorTokenSchema[BaseToken]]
  }
  
  extension [Self <: BackgroundColorTokenSchema[?], BaseToken](x: Self & BackgroundColorTokenSchema[BaseToken]) {
    
    inline def setColor(value: BackgroundDangerDisabled[BaseToken]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
