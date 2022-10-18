package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartIncidentOutput extends StObject {
  
  /**
    * The ARN of the newly created incident record.
    */
  var incidentRecordArn: Arn
}
object StartIncidentOutput {
  
  inline def apply(incidentRecordArn: Arn): StartIncidentOutput = {
    val __obj = js.Dynamic.literal(incidentRecordArn = incidentRecordArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartIncidentOutput]
  }
  
  extension [Self <: StartIncidentOutput](x: Self) {
    
    inline def setIncidentRecordArn(value: Arn): Self = StObject.set(x, "incidentRecordArn", value.asInstanceOf[js.Any])
  }
}
