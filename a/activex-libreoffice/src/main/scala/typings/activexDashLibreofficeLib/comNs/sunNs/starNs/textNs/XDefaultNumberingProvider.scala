package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to default {@link com.sun.star.text.NumberingRules} according to a given locale information.
  * @author Oliver Specht
  * @see com.sun.star.text.NumberingRules
  * @see com.sun.star.lang.Locale
  * @version 1.0
  */
trait XDefaultNumberingProvider
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * In contrast to outline numberings the continuous numberings consist of level using the equal settings in all numbering levels.
    * @see com.sun.star.text.NumberingLevel
    * @see com.sun.star.lang.Locale
    */
  def getDefaultContinuousNumberingLevels(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * Outline numberings usually consist of levels with different settings.
    * @see com.sun.star.text.NumberingLevel
    */
  def getDefaultOutlineNumberings(aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess]
}

object XDefaultNumberingProvider {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getDefaultContinuousNumberingLevels: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
    ],
    getDefaultOutlineNumberings: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XDefaultNumberingProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, getDefaultContinuousNumberingLevels = getDefaultContinuousNumberingLevels, getDefaultOutlineNumberings = getDefaultOutlineNumberings, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XDefaultNumberingProvider]
  }
}

