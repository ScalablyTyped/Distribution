package typings.autoprefixerDashCore.autoprefixerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exports extends js.Object {
  var postcss: js.Any = js.native
  def apply(config: Config): Processor = js.native
  def info(): String = js.native
  def process(css: String): Result = js.native
  def process(css: String, opts: Options): Result = js.native
}

