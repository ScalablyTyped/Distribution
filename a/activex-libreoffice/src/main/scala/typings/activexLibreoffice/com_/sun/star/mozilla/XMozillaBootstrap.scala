package typings.activexLibreoffice.com_.sun.star.mozilla

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see com.sun.star.mozilla.XProfileDiscover
  * @see com.sun.star.mozilla.XProfileManager
  * @see com.sun.star.mozilla.XProxyRunner
  * @see com.sun.star.mozilla.MozillaBootstrap
  */
@js.native
trait XMozillaBootstrap
  extends XProfileDiscover
     with XProfileManager
     with XProxyRunner
object XMozillaBootstrap {
  
  @scala.inline
  def apply(
    CurrentProduct: MozillaProductType,
    CurrentProfile: String,
    Run: XCodeProxy => Double,
    acquire: () => Unit,
    bootupProfile: (MozillaProductType, String) => Double,
    getCurrentProduct: () => MozillaProductType,
    getCurrentProfile: () => String,
    getDefaultProfile: MozillaProductType => String,
    getProfileCount: MozillaProductType => Double,
    getProfileExists: (MozillaProductType, String) => Boolean,
    getProfileList: (MozillaProductType, js.Array[SeqEquiv[String]]) => Double,
    getProfilePath: (MozillaProductType, String) => String,
    isCurrentProfileLocked: () => Boolean,
    isProfileLocked: (MozillaProductType, String) => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setCurrentProfile: (MozillaProductType, String) => String,
    shutdownProfile: () => Double
  ): XMozillaBootstrap = {
    val __obj = js.Dynamic.literal(CurrentProduct = CurrentProduct.asInstanceOf[js.Any], CurrentProfile = CurrentProfile.asInstanceOf[js.Any], Run = js.Any.fromFunction1(Run), acquire = js.Any.fromFunction0(acquire), bootupProfile = js.Any.fromFunction2(bootupProfile), getCurrentProduct = js.Any.fromFunction0(getCurrentProduct), getCurrentProfile = js.Any.fromFunction0(getCurrentProfile), getDefaultProfile = js.Any.fromFunction1(getDefaultProfile), getProfileCount = js.Any.fromFunction1(getProfileCount), getProfileExists = js.Any.fromFunction2(getProfileExists), getProfileList = js.Any.fromFunction2(getProfileList), getProfilePath = js.Any.fromFunction2(getProfilePath), isCurrentProfileLocked = js.Any.fromFunction0(isCurrentProfileLocked), isProfileLocked = js.Any.fromFunction2(isProfileLocked), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setCurrentProfile = js.Any.fromFunction2(setCurrentProfile), shutdownProfile = js.Any.fromFunction0(shutdownProfile))
    __obj.asInstanceOf[XMozillaBootstrap]
  }
}
