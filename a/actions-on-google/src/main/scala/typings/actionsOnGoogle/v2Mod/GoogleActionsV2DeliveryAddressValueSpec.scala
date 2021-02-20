package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2DeliveryAddressValueSpec extends StObject {
  
  /**
    * Configuration for delivery address dialog.
    */
  var addressOptions: js.UndefOr[GoogleActionsV2DeliveryAddressValueSpecAddressOptions] = js.native
}
object GoogleActionsV2DeliveryAddressValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2DeliveryAddressValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2DeliveryAddressValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2DeliveryAddressValueSpecMutableBuilder[Self <: GoogleActionsV2DeliveryAddressValueSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressOptions(value: GoogleActionsV2DeliveryAddressValueSpecAddressOptions): Self = StObject.set(x, "addressOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressOptionsUndefined: Self = StObject.set(x, "addressOptions", js.undefined)
  }
}
