package typings.appDashBuilderDashLib.outAsarIntegrityMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarIntegrity extends AsarIntegrityOptions {
  var checksums: StringDictionary[String]
}

object AsarIntegrity {
  @scala.inline
  def apply(checksums: StringDictionary[String], externalAllowed: js.UndefOr[Boolean] = js.undefined): AsarIntegrity = {
    val __obj = js.Dynamic.literal(checksums = checksums)
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed)
    __obj.asInstanceOf[AsarIntegrity]
  }
}

