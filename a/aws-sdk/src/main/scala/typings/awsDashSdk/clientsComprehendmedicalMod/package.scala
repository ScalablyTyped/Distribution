package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComprehendmedicalMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions

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
  type Integer = Double
  type String = java.lang.String
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-10-30`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
