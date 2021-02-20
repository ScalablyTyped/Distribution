package typings.astring.anon

import typings.astring.astringStrings.FunctionExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `57` extends StObject {
  
  var `type`: FunctionExpression = js.native
}
object `57` {
  
  @scala.inline
  def apply(`type`: FunctionExpression): `57` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`57`]
  }
  
  @scala.inline
  implicit class `57MutableBuilder`[Self <: `57`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
