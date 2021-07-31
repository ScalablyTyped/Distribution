package typings.astring.anon

import typings.astring.astringStrings.UnaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `55` extends StObject {
  
  var `type`: UnaryExpression
}
object `55` {
  
  @scala.inline
  def apply(): `55` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("UnaryExpression")
    __obj.asInstanceOf[`55`]
  }
  
  @scala.inline
  implicit class `55MutableBuilder`[Self <: `55`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: UnaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
