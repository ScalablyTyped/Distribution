package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentQuickPulse extends js.Object {
  var DocumentType: java.lang.String
  var OperationId: java.lang.String
  var Properties: js.Array[IDocumentProperty]
  var Version: java.lang.String
  var __type: java.lang.String
}

object DocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: java.lang.String,
    OperationId: java.lang.String,
    Properties: js.Array[IDocumentProperty],
    Version: java.lang.String,
    __type: java.lang.String
  ): DocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, OperationId = OperationId, Properties = Properties, Version = Version, __type = __type)
  
    __obj.asInstanceOf[DocumentQuickPulse]
  }
}

