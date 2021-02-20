package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowLeafIcon extends StObject {
  
  var showLeafIcon: Boolean = js.native
}
object ShowLeafIcon {
  
  @scala.inline
  def apply(showLeafIcon: Boolean): ShowLeafIcon = {
    val __obj = js.Dynamic.literal(showLeafIcon = showLeafIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowLeafIcon]
  }
  
  @scala.inline
  implicit class ShowLeafIconMutableBuilder[Self <: ShowLeafIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShowLeafIcon(value: Boolean): Self = StObject.set(x, "showLeafIcon", value.asInstanceOf[js.Any])
  }
}
