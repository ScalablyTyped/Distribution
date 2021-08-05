package typings.astring.anon

import typings.astring.astringStrings.ExpressionStatement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var `type`: ExpressionStatement
}
object `20` {
  
  inline def apply(): `20` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("ExpressionStatement")
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setType(value: ExpressionStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
