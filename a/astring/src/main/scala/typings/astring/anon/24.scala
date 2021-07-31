package typings.astring.anon

import typings.astring.astringStrings.TaggedTemplateExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var `type`: TaggedTemplateExpression
}
object `24` {
  
  @scala.inline
  def apply(): `24` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TaggedTemplateExpression")
    __obj.asInstanceOf[`24`]
  }
  
  @scala.inline
  implicit class `24MutableBuilder`[Self <: `24`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TaggedTemplateExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
