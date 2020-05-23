package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
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
trait XDefaultNumberingProvider extends XInterface {
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * In contrast to outline numberings the continuous numberings consist of level using the equal settings in all numbering levels.
    * @see com.sun.star.text.NumberingLevel
    * @see com.sun.star.lang.Locale
    */
  def getDefaultContinuousNumberingLevels(aLocale: Locale): SafeArray[PropertyValues]
  /**
    * provides access to outline numberings according to a given {@link com.sun.star.lang.Locale} .
    *
    * Outline numberings usually consist of levels with different settings.
    * @see com.sun.star.text.NumberingLevel
    */
  def getDefaultOutlineNumberings(aLocale: Locale): SafeArray[XIndexAccess]
}

object XDefaultNumberingProvider {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getDefaultContinuousNumberingLevels: Locale => SafeArray[PropertyValues],
    getDefaultOutlineNumberings: Locale => SafeArray[XIndexAccess],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDefaultNumberingProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getDefaultContinuousNumberingLevels = js.Any.fromFunction1(getDefaultContinuousNumberingLevels), getDefaultOutlineNumberings = js.Any.fromFunction1(getDefaultOutlineNumberings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDefaultNumberingProvider]
  }
}

