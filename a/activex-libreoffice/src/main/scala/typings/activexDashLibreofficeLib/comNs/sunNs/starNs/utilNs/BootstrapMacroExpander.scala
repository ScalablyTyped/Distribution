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

