package typings.astring.anon

import typings.astring.astringStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `52` extends StObject {
  
  var `type`: ConditionalExpression = js.native
}
object `52` {
  
  @scala.inline
  def apply(`type`: ConditionalExpression): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`52`]
  }
  
  @scala.inline
  implicit class `52MutableBuilder`[Self <: `52`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
