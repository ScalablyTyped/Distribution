package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesEventDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDocumentQuickPulse
  extends applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse {
  var Name: java.lang.String
}

object EventDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: java.lang.String,
    Name: java.lang.String,
    OperationId: java.lang.String,
    Properties: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
    ],
    Version: java.lang.String,
    __type: java.lang.String
  ): EventDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Name = Name, OperationId = OperationId, Properties = Properties, Version = Version, __type = __type)
  
    __obj.asInstanceOf[EventDocumentQuickPulse]
  }
}

