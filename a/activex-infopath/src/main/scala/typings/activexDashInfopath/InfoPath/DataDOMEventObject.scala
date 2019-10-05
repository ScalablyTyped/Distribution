package typings.activexDashInfopath.InfoPath

import typings.activexDashMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.DataDOMEventObject")
@js.native
class DataDOMEventObject protected () extends js.Object {
  var `InfoPath.DataDOMEventObject_typekey`: DataDOMEventObject = js.native
  val IsUndoRedo: Boolean = js.native
  val MatchExpression: String = js.native
  val NewValue: js.Any = js.native
  val OldValue: js.Any = js.native
  val Operation: String = js.native
  val Parent: IXMLDOMNode = js.native
  var ReturnMessage: String = js.native
  var ReturnStatus: Boolean = js.native
  val Site: IXMLDOMNode = js.native
  val Source: IXMLDOMNode = js.native
  val XDocument: _XDocument = js.native
  /**
    * @param string [bstrDetailedErrorMessage='']
    * @param number [lErrorCode=0]
    * @param string [bstrType='modeless']
    */
  def ReportError(varNode: js.Any, bstrShortErrorMessage: String, fSiteIndependent: Boolean): ErrorObject = js.native
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double
  ): ErrorObject = js.native
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double,
    bstrType: String
  ): ErrorObject = js.native
}

