package typings.astring.anon

import typings.astring.astringStrings.ImportDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `66` extends StObject {
  
  var `type`: ImportDeclaration
}
object `66` {
  
  inline def apply(): `66` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ImportDeclaration")
    __obj.asInstanceOf[`66`]
  }
  
  extension [Self <: `66`](x: Self) {
    
    inline def setType(value: ImportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
