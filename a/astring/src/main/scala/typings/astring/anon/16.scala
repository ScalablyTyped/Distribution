package typings.astring.anon

import typings.astring.astringStrings.SwitchCase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16` extends StObject {
  
  var `type`: SwitchCase = js.native
}
object `16` {
  
  @scala.inline
  def apply(`type`: SwitchCase): `16` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
