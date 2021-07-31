package typings.astring.anon

import typings.astring.astringStrings.ExportDefaultDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `26` extends StObject {
  
  var `type`: ExportDefaultDeclaration
}
object `26` {
  
  @scala.inline
  def apply(): `26` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportDefaultDeclaration")
    __obj.asInstanceOf[`26`]
  }
  
  @scala.inline
  implicit class `26MutableBuilder`[Self <: `26`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportDefaultDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
