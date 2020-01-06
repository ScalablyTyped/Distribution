package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RxNormAttribute extends js.Object {
  /**
    * The 0-based character offset in the input text that shows where the attribute begins. The offset returns the UTF-8 code point in the string.
    */
  var BeginOffset: js.UndefOr[Integer] = js.native
  /**
    * The 0-based character offset in the input text that shows where the attribute ends. The offset returns the UTF-8 code point in the string.
    */
  var EndOffset: js.UndefOr[Integer] = js.native
  /**
    * The numeric identifier for this attribute. This is a monotonically increasing id unique within this response rather than a global unique identifier.
    */
  var Id: js.UndefOr[Integer] = js.native
  /**
    * The level of confidence that Amazon Comprehend Medical has that the attribute is accurately linked to an entity.
    */
  var RelationshipScore: js.UndefOr[Float] = js.native
  /**
    * The level of confidence that Comprehend Medical has that the segment of text is correctly recognized as an attribute.
    */
  var Score: js.UndefOr[Float] = js.native
  /**
    * The segment of input text which corresponds to the detected attribute.
    */
  var Text: js.UndefOr[String] = js.native
  /**
    * Contextual information for the attribute. InferRxNorm recognizes the trait NEGATION for attributes, i.e. that the patient is not taking a specific dose or form of a medication.
    */
  var Traits: js.UndefOr[RxNormTraitList] = js.native
  /**
    * The type of attribute. The types of attributes recognized by InferRxNorm are BRAND_NAME and GENERIC_NAME.
    */
  var Type: js.UndefOr[RxNormAttributeType] = js.native
}

object RxNormAttribute {
  @scala.inline
  def apply(
    BeginOffset: Int | Double = null,
    EndOffset: Int | Double = null,
    Id: Int | Double = null,
    RelationshipScore: Int | Double = null,
    Score: Int | Double = null,
    Text: String = null,
    Traits: RxNormTraitList = null,
    Type: RxNormAttributeType = null
  ): RxNormAttribute = {
    val __obj = js.Dynamic.literal()
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (RelationshipScore != null) __obj.updateDynamic("RelationshipScore")(RelationshipScore.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text.asInstanceOf[js.Any])
    if (Traits != null) __obj.updateDynamic("Traits")(Traits.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[RxNormAttribute]
  }
}

