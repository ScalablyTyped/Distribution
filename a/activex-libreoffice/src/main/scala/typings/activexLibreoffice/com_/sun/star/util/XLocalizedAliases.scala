package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
trait XLocalizedAliases
  extends StObject
     with XInterface {
  
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
  
  @scala.inline
  implicit class XLocalizedAliasesMutableBuilder[Self <: XLocalizedAliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBindAlias(value: (String, Locale, String) => Unit): Self = StObject.set(x, "bindAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def setListAliases(value: Locale => SafeArray[AliasProgrammaticPair]): Self = StObject.set(x, "listAliases", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLookupAlias(value: (Locale, String) => String): Self = StObject.set(x, "lookupAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setLookupProgrammatic(value: (Locale, String) => String): Self = StObject.set(x, "lookupProgrammatic", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRebindAliases(value: (String, String) => Unit): Self = StObject.set(x, "rebindAliases", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRenameAlias(value: (Locale, String, String) => Unit): Self = StObject.set(x, "renameAlias", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUnbindAlias(value: (Locale, String) => Unit): Self = StObject.set(x, "unbindAlias", js.Any.fromFunction2(value))
    
    @scala.inline
    def setUnbindAliases(value: String => Unit): Self = StObject.set(x, "unbindAliases", js.Any.fromFunction1(value))
  }
}
