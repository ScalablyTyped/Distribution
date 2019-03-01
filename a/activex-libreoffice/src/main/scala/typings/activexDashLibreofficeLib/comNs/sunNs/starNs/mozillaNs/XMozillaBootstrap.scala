package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.mozillaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.XProfileManager
  * @see com.sun.star.mozilla.XProxyRunner
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
trait XMozillaBootstrap
  extends XProfileDiscover
     with XProfileManager
     with XProxyRunner

object XMozillaBootstrap {
  @scala.inline
  def apply(
    CurrentProduct: MozillaProductType,
    CurrentProfile: java.lang.String,
    Run: js.Function1[XCodeProxy, scala.Double],
    acquire: js.Function0[scala.Unit],
    bootupProfile: js.Function2[MozillaProductType, java.lang.String, scala.Double],
    getCurrentProduct: js.Function0[MozillaProductType],
    getCurrentProfile: js.Function0[java.lang.String],
    getDefaultProfile: js.Function1[MozillaProductType, java.lang.String],
    getProfileCount: js.Function1[MozillaProductType, scala.Double],
    getProfileExists: js.Function2[MozillaProductType, java.lang.String, scala.Boolean],
    getProfileList: js.Function2[
      MozillaProductType, 
      js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]], 
      scala.Double
    ],
    getProfilePath: js.Function2[MozillaProductType, java.lang.String, java.lang.String],
    isCurrentProfileLocked: js.Function0[scala.Boolean],
    isProfileLocked: js.Function2[MozillaProductType, java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setCurrentProfile: js.Function2[MozillaProductType, java.lang.String, java.lang.String],
    shutdownProfile: js.Function0[scala.Double]
  ): XMozillaBootstrap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CurrentProduct")(CurrentProduct)
    __obj.updateDynamic("CurrentProfile")(CurrentProfile)
    __obj.updateDynamic("Run")(Run)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("bootupProfile")(bootupProfile)
    __obj.updateDynamic("getCurrentProduct")(getCurrentProduct)
    __obj.updateDynamic("getCurrentProfile")(getCurrentProfile)
    __obj.updateDynamic("getDefaultProfile")(getDefaultProfile)
    __obj.updateDynamic("getProfileCount")(getProfileCount)
    __obj.updateDynamic("getProfileExists")(getProfileExists)
    __obj.updateDynamic("getProfileList")(getProfileList)
    __obj.updateDynamic("getProfilePath")(getProfilePath)
    __obj.updateDynamic("isCurrentProfileLocked")(isCurrentProfileLocked)
    __obj.updateDynamic("isProfileLocked")(isProfileLocked)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setCurrentProfile")(setCurrentProfile)
    __obj.updateDynamic("shutdownProfile")(shutdownProfile)
    __obj.asInstanceOf[XMozillaBootstrap]
  }
}

