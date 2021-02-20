package typings.astring.anon

import typings.astring.astringStrings.TemplateElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `58` extends StObject {
  
  var `type`: TemplateElement = js.native
}
object `58` {
  
  @scala.inline
  def apply(`type`: TemplateElement): `58` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`58`]
  }
  
  @scala.inline
  implicit class `58MutableBuilder`[Self <: `58`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
