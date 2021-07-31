package typings.astring.anon

import typings.astring.astringStrings.FunctionDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `42` extends StObject {
  
  var `type`: FunctionDeclaration
}
object `42` {
  
  @scala.inline
  def apply(): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("FunctionDeclaration")
    __obj.asInstanceOf[`42`]
  }
  
  @scala.inline
  implicit class `42MutableBuilder`[Self <: `42`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: FunctionDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
