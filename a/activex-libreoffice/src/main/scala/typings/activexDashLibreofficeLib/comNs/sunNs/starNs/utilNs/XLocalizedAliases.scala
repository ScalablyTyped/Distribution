package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is the interface for binding programmatic names to aliases. Aliases can be provided in several locales for the same programmatic name. */
trait XLocalizedAliases
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers an alias for a programmatic name. */
  def bindAlias(
    programmaticName: java.lang.String,
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    alias: java.lang.String
  ): scala.Unit
  /**
    * retrieves a list of all registered aliases for a certain language.
    * @param locale specifies the locale scope.
    * @returns a sequence of registered pair of alias and programmatic name.
    */
  def listAliases(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale): activexDashInteropLib.SafeArray[AliasProgrammaticPair]
  /** retrieves a registered programmatic name identified by an alias. */
  def lookupAlias(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, Alias: java.lang.String): java.lang.String
  /** retrieves a given alias for a programmatic name. */
  def lookupProgrammatic(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, programmatic: java.lang.String): java.lang.String
  /** rebinds all aliases registered to a given {@link URL} to a new one. */
  def rebindAliases(currentProgrammatic: java.lang.String, newProgrammatic: java.lang.String): scala.Unit
  /** renames an alias for a programmatic name. */
  def renameAlias(
    locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale,
    oldName: java.lang.String,
    aNewName: java.lang.String
  ): scala.Unit
  /** revokes an alias for a programmatic name. */
  def unbindAlias(locale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, alias: java.lang.String): scala.Unit
  /** removes all aliases for a programmatic name. */
  def unbindAliases(programmaticName: java.lang.String): scala.Unit
}

object XLocalizedAliases {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    bindAlias: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      scala.Unit
    ],
    listAliases: js.Function1[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      activexDashInteropLib.SafeArray[AliasProgrammaticPair]
    ],
    lookupAlias: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String
    ],
    lookupProgrammatic: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    rebindAliases: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    release: js.Function0[scala.Unit],
    renameAlias: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      java.lang.String, 
      scala.Unit
    ],
    unbindAlias: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale, 
      java.lang.String, 
      scala.Unit
    ],
    unbindAliases: js.Function1[java.lang.String, scala.Unit]
  ): XLocalizedAliases = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("bindAlias")(bindAlias)
    __obj.updateDynamic("listAliases")(listAliases)
    __obj.updateDynamic("lookupAlias")(lookupAlias)
    __obj.updateDynamic("lookupProgrammatic")(lookupProgrammatic)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("rebindAliases")(rebindAliases)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("renameAlias")(renameAlias)
    __obj.updateDynamic("unbindAlias")(unbindAlias)
    __obj.updateDynamic("unbindAliases")(unbindAliases)
    __obj.asInstanceOf[XLocalizedAliases]
  }
}

