package typings.astring.anon

import typings.astring.astringStrings.EmptyStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `33` extends StObject {
  
  var `type`: EmptyStatement
}
object `33` {
  
  inline def apply(): `33` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("EmptyStatement")
    __obj.asInstanceOf[`33`]
  }
  
  extension [Self <: `33`](x: Self) {
    
    inline def setType(value: EmptyStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
