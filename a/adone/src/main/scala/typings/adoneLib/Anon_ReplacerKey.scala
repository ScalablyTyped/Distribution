package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ReplacerKey extends js.Object {
  /**
    * A function that alters the behavior of the stringification process,
    * or an array of String and Number objects that serve as a whitelist
    * for selecting/filtering the properties of the value object to be included in the JSON string
    */
  var replacer: js.UndefOr[
    (js.Function2[/* key */ java.lang.String, /* value */ js.Any, _]) | js.Array[java.lang.String]
  ] = js.undefined
  /**
    * Indent spaces for pretty-printing
    */
  var space: js.UndefOr[java.lang.String] = js.undefined
}

