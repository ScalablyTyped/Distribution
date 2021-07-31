package typings.astring.anon

import typings.astring.astringStrings.AwaitExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `35` extends StObject {
  
  var `type`: AwaitExpression
}
object `35` {
  
  @scala.inline
  def apply(): `35` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("AwaitExpression")
    __obj.asInstanceOf[`35`]
  }
  
  @scala.inline
  implicit class `35MutableBuilder`[Self <: `35`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: AwaitExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
