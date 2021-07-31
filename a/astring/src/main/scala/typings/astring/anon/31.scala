package typings.astring.anon

import typings.astring.astringStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `31` extends StObject {
  
  var `type`: Identifier
}
object `31` {
  
  @scala.inline
  def apply(): `31` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[`31`]
  }
  
  @scala.inline
  implicit class `31MutableBuilder`[Self <: `31`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
