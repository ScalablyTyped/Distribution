package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIncidentRecordOutput extends StObject {
  
  /**
    * Details the structure of the incident record.
    */
  var incidentRecord: IncidentRecord
}
object GetIncidentRecordOutput {
  
  inline def apply(incidentRecord: IncidentRecord): GetIncidentRecordOutput = {
    val __obj = js.Dynamic.literal(incidentRecord = incidentRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIncidentRecordOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIncidentRecordOutput] (val x: Self) extends AnyVal {
    
    inline def setIncidentRecord(value: IncidentRecord): Self = StObject.set(x, "incidentRecord", value.asInstanceOf[js.Any])
  }
}
