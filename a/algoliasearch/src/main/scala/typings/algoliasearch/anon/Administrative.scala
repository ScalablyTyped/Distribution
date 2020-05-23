package typings.algoliasearch.anon

import typings.algoliasearch.mod.Places.highlightResultValueInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Administrative extends js.Object {
  var administrative: highlightResultValueInterface
  var country: highlightResultValueInterface
  var county: js.UndefOr[highlightResultValueInterface] = js.undefined
  var locale_names: js.Array[highlightResultValueInterface]
  var postcode: js.Array[highlightResultValueInterface]
}

object Administrative {
  @scala.inline
  def apply(
    administrative: highlightResultValueInterface,
    country: highlightResultValueInterface,
    locale_names: js.Array[highlightResultValueInterface],
    postcode: js.Array[highlightResultValueInterface],
    county: highlightResultValueInterface = null
  ): Administrative = {
    val __obj = js.Dynamic.literal(administrative = administrative.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], locale_names = locale_names.asInstanceOf[js.Any], postcode = postcode.asInstanceOf[js.Any])
    if (county != null) __obj.updateDynamic("county")(county.asInstanceOf[js.Any])
    __obj.asInstanceOf[Administrative]
  }
}

