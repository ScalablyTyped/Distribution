package typings.algoliasearch.algoliasearchMod

import typings.algoliasearch.algoliasearchStrings.oneWaySynonym
import typings.algoliasearch.algoliasearchStrings.synonym
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
  var objectID: String
  /**
    * Values used for the synonym
    */
  var synonyms: js.Array[String]
  /**
    * Type of synonym
    */
  var `type`: synonym | oneWaySynonym
}

object Synonym {
  @scala.inline
  def apply(objectID: String, synonyms: js.Array[String], `type`: synonym | oneWaySynonym): Synonym = {
    val __obj = js.Dynamic.literal(objectID = objectID, synonyms = synonyms)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Synonym]
  }
}

