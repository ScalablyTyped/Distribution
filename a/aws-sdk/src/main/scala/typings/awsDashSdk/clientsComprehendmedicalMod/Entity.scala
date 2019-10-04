package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The level of confidence that Amazon Comprehend Medical has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  /**
    *  The segment of input text extracted as this entity.
    */
  var Text: js.UndefOr[String] = js.undefined
  /**
    * Contextual information for the entity
    */
  var Traits: js.UndefOr[TraitList] = js.undefined
  /**
    *  Describes the specific type of entity with category of entities. 
    */
  var Type: js.UndefOr[EntitySubType] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    Attributes: AttributeList = null,
    BeginOffset: js.UndefOr[Integer] = js.undefined,
    Category: EntityType = null,
    EndOffset: js.UndefOr[Integer] = js.undefined,
    Id: js.UndefOr[Integer] = js.undefined,
    Score: js.UndefOr[Float] = js.undefined,
    Text: String = null,
    Traits: TraitList = null,
    Type: EntitySubType = null
  ): Entity = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (!js.isUndefined(BeginOffset)) __obj.updateDynamic("BeginOffset")(BeginOffset)
    if (Category != null) __obj.updateDynamic("Category")(Category.asInstanceOf[js.Any])
    if (!js.isUndefined(EndOffset)) __obj.updateDynamic("EndOffset")(EndOffset)
    if (!js.isUndefined(Id)) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (Traits != null) __obj.updateDynamic("Traits")(Traits)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

