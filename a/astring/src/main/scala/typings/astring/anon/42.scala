package typings.astring.anon

import typings.astring.astringStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `42` extends StObject {
  
  var `type`: FunctionDeclaration = js.native
}
object `42` {
  
  @scala.inline
  def apply(`type`: FunctionDeclaration): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42MutableBuilder`[Self <: `42`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
