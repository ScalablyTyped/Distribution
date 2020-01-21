package typings.appBuilderLib.integrityMod

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
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any])
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarIntegrity]
  }
}

