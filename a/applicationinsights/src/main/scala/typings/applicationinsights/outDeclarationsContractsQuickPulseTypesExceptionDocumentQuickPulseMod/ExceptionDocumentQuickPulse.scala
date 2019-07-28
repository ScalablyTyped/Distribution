package typings.applicationinsights.outDeclarationsContractsQuickPulseTypesExceptionDocumentQuickPulseMod

import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse
import typings.applicationinsights.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionDocumentQuickPulse extends DocumentQuickPulse {
  var Exception: String
  var ExceptionMessage: String
  var ExceptionType: String
}

object ExceptionDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: String,
    Exception: String,
    ExceptionMessage: String,
    ExceptionType: String,
    OperationId: String,
    Properties: js.Array[IDocumentProperty],
    Version: String,
    __type: String
  ): ExceptionDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Exception = Exception, ExceptionMessage = ExceptionMessage, ExceptionType = ExceptionType, OperationId = OperationId, Properties = Properties, Version = Version, __type = __type)
  
    __obj.asInstanceOf[ExceptionDocumentQuickPulse]
  }
}

