package typings.astring.anon

import typings.astring.astringStrings.Super
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `50` extends StObject {
  
  var `type`: Super = js.native
}
object `50` {
  
  @scala.inline
  def apply(`type`: Super): `50` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`50`]
  }
  
  @scala.inline
  implicit class `50MutableBuilder`[Self <: `50`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Super): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
