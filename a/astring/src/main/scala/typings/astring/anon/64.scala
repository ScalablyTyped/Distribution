package typings.astring.anon

import typings.astring.astringStrings.ImportExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `64` extends StObject {
  
  var `type`: ImportExpression
}
object `64` {
  
  @scala.inline
  def apply(): `64` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportExpression")
    __obj.asInstanceOf[`64`]
  }
  
  @scala.inline
  implicit class `64MutableBuilder`[Self <: `64`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
