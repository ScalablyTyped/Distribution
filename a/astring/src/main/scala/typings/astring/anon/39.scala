package typings.astring.anon

import typings.astring.astringStrings.ObjectExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `39` extends StObject {
  
  var `type`: ObjectExpression = js.native
}
object `39` {
  
  @scala.inline
  def apply(`type`: ObjectExpression): `39` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`39`]
  }
  
  @scala.inline
  implicit class `39MutableBuilder`[Self <: `39`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ObjectExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
