package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to get filter options.
  * @since OOo 1.1.2
  */
trait FilterOptionsRequest
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** The model of the document that should be provided to filters that supports {@link XExporter} interface. */
  var rModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel
  /** The Media-descriptor of the document */
  var rProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
}

object FilterOptionsRequest {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    rModel: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    rProperties: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): FilterOptionsRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, rModel = rModel, rProperties = rProperties)
  
    __obj.asInstanceOf[FilterOptionsRequest]
  }
}

