package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotStaticUnderscoreReflectorMod.StaticReflector
import typings.atAngularCompiler.srcI18nExtractorMod.Extractor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extractor extends js.Object {
  var extractor: Extractor
  var staticReflector: StaticReflector
}

object Anon_Extractor {
  @scala.inline
  def apply(extractor: Extractor, staticReflector: StaticReflector): Anon_Extractor = {
    val __obj = js.Dynamic.literal(extractor = extractor, staticReflector = staticReflector)
  
    __obj.asInstanceOf[Anon_Extractor]
  }
}

