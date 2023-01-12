package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var group: scale
}
object `8` {
  
  inline def apply(): `8` = {
    val __obj = js.Dynamic.literal(group = "scale")
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `8`] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: scale): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
