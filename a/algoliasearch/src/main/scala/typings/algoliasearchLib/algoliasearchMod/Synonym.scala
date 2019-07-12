package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a synonym object
  */
trait Synonym extends js.Object {
  /**
    * ObjectID of the synonym
    */
  var objectID: java.lang.String
  /**
    * Values used for the synonym
    */
  var synonyms: js.Array[java.lang.String]
  /**
    * Type of synonym
    */
  var `type`: algoliasearchLib.algoliasearchLibStrings.synonym | algoliasearchLib.algoliasearchLibStrings.oneWaySynonym
}

object Synonym {
  @scala.inline
  def apply(
    objectID: java.lang.String,
    synonyms: js.Array[java.lang.String],
    `type`: algoliasearchLib.algoliasearchLibStrings.synonym | algoliasearchLib.algoliasearchLibStrings.oneWaySynonym
  ): Synonym = {
    val __obj = js.Dynamic.literal(objectID = objectID, synonyms = synonyms)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
}

