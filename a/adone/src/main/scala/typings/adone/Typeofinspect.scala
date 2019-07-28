package typings.adone

import org.scalablytyped.runtime.StringDictionary
import typings.node.utilMod.InspectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofinspect extends js.Object {
  var colors: StringDictionary[js.UndefOr[js.Tuple2[Double, Double]]]
  val custom: js.Symbol
  var defaultOptions: InspectOptions
  /**
    * Allows changing inspect settings from the repl.
    */
  var replDefaults: InspectOptions
  var styles: StringDictionary[js.UndefOr[String]]
}

object Typeofinspect {
  @scala.inline
  def apply(
    colors: StringDictionary[js.UndefOr[js.Tuple2[Double, Double]]],
    custom: js.Symbol,
    defaultOptions: InspectOptions,
    replDefaults: InspectOptions,
    styles: StringDictionary[js.UndefOr[String]]
  ): Typeofinspect = {
    val __obj = js.Dynamic.literal(colors = colors, custom = custom, defaultOptions = defaultOptions, replDefaults = replDefaults, styles = styles)
  
    __obj.asInstanceOf[Typeofinspect]
  }
}

