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
    acquire: js.Function0[scala.Unit],
    queryDispatch: js.Function3[
      activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL, 
      java.lang.String, 
      scala.Double, 
      XDispatch
    ],
    queryDispatches: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DispatchDescriptor], 
      activexDashInteropLib.SafeArray[XDispatch]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    registerDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit],
    release: js.Function0[scala.Unit],
    releaseDispatchProviderInterceptor: js.Function1[XDispatchProviderInterceptor, scala.Unit]
  ): DispatchProvider = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryDispatch = queryDispatch, queryDispatches = queryDispatches, queryInterface = queryInterface, registerDispatchProviderInterceptor = registerDispatchProviderInterceptor, release = release, releaseDispatchProviderInterceptor = releaseDispatchProviderInterceptor)
  
    __obj.asInstanceOf[DispatchProvider]
  }
}

