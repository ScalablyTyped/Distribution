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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerContextMenuInterceptor: js.Function1[XContextMenuInterceptor, scala.Unit],
    release: js.Function0[scala.Unit],
    releaseContextMenuInterceptor: js.Function1[XContextMenuInterceptor, scala.Unit]
  ): XContextMenuInterception = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, registerContextMenuInterceptor = registerContextMenuInterceptor, release = release, releaseContextMenuInterceptor = releaseContextMenuInterceptor)
  
    __obj.asInstanceOf[XContextMenuInterception]
  }
}

