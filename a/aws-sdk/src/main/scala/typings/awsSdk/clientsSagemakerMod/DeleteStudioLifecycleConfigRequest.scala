package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStudioLifecycleConfigRequest extends StObject {
  
  /**
    * The name of the Studio Lifecycle Configuration to delete.
    */
  var StudioLifecycleConfigName: typings.awsSdk.clientsSagemakerMod.StudioLifecycleConfigName
}
object DeleteStudioLifecycleConfigRequest {
  
  inline def apply(StudioLifecycleConfigName: StudioLifecycleConfigName): DeleteStudioLifecycleConfigRequest = {
    val __obj = js.Dynamic.literal(StudioLifecycleConfigName = StudioLifecycleConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStudioLifecycleConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteStudioLifecycleConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setStudioLifecycleConfigName(value: StudioLifecycleConfigName): Self = StObject.set(x, "StudioLifecycleConfigName", value.asInstanceOf[js.Any])
  }
}
