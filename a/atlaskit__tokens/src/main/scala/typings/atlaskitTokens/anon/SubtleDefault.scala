package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtleDefault extends StObject {
  
  var subtle: Default
}
object SubtleDefault {
  
  inline def apply(subtle: Default): SubtleDefault = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtleDefault]
  }
  
  extension [Self <: SubtleDefault](x: Self) {
    
    inline def setSubtle(value: Default): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
  }
}
