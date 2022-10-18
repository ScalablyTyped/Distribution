package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssessmentFramework extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the framework. 
    */
  var arn: js.UndefOr[AuditManagerArn] = js.undefined
  
  /**
    *  The control sets that are associated with the framework. 
    */
  var controlSets: js.UndefOr[AssessmentControlSets] = js.undefined
  
  /**
    *  The unique identifier for the framework. 
    */
  var id: js.UndefOr[UUID] = js.undefined
  
  var metadata: js.UndefOr[FrameworkMetadata] = js.undefined
}
object AssessmentFramework {
  
  inline def apply(): AssessmentFramework = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssessmentFramework]
  }
  
  extension [Self <: AssessmentFramework](x: Self) {
    
    inline def setArn(value: AuditManagerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setControlSets(value: AssessmentControlSets): Self = StObject.set(x, "controlSets", value.asInstanceOf[js.Any])
    
    inline def setControlSetsUndefined: Self = StObject.set(x, "controlSets", js.undefined)
    
    inline def setControlSetsVarargs(value: AssessmentControlSet*): Self = StObject.set(x, "controlSets", js.Array(value*))
    
    inline def setId(value: UUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: FrameworkMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
