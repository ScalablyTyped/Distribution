package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconDisabled extends StObject {
  
  var icon: Disabled
}
object IconDisabled {
  
  inline def apply(icon: Disabled): IconDisabled = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IconDisabled] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: Disabled): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
  }
}
