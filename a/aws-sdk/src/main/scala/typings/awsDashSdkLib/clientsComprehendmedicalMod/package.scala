package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsComprehendmedicalMod {
  type AttributeList = js.Array[Attribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIGN
    - awsDashSdkLib.awsDashSdkLibStrings.SYMPTOM
    - awsDashSdkLib.awsDashSdkLibStrings.DIAGNOSIS
    - awsDashSdkLib.awsDashSdkLibStrings.NEGATION
    - java.lang.String
  */
  type AttributeName = _AttributeName | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EntityList = js.Array[Entity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NAME
    - awsDashSdkLib.awsDashSdkLibStrings.DOSAGE
    - awsDashSdkLib.awsDashSdkLibStrings.ROUTE_OR_MODE
    - awsDashSdkLib.awsDashSdkLibStrings.FORM
    - awsDashSdkLib.awsDashSdkLibStrings.FREQUENCY
    - awsDashSdkLib.awsDashSdkLibStrings.DURATION
    - awsDashSdkLib.awsDashSdkLibStrings.GENERIC_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.BRAND_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.STRENGTH
    - awsDashSdkLib.awsDashSdkLibStrings.RATE
    - awsDashSdkLib.awsDashSdkLibStrings.ACUITY
    - awsDashSdkLib.awsDashSdkLibStrings.TEST_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.TEST_VALUE
    - awsDashSdkLib.awsDashSdkLibStrings.TEST_UNITS
    - awsDashSdkLib.awsDashSdkLibStrings.PROCEDURE_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.TREATMENT_NAME
    - awsDashSdkLib.awsDashSdkLibStrings.DATE
    - awsDashSdkLib.awsDashSdkLibStrings.AGE
    - awsDashSdkLib.awsDashSdkLibStrings.CONTACT_POINT
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - awsDashSdkLib.awsDashSdkLibStrings.IDENTIFIER
    - awsDashSdkLib.awsDashSdkLibStrings.URL
    - awsDashSdkLib.awsDashSdkLibStrings.ADDRESS
    - awsDashSdkLib.awsDashSdkLibStrings.PROFESSION
    - awsDashSdkLib.awsDashSdkLibStrings.SYSTEM_ORGAN_SITE
    - awsDashSdkLib.awsDashSdkLibStrings.DIRECTION
    - awsDashSdkLib.awsDashSdkLibStrings.QUALITY
    - awsDashSdkLib.awsDashSdkLibStrings.QUANTITY
    - java.lang.String
  */
  type EntitySubType = _EntitySubType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MEDICATION
    - awsDashSdkLib.awsDashSdkLibStrings.MEDICAL_CONDITION
    - awsDashSdkLib.awsDashSdkLibStrings.PROTECTED_HEALTH_INFORMATION
    - awsDashSdkLib.awsDashSdkLibStrings.TEST_TREATMENT_PROCEDURE
    - awsDashSdkLib.awsDashSdkLibStrings.ANATOMY
    - java.lang.String
  */
  type EntityType = _EntityType | java.lang.String
  type Float = scala.Double
  type Integer = scala.Double
  type String = java.lang.String
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-10-30`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
