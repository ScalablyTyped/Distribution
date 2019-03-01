package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextChangeEventObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** Return the name of the application. */
  var ApplicationName: java.lang.String
  /** Return the application specific context name. */
  var ContextName: java.lang.String
}

object ContextChangeEventObject {
  @scala.inline
  def apply(
    ApplicationName: java.lang.String,
    ContextName: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): ContextChangeEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ApplicationName")(ApplicationName)
    __obj.updateDynamic("ContextName")(ContextName)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[ContextChangeEventObject]
  }
}

