package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderDisabled extends StObject {
  
  var border: Disabled
}
object BorderDisabled {
  
  inline def apply(border: Disabled): BorderDisabled = {
    val __obj = js.Dynamic.literal(border = border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BorderDisabled] (val x: Self) extends AnyVal {
    
    inline def setBorder(value: Disabled): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
  }
}
