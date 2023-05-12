package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoftwareUpdateOptions extends StObject {
  
  /**
    * Whether automatic service software updates are enabled for the domain.
    */
  var AutoSoftwareUpdateEnabled: js.UndefOr[Boolean] = js.undefined
}
object SoftwareUpdateOptions {
  
  inline def apply(): SoftwareUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareUpdateOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftwareUpdateOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoSoftwareUpdateEnabled(value: Boolean): Self = StObject.set(x, "AutoSoftwareUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setAutoSoftwareUpdateEnabledUndefined: Self = StObject.set(x, "AutoSoftwareUpdateEnabled", js.undefined)
  }
}
