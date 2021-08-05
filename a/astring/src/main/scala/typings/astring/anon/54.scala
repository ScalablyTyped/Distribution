package typings.astring.anon

import typings.astring.astringStrings.CatchClause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `54` extends StObject {
  
  var `type`: CatchClause
}
object `54` {
  
  inline def apply(): `54` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CatchClause")
    __obj.asInstanceOf[`54`]
  }
  
  extension [Self <: `54`](x: Self) {
    
    inline def setType(value: CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
