package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpliceInsertMessage extends StObject {
  
  /**
    * This is written to splice_insert.avail_num, as defined in section 9.7.3.1 of the SCTE-35 specification. The default value is 0. Values must be between 0 and 256, inclusive.
    */
  var AvailNum: js.UndefOr[integer] = js.undefined
  
  /**
    * This is written to splice_insert.avails_expected, as defined in section 9.7.3.1 of the SCTE-35 specification. The default value is 0. Values must be between 0 and 256, inclusive.
    */
  var AvailsExpected: js.UndefOr[integer] = js.undefined
  
  /**
    * This is written to splice_insert.splice_event_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The default value is 1.
    */
  var SpliceEventId: js.UndefOr[integer] = js.undefined
  
  /**
    * This is written to splice_insert.unique_program_id, as defined in section 9.7.3.1 of the SCTE-35 specification. The default value is 0. Values must be between 0 and 256, inclusive.
    */
  var UniqueProgramId: js.UndefOr[integer] = js.undefined
}
object SpliceInsertMessage {
  
  inline def apply(): SpliceInsertMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpliceInsertMessage]
  }
  
  extension [Self <: SpliceInsertMessage](x: Self) {
    
    inline def setAvailNum(value: integer): Self = StObject.set(x, "AvailNum", value.asInstanceOf[js.Any])
    
    inline def setAvailNumUndefined: Self = StObject.set(x, "AvailNum", js.undefined)
    
    inline def setAvailsExpected(value: integer): Self = StObject.set(x, "AvailsExpected", value.asInstanceOf[js.Any])
    
    inline def setAvailsExpectedUndefined: Self = StObject.set(x, "AvailsExpected", js.undefined)
    
    inline def setSpliceEventId(value: integer): Self = StObject.set(x, "SpliceEventId", value.asInstanceOf[js.Any])
    
    inline def setSpliceEventIdUndefined: Self = StObject.set(x, "SpliceEventId", js.undefined)
    
    inline def setUniqueProgramId(value: integer): Self = StObject.set(x, "UniqueProgramId", value.asInstanceOf[js.Any])
    
    inline def setUniqueProgramIdUndefined: Self = StObject.set(x, "UniqueProgramId", js.undefined)
  }
}
