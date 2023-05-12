package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomActionNavigationOperation extends StObject {
  
  /**
    * The configuration that chooses the navigation target.
    */
  var LocalNavigationConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LocalNavigationConfiguration] = js.undefined
}
object CustomActionNavigationOperation {
  
  inline def apply(): CustomActionNavigationOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomActionNavigationOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomActionNavigationOperation] (val x: Self) extends AnyVal {
    
    inline def setLocalNavigationConfiguration(value: LocalNavigationConfiguration): Self = StObject.set(x, "LocalNavigationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setLocalNavigationConfigurationUndefined: Self = StObject.set(x, "LocalNavigationConfiguration", js.undefined)
  }
}
