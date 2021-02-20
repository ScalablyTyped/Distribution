package typings.astring.anon

import typings.astring.astringStrings.NewExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `18` extends StObject {
  
  var `type`: NewExpression = js.native
}
object `18` {
  
  @scala.inline
  def apply(`type`: NewExpression): `18` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
