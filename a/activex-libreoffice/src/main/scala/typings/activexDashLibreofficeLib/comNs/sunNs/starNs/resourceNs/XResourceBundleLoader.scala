package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.resourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to load resource bundles.
  *
  * The search algorithm is specified in the documentation of {@link XResourceBundle} . The implementations must follow the name scheme, but it is allowed
  * to search in several locations.
  * @see MissingResourceException
  * @see XResourceBundle
  * @see Locale
  */
trait XResourceBundleLoader
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** loads the appropriate resource bundle subclass. */
  def loadBundle(abaseName: java.lang.String, aLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): XResourceBundle
  /** loads the appropriate resource bundle. */
  def loadBundle_Default(aBaseName: java.lang.String): XResourceBundle
}

