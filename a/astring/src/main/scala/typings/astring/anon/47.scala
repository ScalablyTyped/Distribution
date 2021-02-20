package typings.astring.anon

import typings.astring.astringStrings.MethodDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `47` extends StObject {
  
  var `type`: MethodDefinition = js.native
}
object `47` {
  
  @scala.inline
  def apply(`type`: MethodDefinition): `47` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`47`]
  }
  
  @scala.inline
  implicit class `47MutableBuilder`[Self <: `47`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: MethodDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
