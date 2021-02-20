package typings.aliApp.my

import typings.aliApp.anon.Beacons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeaconUpdateOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_BeaconUpdateOptions: js.UndefOr[js.Function1[/* res */ Beacons, Unit]] = js.native
}
object BeaconUpdateOptions {
  
  @scala.inline
  def apply(): BeaconUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconUpdateOptions]
  }
  
  @scala.inline
  implicit class BeaconUpdateOptionsMutableBuilder[Self <: BeaconUpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ Beacons => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
