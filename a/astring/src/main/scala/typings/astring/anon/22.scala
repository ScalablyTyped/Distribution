package typings.astring.anon

import typings.astring.astringStrings.VariableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `22` extends StObject {
  
  var `type`: VariableDeclaration
}
object `22` {
  
  inline def apply(): `22` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("VariableDeclaration")
    __obj.asInstanceOf[`22`]
  }
  
  extension [Self <: `22`](x: Self) {
    
    inline def setType(value: VariableDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
