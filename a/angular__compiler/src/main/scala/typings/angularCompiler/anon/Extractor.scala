package typings.angularCompiler.anon

import typings.angularCompiler.staticReflectorMod.StaticReflector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extractor extends js.Object {
  var extractor: typings.angularCompiler.extractorMod.Extractor
  var staticReflector: StaticReflector
}

object Extractor {
  @scala.inline
  def apply(extractor: typings.angularCompiler.extractorMod.Extractor, staticReflector: StaticReflector): Extractor = {
    val __obj = js.Dynamic.literal(extractor = extractor.asInstanceOf[js.Any], staticReflector = staticReflector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extractor]
  }
}

