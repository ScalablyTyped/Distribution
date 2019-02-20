package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to create adapter objects giving types to be supported and a an invocation interface incoming calls are delegated to. */
trait XInvocationAdapterFactory2
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates an adapter interface of given types for calling the given {@link XInvocation} interface.
    * @param Invocation invocation interface being called on incoming adapter calls
    * @param aTypes supported types of adapter
    * @returns adapter interface; this interface can be queried for XInterface and given types
    */
  def createAdapter(
    Invocation: XInvocation,
    aTypes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.`type`]
  ): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

