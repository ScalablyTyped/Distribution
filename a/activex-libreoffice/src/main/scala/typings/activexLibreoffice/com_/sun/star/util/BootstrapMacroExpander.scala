package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.lang.XInitialization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  extends StObject
     with MacroExpander
     with XInitialization
object BootstrapMacroExpander {
  
  inline def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    expandMacros: String => String,
    initialize: SeqEquiv[js.Any] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): BootstrapMacroExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), expandMacros = js.Any.fromFunction1(expandMacros), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[BootstrapMacroExpander]
  }
}
