package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends StObject {
  
  var region: Style = js.native
  
  var text: ContentStyle = js.native
}
object Region {
  
  @scala.inline
  def apply(region: Style, text: ContentStyle): Region = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegion(value: Style): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: ContentStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
