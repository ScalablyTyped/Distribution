package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    *  The level of confidence that Amazon Comprehend Medical has that this attribute is correctly related to this entity. 
    */
  var RelationshipScore: js.UndefOr[Float] = js.undefined
  /**
    *  The level of confidence that Amazon Comprehend Medical has that the segment of text is correctly recognized as an attribute. 
    */
  var Score: js.UndefOr[Float] = js.undefined
  /**
    *  The segment of input text extracted as this attribute.
    */
  var Text: js.UndefOr[String] = js.undefined
  /**
    *  Contextual information for this attribute. 
    */
  var Traits: js.UndefOr[TraitList] = js.undefined
  /**
    *  The type of attribute. 
    */
  var Type: js.UndefOr[EntitySubType] = js.undefined
}

object Attribute {
  @scala.inline
  def apply(
    BeginOffset: Int | Double = null,
    EndOffset: Int | Double = null,
    Id: Int | Double = null,
    RelationshipScore: Int | Double = null,
    Score: Int | Double = null,
    Text: String = null,
    Traits: TraitList = null,
    Type: EntitySubType = null
  ): Attribute = {
    val __obj = js.Dynamic.literal()
    if (BeginOffset != null) __obj.updateDynamic("BeginOffset")(BeginOffset.asInstanceOf[js.Any])
    if (EndOffset != null) __obj.updateDynamic("EndOffset")(EndOffset.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (RelationshipScore != null) __obj.updateDynamic("RelationshipScore")(RelationshipScore.asInstanceOf[js.Any])
    if (Score != null) __obj.updateDynamic("Score")(Score.asInstanceOf[js.Any])
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (Traits != null) __obj.updateDynamic("Traits")(Traits)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

