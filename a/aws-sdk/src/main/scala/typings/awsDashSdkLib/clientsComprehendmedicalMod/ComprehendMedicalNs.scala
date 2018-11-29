package typings
package awsDashSdkLib.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/comprehendmedical", "ComprehendMedical")
@js.native
object ComprehendMedicalNs extends js.Object {
  
  trait Attribute extends js.Object {
    /**
         *  The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string. 
         */
    var BeginOffset: js.UndefOr[Integer] = js.undefined
    /**
         *  The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string. 
         */
    var EndOffset: js.UndefOr[Integer] = js.undefined
    /**
         *  The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
         */
    var Id: js.UndefOr[Integer] = js.undefined
    /**
         *  The level of confidence that Comprehend Medical has that this attribute is correctly related to this entity. 
         */
    var RelationshipScore: js.UndefOr[Float] = js.undefined
    /**
         *  The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute. 
         */
    var Score: js.UndefOr[Float] = js.undefined
    /**
         *  The segment of input text extracted as this attribute.
         */
    var Text: js.UndefOr[java.lang.String] = js.undefined
    /**
         *  Contextual information for this attribute. 
         */
    var Traits: js.UndefOr[TraitList] = js.undefined
    /**
         *  The type of attribute. 
         */
    var Type: js.UndefOr[EntitySubType] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DetectEntitiesRequest extends js.Object {
    /**
         *  A UTF-8 text string containing the clinical content being examined for entities. Each string must contain fewer than 20,000 bytes of characters.
         */
    var Text: BoundedLengthString
  }
  
  
  trait DetectEntitiesResponse extends js.Object {
    /**
         *  The collection of medical entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in the detection and analysis. Attributes and traits of the entity are also returned.
         */
    var Entities: EntityList
    /**
         *  If the result of the previous request to DetectEntities was truncated, include the Paginationtoken to fetch the next page of entities.
         */
    var PaginationToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         *  Attributes extracted from the input text that we were unable to relate to an entity.
         */
    var UnmappedAttributes: js.UndefOr[UnmappedAttributeList] = js.undefined
  }
  
  
  trait DetectPHIRequest extends js.Object {
    /**
         *  A UTF-8 text string containing the clinical content being examined for PHI entities. Each string must contain fewer than 20,000 bytes of characters. 
         */
    var Text: BoundedLengthString
  }
  
  
  trait DetectPHIResponse extends js.Object {
    /**
         *  The collection of PHI entities extracted from the input text and their associated information. For each entity, the response provides the entity text, the entity category, where the entity text begins and ends, and the level of confidence that Comprehend Medical has in its detection. 
         */
    var Entities: EntityList
    /**
         *  If the result of the previous request to DetectPHI was truncated, include the Paginationtoken to fetch the next page of PHI entities. 
         */
    var PaginationToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Entity extends js.Object {
    /**
         *  The extracted attributes that relate to this entity.
         */
    var Attributes: js.UndefOr[AttributeList] = js.undefined
    /**
         *  The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string. 
         */
    var BeginOffset: js.UndefOr[Integer] = js.undefined
    /**
         *  The category of the entity.
         */
    var Category: js.UndefOr[EntityType] = js.undefined
    /**
         *  The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string. 
         */
    var EndOffset: js.UndefOr[Integer] = js.undefined
    /**
         *  The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier. 
         */
    var Id: js.UndefOr[Integer] = js.undefined
    /**
         * The level of confidence that Comprehend Medical has in the accuracy of the detection.
         */
    var Score: js.UndefOr[Float] = js.undefined
    /**
         *  The segment of input text extracted as this entity.
         */
    var Text: js.UndefOr[java.lang.String] = js.undefined
    /**
         * Contextual information for the entity
         */
    var Traits: js.UndefOr[TraitList] = js.undefined
    /**
         *  Describes the specific type of entity with category of entities. 
         */
    var Type: js.UndefOr[EntitySubType] = js.undefined
  }
  
  
  trait Trait extends js.Object {
    /**
         *  Provides a name or contextual description about the trait. 
         */
    var Name: js.UndefOr[AttributeName] = js.undefined
    /**
         *  The level of confidence that Comprehend Medical has in the accuracy of this trait.
         */
    var Score: js.UndefOr[Float] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
       */
    def detectEntities(): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
       */
    def detectEntities(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
       */
    def detectEntities(params: DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
       */
    def detectEntities(
      params: DetectEntitiesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectEntitiesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
       */
    def detectPHI(): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
       */
    def detectPHI(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectPHIResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
       */
    def detectPHI(params: DetectPHIRequest): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
       */
    def detectPHI(
      params: DetectPHIRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DetectPHIResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UnmappedAttribute extends js.Object {
    /**
         *  The specific attribute that has been extracted but not mapped to an entity. 
         */
    var Attribute: js.UndefOr[Attribute] = js.undefined
    /**
         *  The type of the attribute, could be one of the following values: "MEDICATION", "MEDICAL_CONDITION", "ANATOMY", "TEST_AND_TREATMENT_PROCEDURE" or "PERSONAL_HEALTH_INFORMATION". 
         */
    var Type: js.UndefOr[EntityType] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AttributeList = js.Array[Attribute]
  type AttributeName = awsDashSdkLib.awsDashSdkLibStrings.SIGN | awsDashSdkLib.awsDashSdkLibStrings.SYMPTOM | awsDashSdkLib.awsDashSdkLibStrings.DIAGNOSIS | awsDashSdkLib.awsDashSdkLibStrings.NEGATION | java.lang.String
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EntityList = js.Array[Entity]
  type EntitySubType = awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.DOSAGE | awsDashSdkLib.awsDashSdkLibStrings.ROUTE_OR_MODE | awsDashSdkLib.awsDashSdkLibStrings.FORM | awsDashSdkLib.awsDashSdkLibStrings.FREQUENCY | awsDashSdkLib.awsDashSdkLibStrings.DURATION | awsDashSdkLib.awsDashSdkLibStrings.GENERIC_NAME | awsDashSdkLib.awsDashSdkLibStrings.BRAND_NAME | awsDashSdkLib.awsDashSdkLibStrings.STRENGTH | awsDashSdkLib.awsDashSdkLibStrings.RATE | awsDashSdkLib.awsDashSdkLibStrings.ACUITY | awsDashSdkLib.awsDashSdkLibStrings.TEST_NAME | awsDashSdkLib.awsDashSdkLibStrings.TEST_VALUE | awsDashSdkLib.awsDashSdkLibStrings.TEST_UNITS | awsDashSdkLib.awsDashSdkLibStrings.PROCEDURE_NAME | awsDashSdkLib.awsDashSdkLibStrings.TREATMENT_NAME | awsDashSdkLib.awsDashSdkLibStrings.DATE | awsDashSdkLib.awsDashSdkLibStrings.AGE | awsDashSdkLib.awsDashSdkLibStrings.CONTACT_POINT | awsDashSdkLib.awsDashSdkLibStrings.EMAIL | awsDashSdkLib.awsDashSdkLibStrings.IDENTIFIER | awsDashSdkLib.awsDashSdkLibStrings.URL | awsDashSdkLib.awsDashSdkLibStrings.ADDRESS | awsDashSdkLib.awsDashSdkLibStrings.PROFESSION | awsDashSdkLib.awsDashSdkLibStrings.SYSTEM_ORGAN_SITE | awsDashSdkLib.awsDashSdkLibStrings.DIRECTION | awsDashSdkLib.awsDashSdkLibStrings.QUALITY | awsDashSdkLib.awsDashSdkLibStrings.QUANTITY | java.lang.String
  type EntityType = awsDashSdkLib.awsDashSdkLibStrings.MEDICATION | awsDashSdkLib.awsDashSdkLibStrings.MEDICAL_CONDITION | awsDashSdkLib.awsDashSdkLibStrings.PROTECTED_HEALTH_INFORMATION | awsDashSdkLib.awsDashSdkLibStrings.TEST_TREATMENT_PROCEDURE | awsDashSdkLib.awsDashSdkLibStrings.ANATOMY | java.lang.String
  type Float = scala.Double
  type Integer = scala.Double
  type String = java.lang.String
  type TraitList = js.Array[Trait]
  type UnmappedAttributeList = js.Array[UnmappedAttribute]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-10-30` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

