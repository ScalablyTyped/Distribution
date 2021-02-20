package typings.astring.anon

import typings.astring.astringStrings.DebuggerStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `43` extends StObject {
  
  var `type`: DebuggerStatement = js.native
}
object `43` {
  
  @scala.inline
  def apply(`type`: DebuggerStatement): `43` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`43`]
  }
  
  @scala.inline
  implicit class `43MutableBuilder`[Self <: `43`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DebuggerStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
