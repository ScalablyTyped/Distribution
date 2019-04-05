package typings
package applicationinsightsLib.outDeclarationsContractsQuickPulseTypesExceptionDocumentQuickPulseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionDocumentQuickPulse
  extends applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.DocumentQuickPulse {
  var Exception: java.lang.String
  var ExceptionMessage: java.lang.String
  var ExceptionType: java.lang.String
}

object ExceptionDocumentQuickPulse {
  @scala.inline
  def apply(
    DocumentType: java.lang.String,
    Exception: java.lang.String,
    ExceptionMessage: java.lang.String,
    ExceptionType: java.lang.String,
    OperationId: java.lang.String,
    Properties: js.Array[
      applicationinsightsLib.outDeclarationsContractsQuickPulseTypesDocumentQuickPulseMod.IDocumentProperty
    ],
    Version: java.lang.String,
    __type: java.lang.String
  ): ExceptionDocumentQuickPulse = {
    val __obj = js.Dynamic.literal(DocumentType = DocumentType, Exception = Exception, ExceptionMessage = ExceptionMessage, ExceptionType = ExceptionType, OperationId = OperationId, Properties = Properties, Version = Version, __type = __type)
  
    __obj.asInstanceOf[ExceptionDocumentQuickPulse]
  }
}

