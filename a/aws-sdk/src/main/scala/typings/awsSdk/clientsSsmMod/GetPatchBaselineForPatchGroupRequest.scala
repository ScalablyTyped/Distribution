package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineForPatchGroupRequest extends StObject {
  
  /**
    * Returns the operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsSsmMod.OperatingSystem] = js.undefined
  
  /**
    * The name of the patch group whose patch baseline should be retrieved.
    */
  var PatchGroup: typings.awsSdk.clientsSsmMod.PatchGroup
}
object GetPatchBaselineForPatchGroupRequest {
  
  inline def apply(PatchGroup: PatchGroup): GetPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupRequest]
  }
  
  extension [Self <: GetPatchBaselineForPatchGroupRequest](x: Self) {
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
  }
}
