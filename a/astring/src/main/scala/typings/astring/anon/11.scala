package typings.astring.anon

import typings.astring.astringStrings.WhileStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  var `type`: WhileStatement = js.native
}
object `11` {
  
  @scala.inline
  def apply(`type`: WhileStatement): `11` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WhileStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
