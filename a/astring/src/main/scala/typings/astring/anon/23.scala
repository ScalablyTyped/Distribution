package typings.astring.anon

import typings.astring.astringStrings.LogicalExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var `type`: LogicalExpression
}
object `23` {
  
  @scala.inline
  def apply(): `23` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("LogicalExpression")
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: LogicalExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
