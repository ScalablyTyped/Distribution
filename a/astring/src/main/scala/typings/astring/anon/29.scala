package typings.astring.anon

import typings.astring.astringStrings.BinaryExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29` extends StObject {
  
  var `type`: BinaryExpression
}
object `29` {
  
  @scala.inline
  def apply(): `29` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BinaryExpression")
    __obj.asInstanceOf[`29`]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: BinaryExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
