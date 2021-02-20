package typings.astring.anon

import typings.astring.astringStrings.Program
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `49` extends StObject {
  
  var `type`: Program = js.native
}
object `49` {
  
  @scala.inline
  def apply(`type`: Program): `49` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`49`]
  }
  
  @scala.inline
  implicit class `49MutableBuilder`[Self <: `49`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
