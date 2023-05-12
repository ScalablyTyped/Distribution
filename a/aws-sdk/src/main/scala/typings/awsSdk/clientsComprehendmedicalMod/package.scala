package typings.awsSdk.clientsComprehendmedicalMod

import typings.awsSdk.awsSdkStrings.MEDICAL_CONDITION
import typings.awsSdk.awsSdkStrings.MEDICATION
import typings.awsSdk.awsSdkStrings.NEGATION
import typings.awsSdk.awsSdkStrings.en_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyLengthString = java.lang.String

type AttributeList = js.Array[Attribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SIGN
  - typings.awsSdk.awsSdkStrings.SYMPTOM
  - typings.awsSdk.awsSdkStrings.DIAGNOSIS
  - typings.awsSdk.awsSdkStrings.NEGATION
  - typings.awsSdk.awsSdkStrings.PERTAINS_TO_FAMILY
  - typings.awsSdk.awsSdkStrings.HYPOTHETICAL
  - typings.awsSdk.awsSdkStrings.LOW_CONFIDENCE
  - typings.awsSdk.awsSdkStrings.PAST_HISTORY
  - typings.awsSdk.awsSdkStrings.FUTURE
  - java.lang.String
*/
type AttributeName = _AttributeName | java.lang.String

type BoundedLengthString = java.lang.String

type ClientRequestTokenString = java.lang.String

type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]

type EntityList = js.Array[Entity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.DX_NAME
  - typings.awsSdk.awsSdkStrings.DOSAGE
  - typings.awsSdk.awsSdkStrings.ROUTE_OR_MODE
  - typings.awsSdk.awsSdkStrings.FORM
  - typings.awsSdk.awsSdkStrings.FREQUENCY
  - typings.awsSdk.awsSdkStrings.DURATION
  - typings.awsSdk.awsSdkStrings.GENERIC_NAME
  - typings.awsSdk.awsSdkStrings.BRAND_NAME
  - typings.awsSdk.awsSdkStrings.STRENGTH
  - typings.awsSdk.awsSdkStrings.RATE
  - typings.awsSdk.awsSdkStrings.ACUITY
  - typings.awsSdk.awsSdkStrings.TEST_NAME
  - typings.awsSdk.awsSdkStrings.TEST_VALUE
  - typings.awsSdk.awsSdkStrings.TEST_UNITS
  - typings.awsSdk.awsSdkStrings.TEST_UNIT
  - typings.awsSdk.awsSdkStrings.PROCEDURE_NAME
  - typings.awsSdk.awsSdkStrings.TREATMENT_NAME
  - typings.awsSdk.awsSdkStrings.DATE
  - typings.awsSdk.awsSdkStrings.AGE
  - typings.awsSdk.awsSdkStrings.CONTACT_POINT
  - typings.awsSdk.awsSdkStrings.PHONE_OR_FAX
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.IDENTIFIER
  - typings.awsSdk.awsSdkStrings.ID
  - typings.awsSdk.awsSdkStrings.URL
  - typings.awsSdk.awsSdkStrings.ADDRESS
  - typings.awsSdk.awsSdkStrings.PROFESSION
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typings.awsSdk.awsSdkStrings.DIRECTION
  - typings.awsSdk.awsSdkStrings.QUALITY
  - typings.awsSdk.awsSdkStrings.QUANTITY
  - typings.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - typings.awsSdk.awsSdkStrings.TIME_TO_MEDICATION_NAME
  - typings.awsSdk.awsSdkStrings.TIME_TO_DX_NAME
  - typings.awsSdk.awsSdkStrings.TIME_TO_TEST_NAME
  - typings.awsSdk.awsSdkStrings.TIME_TO_PROCEDURE_NAME
  - typings.awsSdk.awsSdkStrings.TIME_TO_TREATMENT_NAME
  - typings.awsSdk.awsSdkStrings.AMOUNT
  - typings.awsSdk.awsSdkStrings.GENDER
  - typings.awsSdk.awsSdkStrings.RACE_ETHNICITY
  - typings.awsSdk.awsSdkStrings.ALLERGIES
  - typings.awsSdk.awsSdkStrings.TOBACCO_USE
  - typings.awsSdk.awsSdkStrings.ALCOHOL_CONSUMPTION
  - typings.awsSdk.awsSdkStrings.REC_DRUG_USE
  - java.lang.String
*/
type EntitySubType = _EntitySubType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MEDICATION
  - typings.awsSdk.awsSdkStrings.MEDICAL_CONDITION
  - typings.awsSdk.awsSdkStrings.PROTECTED_HEALTH_INFORMATION
  - typings.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
  - typings.awsSdk.awsSdkStrings.ANATOMY
  - typings.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - typings.awsSdk.awsSdkStrings.BEHAVIORAL_ENVIRONMENTAL_SOCIAL
  - java.lang.String
*/
type EntityType = _EntityType | java.lang.String

type Float = Double

type ICD10CMAttributeList = js.Array[ICD10CMAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACUITY
  - typings.awsSdk.awsSdkStrings.DIRECTION
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typings.awsSdk.awsSdkStrings.QUALITY
  - typings.awsSdk.awsSdkStrings.QUANTITY
  - typings.awsSdk.awsSdkStrings.TIME_TO_DX_NAME
  - typings.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - java.lang.String
*/
type ICD10CMAttributeType = _ICD10CMAttributeType | java.lang.String

type ICD10CMConceptList = js.Array[ICD10CMConcept]

type ICD10CMEntityCategory = MEDICAL_CONDITION | java.lang.String

type ICD10CMEntityList = js.Array[ICD10CMEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DX_NAME
  - typings.awsSdk.awsSdkStrings.TIME_EXPRESSION
  - java.lang.String
*/
type ICD10CMEntityType = _ICD10CMEntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OVERLAP
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - java.lang.String
*/
type ICD10CMRelationshipType = _ICD10CMRelationshipType | java.lang.String

type ICD10CMTraitList = js.Array[ICD10CMTrait]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEGATION
  - typings.awsSdk.awsSdkStrings.DIAGNOSIS
  - typings.awsSdk.awsSdkStrings.SIGN
  - typings.awsSdk.awsSdkStrings.SYMPTOM
  - typings.awsSdk.awsSdkStrings.PERTAINS_TO_FAMILY
  - typings.awsSdk.awsSdkStrings.HYPOTHETICAL
  - typings.awsSdk.awsSdkStrings.LOW_CONFIDENCE
  - java.lang.String
*/
type ICD10CMTraitName = _ICD10CMTraitName | java.lang.String

type IamRoleArn = java.lang.String

type Integer = Double

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.PARTIAL_SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type KMSKey = java.lang.String

type LanguageCode = en_ | java.lang.String

type ManifestFilePath = java.lang.String

type MaxResultsInteger = Double

type ModelVersion = java.lang.String

type OntologyLinkingBoundedLengthString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EVERY
  - typings.awsSdk.awsSdkStrings.WITH_DOSAGE
  - typings.awsSdk.awsSdkStrings.ADMINISTERED_VIA
  - typings.awsSdk.awsSdkStrings.FOR
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - typings.awsSdk.awsSdkStrings.OVERLAP
  - typings.awsSdk.awsSdkStrings.DOSAGE
  - typings.awsSdk.awsSdkStrings.ROUTE_OR_MODE
  - typings.awsSdk.awsSdkStrings.FORM
  - typings.awsSdk.awsSdkStrings.FREQUENCY
  - typings.awsSdk.awsSdkStrings.DURATION
  - typings.awsSdk.awsSdkStrings.STRENGTH
  - typings.awsSdk.awsSdkStrings.RATE
  - typings.awsSdk.awsSdkStrings.ACUITY
  - typings.awsSdk.awsSdkStrings.TEST_VALUE
  - typings.awsSdk.awsSdkStrings.TEST_UNITS
  - typings.awsSdk.awsSdkStrings.TEST_UNIT
  - typings.awsSdk.awsSdkStrings.DIRECTION
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typings.awsSdk.awsSdkStrings.AMOUNT
  - java.lang.String
*/
type RelationshipType = _RelationshipType | java.lang.String

type RxNormAttributeList = js.Array[RxNormAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DOSAGE
  - typings.awsSdk.awsSdkStrings.DURATION
  - typings.awsSdk.awsSdkStrings.FORM
  - typings.awsSdk.awsSdkStrings.FREQUENCY
  - typings.awsSdk.awsSdkStrings.RATE
  - typings.awsSdk.awsSdkStrings.ROUTE_OR_MODE
  - typings.awsSdk.awsSdkStrings.STRENGTH
  - java.lang.String
*/
type RxNormAttributeType = _RxNormAttributeType | java.lang.String

type RxNormConceptList = js.Array[RxNormConcept]

type RxNormEntityCategory = MEDICATION | java.lang.String

type RxNormEntityList = js.Array[RxNormEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BRAND_NAME
  - typings.awsSdk.awsSdkStrings.GENERIC_NAME
  - java.lang.String
*/
type RxNormEntityType = _RxNormEntityType | java.lang.String

type RxNormTraitList = js.Array[RxNormTrait]

type RxNormTraitName = NEGATION | java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SNOMEDCTAttributeList = js.Array[SNOMEDCTAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACUITY
  - typings.awsSdk.awsSdkStrings.QUALITY
  - typings.awsSdk.awsSdkStrings.DIRECTION
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - typings.awsSdk.awsSdkStrings.TEST_VALUE
  - typings.awsSdk.awsSdkStrings.TEST_UNIT
  - java.lang.String
*/
type SNOMEDCTAttributeType = _SNOMEDCTAttributeType | java.lang.String

type SNOMEDCTConceptList = js.Array[SNOMEDCTConcept]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MEDICAL_CONDITION
  - typings.awsSdk.awsSdkStrings.ANATOMY
  - typings.awsSdk.awsSdkStrings.TEST_TREATMENT_PROCEDURE
  - java.lang.String
*/
type SNOMEDCTEntityCategory = _SNOMEDCTEntityCategory | java.lang.String

type SNOMEDCTEntityList = js.Array[SNOMEDCTEntity]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DX_NAME
  - typings.awsSdk.awsSdkStrings.TEST_NAME
  - typings.awsSdk.awsSdkStrings.PROCEDURE_NAME
  - typings.awsSdk.awsSdkStrings.TREATMENT_NAME
  - java.lang.String
*/
type SNOMEDCTEntityType = _SNOMEDCTEntityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACUITY
  - typings.awsSdk.awsSdkStrings.QUALITY
  - typings.awsSdk.awsSdkStrings.TEST_VALUE
  - typings.awsSdk.awsSdkStrings.TEST_UNITS
  - typings.awsSdk.awsSdkStrings.DIRECTION
  - typings.awsSdk.awsSdkStrings.SYSTEM_ORGAN_SITE
  - java.lang.String
*/
type SNOMEDCTRelationshipType = _SNOMEDCTRelationshipType | java.lang.String

type SNOMEDCTTraitList = js.Array[SNOMEDCTTrait]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEGATION
  - typings.awsSdk.awsSdkStrings.DIAGNOSIS
  - typings.awsSdk.awsSdkStrings.SIGN
  - typings.awsSdk.awsSdkStrings.SYMPTOM
  - typings.awsSdk.awsSdkStrings.PERTAINS_TO_FAMILY
  - typings.awsSdk.awsSdkStrings.HYPOTHETICAL
  - typings.awsSdk.awsSdkStrings.LOW_CONFIDENCE
  - typings.awsSdk.awsSdkStrings.PAST_HISTORY
  - typings.awsSdk.awsSdkStrings.FUTURE
  - java.lang.String
*/
type SNOMEDCTTraitName = _SNOMEDCTTraitName | java.lang.String

type String = java.lang.String

type Timestamp = js.Date

type TraitList = js.Array[Trait]

type UnmappedAttributeList = js.Array[UnmappedAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-10-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
