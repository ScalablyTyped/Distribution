package typings.astring.anon

import typings.astring.astringStrings.ImportDefaultSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var `type`: ImportDefaultSpecifier
}
object `4` {
  
  @scala.inline
  def apply(): `4` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDefaultSpecifier")
    __obj.asInstanceOf[`4`]
  }
  
  @scala.inline
  implicit class `4MutableBuilder`[Self <: `4`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportDefaultSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
