package typings.astring.anon

import typings.astring.astringStrings.YieldExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  var `type`: YieldExpression = js.native
}
object `2` {
  
  @scala.inline
  def apply(`type`: YieldExpression): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: YieldExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
