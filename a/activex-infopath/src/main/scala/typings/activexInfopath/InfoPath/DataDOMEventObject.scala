package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDOMEventObject extends StObject {
  
  /* private */ @JSName("InfoPath.DataDOMEventObject_typekey")
  var InfoPathDotDataDOMEventObject_typekey: DataDOMEventObject = js.native
  
  val IsUndoRedo: Boolean = js.native
  
  val MatchExpression: String = js.native
  
  val NewValue: Any = js.native
  
  val OldValue: Any = js.native
  
  val Operation: String = js.native
  
  val Parent: IXMLDOMNode = js.native
  
  /**
    * @param string [bstrDetailedErrorMessage='']
    * @param number [lErrorCode=0]
    * @param string [bstrType='modeless']
    */
  def ReportError(varNode: Any, bstrShortErrorMessage: String, fSiteIndependent: Boolean): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String,
    lErrorCode: Double,
    bstrType: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: String,
    lErrorCode: Unit,
    bstrType: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Double
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Double,
    bstrType: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: Unit,
    lErrorCode: Unit,
    bstrType: String
  ): ErrorObject = js.native
  
  var ReturnMessage: String = js.native
  
  var ReturnStatus: Boolean = js.native
  
  val Site: IXMLDOMNode = js.native
  
  val Source: IXMLDOMNode = js.native
  
  val XDocument: _XDocument = js.native
}
