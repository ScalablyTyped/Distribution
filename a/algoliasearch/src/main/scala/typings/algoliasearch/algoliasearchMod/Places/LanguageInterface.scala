package typings.algoliasearch.algoliasearchMod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageInterface extends js.Object {
  /**
    * If specified, restrict the search results to a single language. You can pass two letters country codes (ISO 639-1).
    * Warning: language parameter is case sensitive and should be lowercase otherwise it will fallback to default language.
    * https://community.algolia.com/places/api-clients.html#api-options-language
    */
  var language: String
}

object LanguageInterface {
  @scala.inline
  def apply(language: String): LanguageInterface = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LanguageInterface]
  }
}

