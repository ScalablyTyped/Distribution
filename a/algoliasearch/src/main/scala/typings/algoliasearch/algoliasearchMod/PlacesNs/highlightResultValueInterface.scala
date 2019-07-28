package typings.algoliasearch.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface use in HitInterface for some key of highlightResult.
  */
trait highlightResultValueInterface extends js.Object {
  var matchLevel: String
  var matchedWords: js.Array[String]
  var value: String
}

object highlightResultValueInterface {
  @scala.inline
  def apply(matchLevel: String, matchedWords: js.Array[String], value: String): highlightResultValueInterface = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel, matchedWords = matchedWords, value = value)
  
    __obj.asInstanceOf[highlightResultValueInterface]
  }
}

