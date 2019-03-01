package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a factory to get {@link XAnyCompare} service implementations.
  * @since OOo 1.1.2
  */
trait AnyCompareFactory extends XAnyCompareFactory {
  def createWithLocale(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): scala.Unit
}

object AnyCompareFactory {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createAnyCompareByName: js.Function1[java.lang.String, XAnyCompare],
    createWithLocale: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): AnyCompareFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createAnyCompareByName")(createAnyCompareByName)
    __obj.updateDynamic("createWithLocale")(createWithLocale)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[AnyCompareFactory]
  }
}

