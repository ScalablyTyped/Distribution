package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldDefault extends StObject {
  
  var bold: Default
}
object BoldDefault {
  
  inline def apply(bold: Default): BoldDefault = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BoldDefault] (val x: Self) extends AnyVal {
    
    inline def setBold(value: Default): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
  }
}
