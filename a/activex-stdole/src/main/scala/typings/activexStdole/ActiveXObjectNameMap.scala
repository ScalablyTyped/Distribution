package typings.activexStdole

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  var StdFont: typings.activexStdole.stdole.StdFont = js.native
  
  var StdPicture: typings.activexStdole.stdole.StdPicture = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(StdFont: StdFont, StdPicture: StdPicture): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(StdFont = StdFont.asInstanceOf[js.Any], StdPicture = StdPicture.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStdFont(value: StdFont): Self = StObject.set(x, "StdFont", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdPicture(value: StdPicture): Self = StObject.set(x, "StdPicture", value.asInstanceOf[js.Any])
  }
}
