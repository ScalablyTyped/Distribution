package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs.XModel
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Is used for interaction handle to get filter options.
  * @since OOo 1.1.2
  */
trait FilterOptionsRequest extends Exception {
  /** The model of the document that should be provided to filters that supports {@link XExporter} interface. */
  var rModel: XModel
  /** The Media-descriptor of the document */
  var rProperties: SafeArray[PropertyValue]
}

object FilterOptionsRequest {
  @scala.inline
  def apply(Context: XInterface, Message: String, rModel: XModel, rProperties: SafeArray[PropertyValue]): FilterOptionsRequest = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, rModel = rModel, rProperties = rProperties)
  
    __obj.asInstanceOf[FilterOptionsRequest]
  }
}

