package typings.algoliasearch

import typings.algoliasearch.algoliasearchMod.PlacesNs.highlightResultValueInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Administrative extends js.Object {
  var administrative: highlightResultValueInterface
  var country: Anon_Default
  var county: Anon_DefaultKey
  var locale_names: Anon_DefaultKeyArray
  var postcode: js.Array[highlightResultValueInterface]
}

object Anon_Administrative {
  @scala.inline
  def apply(
    administrative: highlightResultValueInterface,
    country: Anon_Default,
    county: Anon_DefaultKey,
    locale_names: Anon_DefaultKeyArray,
    postcode: js.Array[highlightResultValueInterface]
  ): Anon_Administrative = {
    val __obj = js.Dynamic.literal(administrative = administrative, country = country, county = county, locale_names = locale_names, postcode = postcode)
  
    __obj.asInstanceOf[Anon_Administrative]
  }
}

