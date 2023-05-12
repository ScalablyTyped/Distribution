package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadSetFilter extends StObject {
  
  /**
    * The filter's start date.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The filter's end date.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  Where the source originated. 
    */
  var generatedFrom: js.UndefOr[GeneratedFrom] = js.undefined
  
  /**
    * A name to filter on.
    */
  var name: js.UndefOr[ReadSetName] = js.undefined
  
  /**
    * A genome reference ARN to filter on.
    */
  var referenceArn: js.UndefOr[ReferenceArn] = js.undefined
  
  /**
    *  The read set source's sample ID. 
    */
  var sampleId: js.UndefOr[SampleId] = js.undefined
  
  /**
    * A status to filter on.
    */
  var status: js.UndefOr[ReadSetStatus] = js.undefined
  
  /**
    *  The read set source's subject ID. 
    */
  var subjectId: js.UndefOr[SubjectId] = js.undefined
}
object ReadSetFilter {
  
  inline def apply(): ReadSetFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadSetFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadSetFilter] (val x: Self) extends AnyVal {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setGeneratedFrom(value: GeneratedFrom): Self = StObject.set(x, "generatedFrom", value.asInstanceOf[js.Any])
    
    inline def setGeneratedFromUndefined: Self = StObject.set(x, "generatedFrom", js.undefined)
    
    inline def setName(value: ReadSetName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReferenceArn(value: ReferenceArn): Self = StObject.set(x, "referenceArn", value.asInstanceOf[js.Any])
    
    inline def setReferenceArnUndefined: Self = StObject.set(x, "referenceArn", js.undefined)
    
    inline def setSampleId(value: SampleId): Self = StObject.set(x, "sampleId", value.asInstanceOf[js.Any])
    
    inline def setSampleIdUndefined: Self = StObject.set(x, "sampleId", js.undefined)
    
    inline def setStatus(value: ReadSetStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubjectId(value: SubjectId): Self = StObject.set(x, "subjectId", value.asInstanceOf[js.Any])
    
    inline def setSubjectIdUndefined: Self = StObject.set(x, "subjectId", js.undefined)
  }
}
