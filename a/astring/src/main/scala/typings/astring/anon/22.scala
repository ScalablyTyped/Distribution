package typings.astring.anon

import typings.astring.astringStrings.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var `type`: VariableDeclaration
}
object `22` {
  
  @scala.inline
  def apply(): `22` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
