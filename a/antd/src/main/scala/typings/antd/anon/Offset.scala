package typings.antd.anon

import typings.antd.antdStrings.down
import typings.antd.antdStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset extends StObject {
  
  var offset: Double
  
  var `type`: up | down
}
object Offset {
  
  inline def apply(offset: Double, `type`: up | down): Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  extension [Self <: Offset](x: Self) {
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setType(value: up | down): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
