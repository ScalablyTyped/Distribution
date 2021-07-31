package typings.astring.anon

import typings.astring.astringStrings.ContinueStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var `type`: ContinueStatement
}
object `12` {
  
  @scala.inline
  def apply(): `12` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ContinueStatement")
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ContinueStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
