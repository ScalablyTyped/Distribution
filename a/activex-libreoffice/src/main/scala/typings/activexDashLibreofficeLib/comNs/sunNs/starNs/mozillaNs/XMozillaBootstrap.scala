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
    Run: XCodeProxy => scala.Double,
    acquire: () => scala.Unit,
    bootupProfile: (MozillaProductType, java.lang.String) => scala.Double,
    getCurrentProduct: () => MozillaProductType,
    getCurrentProfile: () => java.lang.String,
    getDefaultProfile: MozillaProductType => java.lang.String,
    getProfileCount: MozillaProductType => scala.Double,
    getProfileExists: (MozillaProductType, java.lang.String) => scala.Boolean,
    getProfileList: (MozillaProductType, js.Array[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]]) => scala.Double,
    getProfilePath: (MozillaProductType, java.lang.String) => java.lang.String,
    isCurrentProfileLocked: () => scala.Boolean,
    isProfileLocked: (MozillaProductType, java.lang.String) => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setCurrentProfile: (MozillaProductType, java.lang.String) => java.lang.String,
    shutdownProfile: () => scala.Double
  ): XMozillaBootstrap = {
    val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct, CurrentProfile = CurrentProfile, Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
  
    __obj.asInstanceOf[XMozillaBootstrap]
  }
}

