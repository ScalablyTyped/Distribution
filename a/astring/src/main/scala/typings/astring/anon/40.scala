package typings.astring.anon

import typings.astring.astringStrings.VariableDeclarator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `40` extends StObject {
  
  var `type`: VariableDeclarator = js.native
}
object `40` {
  
  @scala.inline
  def apply(`type`: VariableDeclarator): `40` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`40`]
  }
  
  @scala.inline
  implicit class `40MutableBuilder`[Self <: `40`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VariableDeclarator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
