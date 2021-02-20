package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Application
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("PowerPoint.Application")
  var PowerPointDotApplication: Application = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(PowerPointDotApplication: Application): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PowerPoint.Application")(PowerPointDotApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPowerPointDotApplication(value: Application): Self = StObject.set(x, "PowerPoint.Application", value.asInstanceOf[js.Any])
  }
}
