package typings.astring.anon

import typings.astring.astringStrings.ArrayPattern
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `37` extends StObject {
  
  var `type`: ArrayPattern = js.native
}
object `37` {
  
  @scala.inline
  def apply(`type`: ArrayPattern): `37` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`37`]
  }
  
  @scala.inline
  implicit class `37MutableBuilder`[Self <: `37`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
