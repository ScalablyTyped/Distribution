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

