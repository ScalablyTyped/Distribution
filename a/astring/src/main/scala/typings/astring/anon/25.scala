package typings.astring.anon

import typings.astring.astringStrings.TemplateLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `25` extends StObject {
  
  var `type`: TemplateLiteral
}
object `25` {
  
  @scala.inline
  def apply(): `25` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[`25`]
  }
  
  @scala.inline
  implicit class `25MutableBuilder`[Self <: `25`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
