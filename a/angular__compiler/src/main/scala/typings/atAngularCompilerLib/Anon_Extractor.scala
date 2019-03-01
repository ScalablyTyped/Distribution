package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extractor extends js.Object {
  var extractor: atAngularCompilerLib.srcI18nExtractorMod.Extractor
  var staticReflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
}

object Anon_Extractor {
  @scala.inline
  def apply(
    extractor: atAngularCompilerLib.srcI18nExtractorMod.Extractor,
    staticReflector: atAngularCompilerLib.srcAotStaticUnderscoreReflectorMod.StaticReflector
  ): Anon_Extractor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("extractor")(extractor)
    __obj.updateDynamic("staticReflector")(staticReflector)
    __obj.asInstanceOf[Anon_Extractor]
  }
}

