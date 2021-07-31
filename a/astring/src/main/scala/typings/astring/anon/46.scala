package typings.astring.anon

import typings.astring.astringStrings.ArrowFunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `46` extends StObject {
  
  var `type`: ArrowFunctionExpression
}
object `46` {
  
  @scala.inline
  def apply(): `46` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ArrowFunctionExpression")
    __obj.asInstanceOf[`46`]
  }
  
  @scala.inline
  implicit class `46MutableBuilder`[Self <: `46`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
