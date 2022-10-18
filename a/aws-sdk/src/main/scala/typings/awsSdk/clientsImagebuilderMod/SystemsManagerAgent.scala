package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemsManagerAgent extends StObject {
  
  /**
    * Controls whether the Systems Manager agent is removed from your final build image, prior to creating the new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is left in, so that it is included in the new AMI. The default value is false.
    */
  var uninstallAfterBuild: js.UndefOr[NullableBoolean] = js.undefined
}
object SystemsManagerAgent {
  
  inline def apply(): SystemsManagerAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemsManagerAgent]
  }
  
  extension [Self <: SystemsManagerAgent](x: Self) {
    
    inline def setUninstallAfterBuild(value: NullableBoolean): Self = StObject.set(x, "uninstallAfterBuild", value.asInstanceOf[js.Any])
    
    inline def setUninstallAfterBuildUndefined: Self = StObject.set(x, "uninstallAfterBuild", js.undefined)
  }
}
