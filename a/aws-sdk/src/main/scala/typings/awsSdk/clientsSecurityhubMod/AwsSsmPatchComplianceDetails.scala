package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsSsmPatchComplianceDetails extends StObject {
  
  /**
    * Information about the status of a patch.
    */
  var Patch: js.UndefOr[AwsSsmPatch] = js.undefined
}
object AwsSsmPatchComplianceDetails {
  
  inline def apply(): AwsSsmPatchComplianceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsSsmPatchComplianceDetails]
  }
  
  extension [Self <: AwsSsmPatchComplianceDetails](x: Self) {
    
    inline def setPatch(value: AwsSsmPatch): Self = StObject.set(x, "Patch", value.asInstanceOf[js.Any])
    
    inline def setPatchUndefined: Self = StObject.set(x, "Patch", js.undefined)
  }
}
