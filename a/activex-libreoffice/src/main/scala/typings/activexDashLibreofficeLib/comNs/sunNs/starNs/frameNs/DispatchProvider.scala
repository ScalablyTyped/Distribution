package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides {@link XDispatch} objects for certain functions which are useful at the UI
  *
  * Such dispatch objects must be queried explicitly and used for queried purposes only. They can handle requests with guaranteed notifications ( {@link
  * XNotifyingDispatch} ) or with possible (but not guaranteed) notifications ( {@link XDispatch} ).
  * @see XNotifyingDispatch
  * @see XDispatch
  * @see XControlNotificationListener
  */
trait DispatchProvider
  extends XDispatchProvider
     with XDispatchProviderInterception

object DispatchProvider {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryDispatch: (activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, java.lang.String, scala.Double) => XDispatch,
    queryDispatches: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor] => stdLib.SafeArray[XDispatch],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    registerDispatchProviderInterceptor: XDispatchProviderInterceptor => scala.Unit,
    release: () => scala.Unit,
    releaseDispatchProviderInterceptor: XDispatchProviderInterceptor => scala.Unit
  ): DispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryDispatch = js.Any.fromFunction3(queryDispatch), queryDispatches = js.Any.fromFunction1(queryDispatches), queryInterface = js.Any.fromFunction1(queryInterface), registerDispatchProviderInterceptor = js.Any.fromFunction1(registerDispatchProviderInterceptor), release = js.Any.fromFunction0(release), releaseDispatchProviderInterceptor = js.Any.fromFunction1(releaseDispatchProviderInterceptor))
  
    __obj.asInstanceOf[DispatchProvider]
  }
}

