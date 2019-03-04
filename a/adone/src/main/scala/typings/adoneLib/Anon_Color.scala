package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var colors: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[scala.Double, scala.Double]]]
  val custom: js.Symbol
  var defaultOptions: nodeLib.utilMod.InspectOptions
  var styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
}

object Anon_Color {
  @scala.inline
  def apply(
    colors: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[scala.Double, scala.Double]]],
    custom: js.Symbol,
    defaultOptions: nodeLib.utilMod.InspectOptions,
    styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): Anon_Color = {
    val __obj = js.Dynamic.literal(colors = colors, custom = custom, defaultOptions = defaultOptions, styles = styles)
  
    __obj.asInstanceOf[Anon_Color]
  }
}

