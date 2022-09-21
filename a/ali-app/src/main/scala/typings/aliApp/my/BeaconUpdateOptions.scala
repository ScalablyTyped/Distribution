package typings.aliApp.my

import typings.aliApp.anon.Beacons
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeaconUpdateOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_BeaconUpdateOptions: js.UndefOr[js.Function1[/* res */ Beacons, Unit]] = js.undefined
}
object BeaconUpdateOptions {
  
  inline def apply(): BeaconUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeaconUpdateOptions]
  }
  
  extension [Self <: BeaconUpdateOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ Beacons => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
