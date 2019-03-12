package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Macro expander expanding using rtl bootstrap notation.
  *
  * For details, have a look at [http://udk.openoffice.org/common/man/concept/micro_deployment.html#misc]{@link
  * url="http://udk.openoffice.org/common/man/concept/micro_deployment.html#misc"}
  *
  * The service can be instantiated via arguments giving an ini/rc file url. Otherwise it will read from an uno.ini/unorc file next to the cppuhelper
  * library.
  * @see theMacroExpander
  * @since OOo 1.1.2
  */
trait BootstrapMacroExpander
  extends MacroExpander
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object BootstrapMacroExpander {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    dispose: () => scala.Unit,
    expandMacros: java.lang.String => java.lang.String,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): BootstrapMacroExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), expandMacros = js.Any.fromFunction1(expandMacros), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[BootstrapMacroExpander]
  }
}

