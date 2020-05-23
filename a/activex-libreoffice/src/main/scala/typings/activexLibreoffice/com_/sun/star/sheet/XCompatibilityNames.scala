package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to the sequence of compatibility names for an Addin function. */
trait XCompatibilityNames extends XInterface {
  /**
    * returns the compatibility names of the specified function.
    *
    * Compatibility names are localized names of {@link AddIn} functions that are used to import files from other applications.
    *
    * If on import a localized function name is read, this list of compatibility names is used to find the internal name of the function. The current locale
    * may differ from the locale used in the imported file, so the method {@link XAddIn.getProgrammaticFuntionName()} cannot be used here.
    *
    * The order inside the sequence of compatibility names is used to prioritize the names. Initially the first compatibility name of each function is
    * compared to the imported name (each function may provide a sequence of compatibility names - the first entry of all sequences is used). If no entry is
    * equal, the second entry of each sequence is used and so on.
    *
    * If a locale is not present in the sequence of compatibility names, the first entry of the sequence is used. So the method should return a sequence
    * which contains first the entry representing the current locale. `TRUE`
    * @param aProgrammaticName is the exact name of a method within its interface.
    */
  def getCompatibilityNames(aProgrammaticName: String): SafeArray[LocalizedName]
}

object XCompatibilityNames {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getCompatibilityNames: String => SafeArray[LocalizedName],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompatibilityNames = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCompatibilityNames = js.Any.fromFunction1(getCompatibilityNames), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompatibilityNames]
  }
}

