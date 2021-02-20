package typings.aliApp.my

import typings.aliApp.anon.Available
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeaconServiceChangeOptions
  extends BaseOptions[js.Any, js.Any] {
  
  @JSName("success")
  var success_BeaconServiceChangeOptions: js.UndefOr[js.Function1[/* res */ Available, Unit]] = js.native
}
object BeaconServiceChangeOptions {
  
  @scala.inline
  def apply(): BeaconServiceChangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconServiceChangeOptions]
  }
  
  @scala.inline
  implicit class BeaconServiceChangeOptionsMutableBuilder[Self <: BeaconServiceChangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: /* res */ Available => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
