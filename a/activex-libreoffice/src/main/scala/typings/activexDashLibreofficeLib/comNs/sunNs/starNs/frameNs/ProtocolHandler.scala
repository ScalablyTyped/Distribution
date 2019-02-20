package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * special dispatch provider registered for URL protocols
  *
  * The generic dispatch mechanism on a {@link Frame} search for such registered protocol handler and use it if it agrees with the dispatched URL.
  *
  * Supported URLs must match follow format: `protocol scheme:protocol specific part` If a handler provides optional arguments ("?") or jump marks ("#")
  * depends from his definition and implementation. The generic dispatch provider will use registered URL pattern to detect right handler.
  */
trait ProtocolHandler
  extends XDispatchProvider
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

