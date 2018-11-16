package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.DataDOMEventObject")
@js.native
class DataDOMEventObject protected () extends js.Object {
  var `InfoPath.DataDOMEventObject_typekey`: DataDOMEventObject = js.native
  val IsUndoRedo: scala.Boolean = js.native
  val MatchExpression: java.lang.String = js.native
  val NewValue: js.Any = js.native
  val OldValue: js.Any = js.native
  val Operation: java.lang.String = js.native
  val Parent: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  var ReturnMessage: java.lang.String = js.native
  var ReturnStatus: scala.Boolean = js.native
  val Site: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  val Source: activexDashMsxml2Lib.MSXML2Ns.IXMLDOMNode = js.native
  val XDocument: _XDocument = js.native
  /**
           * @param string [bstrDetailedErrorMessage='']
           * @param number [lErrorCode=0]
           * @param string [bstrType='modeless']
           */
  def ReportError(varNode: js.Any, bstrShortErrorMessage: java.lang.String, fSiteIndependent: scala.Boolean): ErrorObject = js.native
  /**
           * @param string [bstrDetailedErrorMessage='']
           * @param number [lErrorCode=0]
           * @param string [bstrType='modeless']
           */
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: java.lang.String,
    fSiteIndependent: scala.Boolean,
    bstrDetailedErrorMessage: java.lang.String
  ): ErrorObject = js.native
  /**
           * @param string [bstrDetailedErrorMessage='']
           * @param number [lErrorCode=0]
           * @param string [bstrType='modeless']
           */
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: java.lang.String,
    fSiteIndependent: scala.Boolean,
    bstrDetailedErrorMessage: java.lang.String,
    lErrorCode: scala.Double
  ): ErrorObject = js.native
  /**
           * @param string [bstrDetailedErrorMessage='']
           * @param number [lErrorCode=0]
           * @param string [bstrType='modeless']
           */
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: java.lang.String,
    fSiteIndependent: scala.Boolean,
    bstrDetailedErrorMessage: java.lang.String,
    lErrorCode: scala.Double,
    bstrType: java.lang.String
  ): ErrorObject = js.native
}

