package typings
package algoliasearchLib.algoliasearchMod.PlacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface use in HitInterface for some key of highlightResult.
  */
trait highlightResultValueInterface extends js.Object {
  var matchLevel: java.lang.String
  var matchedWords: js.Array[java.lang.String]
  var value: java.lang.String
}

object highlightResultValueInterface {
  @scala.inline
  def apply(matchLevel: java.lang.String, matchedWords: js.Array[java.lang.String], value: java.lang.String): highlightResultValueInterface = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel, matchedWords = matchedWords, value = value)
  
    __obj.asInstanceOf[highlightResultValueInterface]
  }
}

