package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICD10CMEntity extends js.Object {
  /**
    * The detected attributes that relate to the entity. An extracted segment of the text that is an attribute of an entity, or otherwise related to an entity, such as the nature of a medical condition.
    */
  var Attributes: js.UndefOr[ICD10CMAttributeList] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    *  The category of the entity. InferICD10CM detects entities in the MEDICAL_CONDITION category. 
    */
  var Category: js.UndefOr[ICD10CMEntityCategory] = js.native
  /**
    * The 0-based character offset in the input text that shows where the entity ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The ICD-10-CM concepts that the entity could refer to, along with a score indicating the likelihood of the match.
    */
  var ICD10CMConcepts: js.UndefOr[ICD10CMConceptList] = js.native
  /**
    * The numeric identifier for the entity. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text that is matched to the detected entity.
    */
  var Text: js.UndefOr[OntologyLinkingBoundedLengthString] = js.native
  /**
    * Provides Contextual information for the entity. The traits recognized by InferICD10CM are DIAGNOSIS, SIGN, SYMPTOM, and NEGATION. 
    */
  var Traits: js.UndefOr[ICD10CMTraitList] = js.native
  /**
    * Describes the specific type of entity with category of entities. InferICD10CM detects entities of the type DX_NAME.
    */
  var Type: js.UndefOr[ICD10CMEntityType] = js.native
}

object ICD10CMEntity {
  @scala.inline
  def apply(
    Attributes: ICD10CMAttributeList = null,
    BeginOffset: Int | Double = null,
    Category: ICD10CMEntityCategory = null,
    EndOffset: Int | Double = null,
    ICD10CMConcepts: ICD10CMConceptList = null,
    Id: Int | Double = null,
    Score: Int | Double = null,
    Text: OntologyLinkingBoundedLengthString = null,
    Traits: ICD10CMTraitList = null,
    Type: ICD10CMEntityType = null
  ): ICD10CMEntity = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes.asInstanceOf[js.Any])
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (ICD10CMConcepts != null) __obj.updateDynamic("ICD10CMConcepts")(ICD10CMConcepts.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICD10CMEntity]
  }
}

