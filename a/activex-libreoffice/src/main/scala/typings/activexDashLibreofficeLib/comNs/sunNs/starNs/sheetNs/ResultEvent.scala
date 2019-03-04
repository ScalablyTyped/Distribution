package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * contains the new value of a volatile function result.
  * @see com.sun.star.sheet.XVolatileResult
  */
trait ResultEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * contains the value.
    *
    * This can be any of the possible return types described for the {@link AddIn} service, except {@link XVolatileResult} .
    */
  var Value: js.Any
}

object ResultEvent {
  @scala.inline
  def apply(Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, Value: js.Any): ResultEvent = {
    val __obj = js.Dynamic.literal(Source = Source, Value = Value)
  
    __obj.asInstanceOf[ResultEvent]
  }
}

