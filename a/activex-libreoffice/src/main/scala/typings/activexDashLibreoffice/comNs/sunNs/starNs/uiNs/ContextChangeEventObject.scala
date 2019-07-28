package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextChangeEventObject extends EventObject {
  /** Return the name of the application. */
  var ApplicationName: String
  /** Return the application specific context name. */
  var ContextName: String
}

object ContextChangeEventObject {
  @scala.inline
  def apply(ApplicationName: String, ContextName: String, Source: XInterface): ContextChangeEventObject = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, ContextName = ContextName, Source = Source)
  
    __obj.asInstanceOf[ContextChangeEventObject]
  }
}

