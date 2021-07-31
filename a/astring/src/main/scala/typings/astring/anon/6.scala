package typings.astring.anon

import typings.astring.astringStrings.TryStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var `type`: TryStatement
}
object `6` {
  
  @scala.inline
  def apply(): `6` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("TryStatement")
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: TryStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
