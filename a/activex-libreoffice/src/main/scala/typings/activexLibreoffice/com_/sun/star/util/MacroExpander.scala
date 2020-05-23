package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This meta service supports the {@link XMacroExpander} interface for expanding arbitrary macro expressions, i.e. substitude macro names. The purpose of
  * this service is to separate the use of macrofied strings, e.g. urls from the use of services.
  * @deprecated Deprecatedrather use the util::theMacroExpander singleton
  * @see BootstrapMacroExpander
  * @see theMacroExpander
  * @since OOo 1.1.2
  */
trait MacroExpander
  extends XMacroExpander
     with XComponent

object MacroExpander {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    expandMacros: String => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): MacroExpander = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), expandMacros = js.Any.fromFunction1(expandMacros), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[MacroExpander]
  }
}

