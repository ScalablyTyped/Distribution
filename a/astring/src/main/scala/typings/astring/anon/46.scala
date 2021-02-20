package typings.astring.anon

import typings.astring.astringStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `46` extends StObject {
  
  var `type`: ArrowFunctionExpression = js.native
}
object `46` {
  
  @scala.inline
  def apply(`type`: ArrowFunctionExpression): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
