package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface enables an object to get interceptors registered that change context menus or prevent them from being executed. */
trait XContextMenuInterception
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers an {@link XContextMenuInterceptor} , which will become the first interceptor in the chain of registered interceptors. */
  def registerContextMenuInterceptor(Interceptor: XContextMenuInterceptor): scala.Unit
  /**
    * removes an {@link XContextMenuInterceptor} which was previously registered using {@link XContextMenuInterception.registerContextMenuInterceptor()} .
    *
    * The order of removals is arbitrary. It is not necessary to remove the last registered interceptor first.
    */
  def releaseContextMenuInterceptor(Interceptor: XContextMenuInterceptor): scala.Unit
}

object XContextMenuInterception {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerContextMenuInterceptor: XContextMenuInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseContextMenuInterceptor: XContextMenuInterceptor => scala.Unit
  ): XContextMenuInterception = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), registerContextMenuInterceptor = js.Any.fromFunction1(registerContextMenuInterceptor), release = js.Any.fromFunction0(release), releaseContextMenuInterceptor = js.Any.fromFunction1(releaseContextMenuInterceptor))
  
    __obj.asInstanceOf[XContextMenuInterception]
  }
}

