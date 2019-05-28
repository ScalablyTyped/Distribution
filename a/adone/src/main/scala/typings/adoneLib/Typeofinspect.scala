package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofinspect extends js.Object {
  var colors: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[scala.Double, scala.Double]]]
  val custom: js.Symbol
  var defaultOptions: nodeLib.utilMod.InspectOptions
  /**
    * Allows changing inspect settings from the repl.
    */
  var replDefaults: nodeLib.utilMod.InspectOptions
  var styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
}

object Typeofinspect {
  @scala.inline
  def apply(
    colors: org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Tuple2[scala.Double, scala.Double]]],
    custom: js.Symbol,
    defaultOptions: nodeLib.utilMod.InspectOptions,
    replDefaults: nodeLib.utilMod.InspectOptions,
    styles: org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  ): Typeofinspect = {
    val __obj = js.Dynamic.literal(colors = colors, custom = custom, defaultOptions = defaultOptions, replDefaults = replDefaults, styles = styles)
  
    __obj.asInstanceOf[Typeofinspect]
  }
}

