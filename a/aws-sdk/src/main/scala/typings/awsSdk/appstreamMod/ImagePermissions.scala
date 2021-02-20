package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImagePermissions extends StObject {
  
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.native
  
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.native
}
object ImagePermissions {
  
  @scala.inline
  def apply(): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermissions]
  }
  
  @scala.inline
  implicit class ImagePermissionsMutableBuilder[Self <: ImagePermissions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowFleet(value: BooleanObject): Self = StObject.set(x, "allowFleet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFleetUndefined: Self = StObject.set(x, "allowFleet", js.undefined)
    
    @scala.inline
    def setAllowImageBuilder(value: BooleanObject): Self = StObject.set(x, "allowImageBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowImageBuilderUndefined: Self = StObject.set(x, "allowImageBuilder", js.undefined)
  }
}
