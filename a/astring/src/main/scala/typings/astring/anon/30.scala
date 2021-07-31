package typings.astring.anon

import typings.astring.astringStrings.WithStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  var `type`: WithStatement
}
object `30` {
  
  @scala.inline
  def apply(): `30` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("WithStatement")
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit class `30MutableBuilder`[Self <: `30`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: WithStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
