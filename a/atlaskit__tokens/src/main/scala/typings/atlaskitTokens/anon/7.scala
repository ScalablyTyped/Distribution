package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.spacing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  val group: spacing
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(group = "spacing")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: spacing): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
  }
}
