package typings.astring.anon

import typings.astring.astringStrings.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var `type`: ExportNamedDeclaration
}
object `14` {
  
  @scala.inline
  def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[`14`]
  }
  
  @scala.inline
  implicit class `14MutableBuilder`[Self <: `14`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
