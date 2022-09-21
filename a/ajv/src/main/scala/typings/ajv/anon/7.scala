package typings.ajv.anon

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  var nullable: `true`
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal(nullable = true)
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setNullable(value: `true`): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
  }
}
