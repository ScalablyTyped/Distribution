package typings.astring.anon

import typings.astring.astringStrings.ExportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `38` extends StObject {
  
  var `type`: ExportSpecifier
}
object `38` {
  
  inline def apply(): `38` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportSpecifier")
    __obj.asInstanceOf[`38`]
  }
  
  extension [Self <: `38`](x: Self) {
    
    inline def setType(value: ExportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
