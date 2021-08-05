package typings.astring.anon

import typings.astring.astringStrings.ExportNamedDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var `type`: ExportNamedDeclaration
}
object `14` {
  
  inline def apply(): `14` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExportNamedDeclaration")
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setType(value: ExportNamedDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
