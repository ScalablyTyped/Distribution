package typings
package algoliasearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Administrative extends js.Object {
  var administrative: algoliasearchLib.algoliasearchMod.PlacesNs.highlightResultValueInterface
  var country: Anon_Default
  var county: Anon_DefaultKey
  var locale_names: Anon_DefaultKeyArray
  var postcode: js.Array[algoliasearchLib.algoliasearchMod.PlacesNs.highlightResultValueInterface]
}

object Anon_Administrative {
  @scala.inline
  def apply(
    administrative: algoliasearchLib.algoliasearchMod.PlacesNs.highlightResultValueInterface,
    country: Anon_Default,
    county: Anon_DefaultKey,
    locale_names: Anon_DefaultKeyArray,
    postcode: js.Array[algoliasearchLib.algoliasearchMod.PlacesNs.highlightResultValueInterface]
  ): Anon_Administrative = {
    val __obj = js.Dynamic.literal(administrative = administrative, country = country, county = county, locale_names = locale_names, postcode = postcode)
  
    __obj.asInstanceOf[Anon_Administrative]
  }
}

