package typings
package appDashBuilderDashLibLib.outAsarIntegrityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsarIntegrity extends AsarIntegrityOptions {
  var checksums: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object AsarIntegrity {
  @scala.inline
  def apply(
    checksums: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    externalAllowed: js.UndefOr[scala.Boolean] = js.undefined
  ): AsarIntegrity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checksums")(checksums)
    if (!js.isUndefined(externalAllowed)) __obj.updateDynamic("externalAllowed")(externalAllowed)
    __obj.asInstanceOf[AsarIntegrity]
  }
}

