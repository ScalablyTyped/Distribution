package typings.astring.anon

import typings.astring.astringStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var `type`: ExportSpecifier
}
object `38` {
  
  @scala.inline
  def apply(): `38` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[`38`]
  }
  
  @scala.inline
  implicit class `38MutableBuilder`[Self <: `38`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
