package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComprehendmedicalMod {
  import typings.awsDashSdk.awsDashSdkStrings.DX_NAME
  import typings.awsDashSdk.awsDashSdkStrings.MEDICAL_CONDITION
  import typings.awsDashSdk.awsDashSdkStrings.MEDICATION
  import typings.awsDashSdk.awsDashSdkStrings.NEGATION
  import typings.awsDashSdk.awsDashSdkStrings.en
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AnyLengthString = java.lang.String
  type AttributeList = js.Array[Attribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIGN
    - typings.awsDashSdk.awsDashSdkStrings.SYMPTOM
    - typings.awsDashSdk.awsDashSdkStrings.DIAGNOSIS
    - typings.awsDashSdk.awsDashSdkStrings.NEGATION
    - java.lang.String
  */
  type AttributeName = _AttributeName | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestTokenString = java.lang.String
  type ComprehendMedicalAsyncJobPropertiesList = js.Array[ComprehendMedicalAsyncJobProperties]
  type EntityList = js.Array[Entity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NAME
    - typings.awsDashSdk.awsDashSdkStrings.DOSAGE
    - typings.awsDashSdk.awsDashSdkStrings.ROUTE_OR_MODE
    - typings.awsDashSdk.awsDashSdkStrings.FORM
    - typings.awsDashSdk.awsDashSdkStrings.FREQUENCY
    - typings.awsDashSdk.awsDashSdkStrings.DURATION
    - typings.awsDashSdk.awsDashSdkStrings.GENERIC_NAME
    - typings.awsDashSdk.awsDashSdkStrings.BRAND_NAME
    - typings.awsDashSdk.awsDashSdkStrings.STRENGTH
    - typings.awsDashSdk.awsDashSdkStrings.RATE
    - typings.awsDashSdk.awsDashSdkStrings.ACUITY
    - typings.awsDashSdk.awsDashSdkStrings.TEST_NAME
    - typings.awsDashSdk.awsDashSdkStrings.TEST_VALUE
    - typings.awsDashSdk.awsDashSdkStrings.TEST_UNITS
    - typings.awsDashSdk.awsDashSdkStrings.PROCEDURE_NAME
    - typings.awsDashSdk.awsDashSdkStrings.TREATMENT_NAME
    - typings.awsDashSdk.awsDashSdkStrings.DATE
    - typings.awsDashSdk.awsDashSdkStrings.AGE
    - typings.awsDashSdk.awsDashSdkStrings.CONTACT_POINT
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - typings.awsDashSdk.awsDashSdkStrings.IDENTIFIER
    - typings.awsDashSdk.awsDashSdkStrings.URL
    - typings.awsDashSdk.awsDashSdkStrings.ADDRESS
    - typings.awsDashSdk.awsDashSdkStrings.PROFESSION
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM_ORGAN_SITE
    - typings.awsDashSdk.awsDashSdkStrings.DIRECTION
    - typings.awsDashSdk.awsDashSdkStrings.QUALITY
    - typings.awsDashSdk.awsDashSdkStrings.QUANTITY
    - java.lang.String
  */
  type EntitySubType = _EntitySubType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MEDICATION
    - typings.awsDashSdk.awsDashSdkStrings.MEDICAL_CONDITION
    - typings.awsDashSdk.awsDashSdkStrings.PROTECTED_HEALTH_INFORMATION
    - typings.awsDashSdk.awsDashSdkStrings.TEST_TREATMENT_PROCEDURE
    - typings.awsDashSdk.awsDashSdkStrings.ANATOMY
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type Float = Double
  type ICD10CMAttributeList = js.Array[ICD10CMAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ACUITY
    - typings.awsDashSdk.awsDashSdkStrings.DIRECTION
    - typings.awsDashSdk.awsDashSdkStrings.SYSTEM_ORGAN_SITE
    - typings.awsDashSdk.awsDashSdkStrings.QUALITY
    - typings.awsDashSdk.awsDashSdkStrings.QUANTITY
    - java.lang.String
  */
  type ICD10CMAttributeType = _ICD10CMAttributeType | java.lang.String
  type ICD10CMConceptList = js.Array[ICD10CMConcept]
  type ICD10CMEntityCategory = MEDICAL_CONDITION | java.lang.String
  type ICD10CMEntityList = js.Array[ICD10CMEntity]
  type ICD10CMEntityType = DX_NAME | java.lang.String
  type ICD10CMTraitList = js.Array[ICD10CMTrait]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NEGATION
    - typings.awsDashSdk.awsDashSdkStrings.DIAGNOSIS
    - typings.awsDashSdk.awsDashSdkStrings.SIGN
    - typings.awsDashSdk.awsDashSdkStrings.SYMPTOM
    - java.lang.String
  */
  type ICD10CMTraitName = _ICD10CMTraitName | java.lang.String
  type IamRoleArn = java.lang.String
  type Integer = Double
  type JobId = java.lang.String
  type JobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.PARTIAL_SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STOP_REQUESTED
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type JobStatus = _JobStatus | java.lang.String
  type KMSKey = java.lang.String
  type LanguageCode = en | java.lang.String
  type ManifestFilePath = java.lang.String
  type MaxResultsInteger = Double
  type ModelVersion = java.lang.String
  type OntologyLinkingBoundedLengthString = java.lang.String
  type RxNormAttributeList = js.Array[RxNormAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DOSAGE
    - typings.awsDashSdk.awsDashSdkStrings.DURATION
    - typings.awsDashSdk.awsDashSdkStrings.FORM
    - typings.awsDashSdk.awsDashSdkStrings.FREQUENCY
    - typings.awsDashSdk.awsDashSdkStrings.RATE
    - typings.awsDashSdk.awsDashSdkStrings.ROUTE_OR_MODE
    - typings.awsDashSdk.awsDashSdkStrings.STRENGTH
    - java.lang.String
  */
  type RxNormAttributeType = _RxNormAttributeType | java.lang.String
  type RxNormConceptList = js.Array[RxNormConcept]
  type RxNormEntityCategory = MEDICATION | java.lang.String
  type RxNormEntityList = js.Array[RxNormEntity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BRAND_NAME
    - typings.awsDashSdk.awsDashSdkStrings.GENERIC_NAME
    - java.lang.String
  */
  type RxNormEntityType = _RxNormEntityType | java.lang.String
  type RxNormTraitList = js.Array[RxNormTrait]
  type RxNormTraitName = NEGATION | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type String = java.lang.String
  type Timestamp = Date
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
