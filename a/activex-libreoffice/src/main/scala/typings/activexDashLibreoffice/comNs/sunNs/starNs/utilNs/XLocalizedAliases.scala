package typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
trait XLocalizedAliases extends XInterface {
  /** registers an alias for a programmatic name. */
  def bindAlias(programmaticName: String, locale: Locale, alias: String): Unit
  /**
    * retrieves a list of all registered aliases for a certain language.
    * @param locale specifies the locale scope.
    * @returns a sequence of registered pair of alias and programmatic name.
    */
  def listAliases(locale: Locale): SafeArray[AliasProgrammaticPair]
  /** retrieves a registered programmatic name identified by an alias. */
  def lookupAlias(locale: Locale, Alias: String): String
  /** retrieves a given alias for a programmatic name. */
  def lookupProgrammatic(locale: Locale, programmatic: String): String
  /** rebinds all aliases registered to a given {@link URL} to a new one. */
  def rebindAliases(currentProgrammatic: String, newProgrammatic: String): Unit
  /** renames an alias for a programmatic name. */
  def renameAlias(locale: Locale, oldName: String, aNewName: String): Unit
  /** revokes an alias for a programmatic name. */
  def unbindAlias(locale: Locale, alias: String): Unit
  /** removes all aliases for a programmatic name. */
  def unbindAliases(programmaticName: String): Unit
}

object XLocalizedAliases {
  @scala.inline
  def apply(
    acquire: () => Unit,
    bindAlias: (String, Locale, String) => Unit,
    listAliases: Locale => SafeArray[AliasProgrammaticPair],
    lookupAlias: (Locale, String) => String,
    lookupProgrammatic: (Locale, String) => String,
    queryInterface: `type` => js.Any,
    rebindAliases: (String, String) => Unit,
    release: () => Unit,
    renameAlias: (Locale, String, String) => Unit,
    unbindAlias: (Locale, String) => Unit,
    unbindAliases: String => Unit
  ): XLocalizedAliases = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), bindAlias = js.Any.fromFunction3(bindAlias), listAliases = js.Any.fromFunction1(listAliases), lookupAlias = js.Any.fromFunction2(lookupAlias), lookupProgrammatic = js.Any.fromFunction2(lookupProgrammatic), queryInterface = js.Any.fromFunction1(queryInterface), rebindAliases = js.Any.fromFunction2(rebindAliases), release = js.Any.fromFunction0(release), renameAlias = js.Any.fromFunction3(renameAlias), unbindAlias = js.Any.fromFunction2(unbindAlias), unbindAliases = js.Any.fromFunction1(unbindAliases))
  
    __obj.asInstanceOf[XLocalizedAliases]
  }
}

