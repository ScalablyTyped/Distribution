package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entity extends js.Object {
  /**
    * A character offset in the input text that shows where the entity begins (the first character is at position 0). The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  /**
    * A character offset in the input text that shows where the entity ends. The offset returns the position of each UTF-8 code point in the string. A code point is the abstract character from a particular graphical representation. For example, a multi-byte UTF-8 character maps to a single code point. 
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
  /**
    * The level of confidence that Amazon Comprehend has in the accuracy of the detection.
    */
  var Score: js.UndefOr[Float] = js.undefined
  /**
    * The text of the entity.
    */
  var Text: js.UndefOr[String] = js.undefined
  /**
    * The entity's type.
    */
  var Type: js.UndefOr[EntityType] = js.undefined
}

object Entity {
  @scala.inline
  def apply(
    BeginOffset: js.UndefOr[Integer] = js.undefined,
    EndOffset: js.UndefOr[Integer] = js.undefined,
    Score: js.UndefOr[Float] = js.undefined,
    Text: String = null,
    Type: EntityType = null
  ): Entity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BeginOffset)) __obj.updateDynamic("BeginOffset")(BeginOffset)
    if (!js.isUndefined(EndOffset)) __obj.updateDynamic("EndOffset")(EndOffset)
    if (!js.isUndefined(Score)) __obj.updateDynamic("Score")(Score)
    if (Text != null) __obj.updateDynamic("Text")(Text)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
}

