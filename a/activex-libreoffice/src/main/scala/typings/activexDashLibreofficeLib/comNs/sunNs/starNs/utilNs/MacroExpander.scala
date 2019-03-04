package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent

object MacroExpander {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    dispose: js.Function0[scala.Unit],
    expandMacros: js.Function1[java.lang.String, java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): MacroExpander = {
    val __obj = js.Dynamic.literal(acquire = acquire, addEventListener = addEventListener, dispose = dispose, expandMacros = expandMacros, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[MacroExpander]
  }
}

