package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QualificationType extends StObject {
  
  /**
    * The answers to the Qualification test specified in the Test parameter.
    */
  var AnswerKey: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Valid values are True | False.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is 1 by default. 
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.undefined
  
  /**
    *  The date and time the Qualification type was created. 
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  A long description for the Qualification type. 
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    *  Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by the system. Valid values are True | False. 
    */
  var IsRequestable: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type easier to find using a search. 
    */
  var Keywords: js.UndefOr[String] = js.undefined
  
  /**
    *  The name of the Qualification type. The type name is used to identify the type, and to find the type using a Qualification type search. 
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    *  A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you call the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  The status of the Qualification type. A Qualification type's status determines if users can apply to receive a Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are Active | Inactive. 
    */
  var QualificationTypeStatus: js.UndefOr[typings.awsSdk.clientsMturkMod.QualificationTypeStatus] = js.undefined
  
  /**
    *  The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries are disabled and Workers can request a Qualification only once. 
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.undefined
  
  /**
    *  The questions for a Qualification test associated with this Qualification type that a user can take to obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot have both a specified Test parameter and an AutoGranted value of true. 
    */
  var Test: js.UndefOr[String] = js.undefined
  
  /**
    *  The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the Worker requests the Qualification. 
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.undefined
}
object QualificationType {
  
  inline def apply(): QualificationType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QualificationType]
  }
  
  extension [Self <: QualificationType](x: Self) {
    
    inline def setAnswerKey(value: String): Self = StObject.set(x, "AnswerKey", value.asInstanceOf[js.Any])
    
    inline def setAnswerKeyUndefined: Self = StObject.set(x, "AnswerKey", js.undefined)
    
    inline def setAutoGranted(value: Boolean): Self = StObject.set(x, "AutoGranted", value.asInstanceOf[js.Any])
    
    inline def setAutoGrantedUndefined: Self = StObject.set(x, "AutoGranted", js.undefined)
    
    inline def setAutoGrantedValue(value: Integer): Self = StObject.set(x, "AutoGrantedValue", value.asInstanceOf[js.Any])
    
    inline def setAutoGrantedValueUndefined: Self = StObject.set(x, "AutoGrantedValue", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIsRequestable(value: Boolean): Self = StObject.set(x, "IsRequestable", value.asInstanceOf[js.Any])
    
    inline def setIsRequestableUndefined: Self = StObject.set(x, "IsRequestable", js.undefined)
    
    inline def setKeywords(value: String): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setKeywordsUndefined: Self = StObject.set(x, "Keywords", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQualificationTypeId(value: EntityId): Self = StObject.set(x, "QualificationTypeId", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeIdUndefined: Self = StObject.set(x, "QualificationTypeId", js.undefined)
    
    inline def setQualificationTypeStatus(value: QualificationTypeStatus): Self = StObject.set(x, "QualificationTypeStatus", value.asInstanceOf[js.Any])
    
    inline def setQualificationTypeStatusUndefined: Self = StObject.set(x, "QualificationTypeStatus", js.undefined)
    
    inline def setRetryDelayInSeconds(value: Long): Self = StObject.set(x, "RetryDelayInSeconds", value.asInstanceOf[js.Any])
    
    inline def setRetryDelayInSecondsUndefined: Self = StObject.set(x, "RetryDelayInSeconds", js.undefined)
    
    inline def setTest(value: String): Self = StObject.set(x, "Test", value.asInstanceOf[js.Any])
    
    inline def setTestDurationInSeconds(value: Long): Self = StObject.set(x, "TestDurationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTestDurationInSecondsUndefined: Self = StObject.set(x, "TestDurationInSeconds", js.undefined)
    
    inline def setTestUndefined: Self = StObject.set(x, "Test", js.undefined)
  }
}
