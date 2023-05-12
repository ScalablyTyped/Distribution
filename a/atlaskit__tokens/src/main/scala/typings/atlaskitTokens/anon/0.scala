package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  val group: shape
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(group = "shape")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: shape): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
