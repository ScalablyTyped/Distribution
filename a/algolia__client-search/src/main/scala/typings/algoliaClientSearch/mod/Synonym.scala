package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Synonym extends js.Object {
  /**
    * An list of corrections of the word.
    */
  val corrections: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Defines the synonym. A word or expression, used as the basis for the array of synonyms.
    */
  val input: js.UndefOr[String] = js.undefined
  /**
    *  Synonym object ID.
    */
  val objectID: String
  /**
    * A single word, used as the basis for the below list of replacements.
    */
  val placeholder: js.UndefOr[String] = js.undefined
  /**
    * An list of replacements of the placeholder.
    */
  val replacements: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A list of synonyms.
    */
  val synonyms: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * There are 4 synonym types. The parameter can be one of the following value.
    */
  val `type`: SynonymType
  /**
    * A single word, used as the basis for the below array of corrections.
    */
  val word: js.UndefOr[String] = js.undefined
}

object Synonym {
  @scala.inline
  def apply(
    objectID: String,
    `type`: SynonymType,
    corrections: js.Array[String] = null,
    input: String = null,
    placeholder: String = null,
    replacements: js.Array[String] = null,
    synonyms: js.Array[String] = null,
    word: String = null
  ): Synonym = {
    val __obj = js.Dynamic.literal(objectID = objectID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (corrections != null) __obj.updateDynamic("corrections")(corrections.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (replacements != null) __obj.updateDynamic("replacements")(replacements.asInstanceOf[js.Any])
    if (synonyms != null) __obj.updateDynamic("synonyms")(synonyms.asInstanceOf[js.Any])
    if (word != null) __obj.updateDynamic("word")(word.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
}

