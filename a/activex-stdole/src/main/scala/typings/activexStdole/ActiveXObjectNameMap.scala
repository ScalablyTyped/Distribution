package typings.activexStdole

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  var StdFont: typings.activexStdole.stdole.StdFont
  
  var StdPicture: typings.activexStdole.stdole.StdPicture
}
object ActiveXObjectNameMap {
  
  inline def apply(StdFont: StdFont, StdPicture: StdPicture): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(StdFont = StdFont.asInstanceOf[js.Any], StdPicture = StdPicture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setStdFont(value: StdFont): Self = StObject.set(x, "StdFont", value.asInstanceOf[js.Any])
    
    inline def setStdPicture(value: StdPicture): Self = StObject.set(x, "StdPicture", value.asInstanceOf[js.Any])
  }
}
