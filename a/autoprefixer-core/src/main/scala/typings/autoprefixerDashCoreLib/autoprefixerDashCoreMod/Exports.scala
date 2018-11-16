package typings
package autoprefixerDashCoreLib.autoprefixerDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exports extends js.Object {
  var postcss: js.Any = js.native
  def apply(config: Config): Processor = js.native
  def info(): java.lang.String = js.native
  def process(css: java.lang.String): Result = js.native
  def process(css: java.lang.String, opts: Options): Result = js.native
}

