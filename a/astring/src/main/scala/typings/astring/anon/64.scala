package typings.astring.anon

import typings.astring.astringStrings.ImportExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `64` extends StObject {
  
  var `type`: ImportExpression = js.native
}
object `64` {
  
  @scala.inline
  def apply(`type`: ImportExpression): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64MutableBuilder`[Self <: `64`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
