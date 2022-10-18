package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatchBaselineForPatchGroupResult extends StObject {
  
  /**
    * The ID of the patch baseline that should be used for the patch group.
    */
  var BaselineId: js.UndefOr[typings.awsSdk.clientsSsmMod.BaselineId] = js.undefined
  
  /**
    * The operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[typings.awsSdk.clientsSsmMod.OperatingSystem] = js.undefined
  
  /**
    * The name of the patch group.
    */
  var PatchGroup: js.UndefOr[typings.awsSdk.clientsSsmMod.PatchGroup] = js.undefined
}
object GetPatchBaselineForPatchGroupResult {
  
  inline def apply(): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
  
  extension [Self <: GetPatchBaselineForPatchGroupResult](x: Self) {
    
    inline def setBaselineId(value: BaselineId): Self = StObject.set(x, "BaselineId", value.asInstanceOf[js.Any])
    
    inline def setBaselineIdUndefined: Self = StObject.set(x, "BaselineId", js.undefined)
    
    inline def setOperatingSystem(value: OperatingSystem): Self = StObject.set(x, "OperatingSystem", value.asInstanceOf[js.Any])
    
    inline def setOperatingSystemUndefined: Self = StObject.set(x, "OperatingSystem", js.undefined)
    
    inline def setPatchGroup(value: PatchGroup): Self = StObject.set(x, "PatchGroup", value.asInstanceOf[js.Any])
    
    inline def setPatchGroupUndefined: Self = StObject.set(x, "PatchGroup", js.undefined)
  }
}
