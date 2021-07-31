package typings.astring.anon

import typings.astring.astringStrings.CallExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var `type`: CallExpression
}
object `15` {
  
  @scala.inline
  def apply(): `15` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CallExpression")
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
