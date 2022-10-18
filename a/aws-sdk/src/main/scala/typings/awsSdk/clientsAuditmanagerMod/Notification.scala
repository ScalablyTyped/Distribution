package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /**
    *  The identifier for the assessment. 
    */
  var assessmentId: js.UndefOr[UUID] = js.undefined
  
  /**
    *  The name of the related assessment. 
    */
  var assessmentName: js.UndefOr[AssessmentName] = js.undefined
  
  /**
    *  The identifier for the control set. 
    */
  var controlSetId: js.UndefOr[ControlSetId] = js.undefined
  
  /**
    *  Specifies the name of the control set that the notification is about. 
    */
  var controlSetName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The description of the notification. 
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The time when the notification was sent. 
    */
  var eventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique identifier for the notification. 
    */
  var id: js.UndefOr[TimestampUUID] = js.undefined
  
  /**
    *  The sender of the notification. 
    */
  var source: js.UndefOr[NonEmptyString] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setAssessmentId(value: UUID): Self = StObject.set(x, "assessmentId", value.asInstanceOf[js.Any])
    
    inline def setAssessmentIdUndefined: Self = StObject.set(x, "assessmentId", js.undefined)
    
    inline def setAssessmentName(value: AssessmentName): Self = StObject.set(x, "assessmentName", value.asInstanceOf[js.Any])
    
    inline def setAssessmentNameUndefined: Self = StObject.set(x, "assessmentName", js.undefined)
    
    inline def setControlSetId(value: ControlSetId): Self = StObject.set(x, "controlSetId", value.asInstanceOf[js.Any])
    
    inline def setControlSetIdUndefined: Self = StObject.set(x, "controlSetId", js.undefined)
    
    inline def setControlSetName(value: NonEmptyString): Self = StObject.set(x, "controlSetName", value.asInstanceOf[js.Any])
    
    inline def setControlSetNameUndefined: Self = StObject.set(x, "controlSetName", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setId(value: TimestampUUID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSource(value: NonEmptyString): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
