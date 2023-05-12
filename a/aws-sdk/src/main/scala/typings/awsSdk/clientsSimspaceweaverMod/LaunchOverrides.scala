package typings.awsSdk.clientsSimspaceweaverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchOverrides extends StObject {
  
  /**
    * App launch commands and command line parameters that override the launch command configured in the simulation schema.
    */
  var LaunchCommands: js.UndefOr[LaunchCommandList] = js.undefined
}
object LaunchOverrides {
  
  inline def apply(): LaunchOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchOverrides]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LaunchOverrides] (val x: Self) extends AnyVal {
    
    inline def setLaunchCommands(value: LaunchCommandList): Self = StObject.set(x, "LaunchCommands", value.asInstanceOf[js.Any])
    
    inline def setLaunchCommandsUndefined: Self = StObject.set(x, "LaunchCommands", js.undefined)
    
    inline def setLaunchCommandsVarargs(value: NonEmptyString*): Self = StObject.set(x, "LaunchCommands", js.Array(value*))
  }
}
