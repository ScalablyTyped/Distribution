package typings.astring.anon

import typings.astring.astringStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `36` extends StObject {
  
  var `type`: ImportSpecifier
}
object `36` {
  
  @scala.inline
  def apply(): `36` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportSpecifier")
    __obj.asInstanceOf[`36`]
  }
  
  @scala.inline
  implicit class `36MutableBuilder`[Self <: `36`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
