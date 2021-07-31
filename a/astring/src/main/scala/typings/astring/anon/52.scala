package typings.astring.anon

import typings.astring.astringStrings.ConditionalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `52` extends StObject {
  
  var `type`: ConditionalExpression
}
object `52` {
  
  @scala.inline
  def apply(): `52` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ConditionalExpression")
    __obj.asInstanceOf[`52`]
  }
  
  @scala.inline
  implicit class `52MutableBuilder`[Self <: `52`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ConditionalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
