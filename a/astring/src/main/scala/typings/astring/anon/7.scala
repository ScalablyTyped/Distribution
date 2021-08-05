package typings.astring.anon

import typings.astring.astringStrings.BlockStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var `type`: BlockStatement
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("BlockStatement")
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setType(value: BlockStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
