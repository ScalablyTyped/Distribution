package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataDOMEventObject extends StObject {
  
  @JSName("InfoPath.DataDOMEventObject_typekey")
  var InfoPathDotDataDOMEventObject_typekey: DataDOMEventObject = js.native
  
  val IsUndoRedo: Boolean = js.native
  
  val MatchExpression: String = js.native
  
  val NewValue: js.Any = js.native
  
  val OldValue: js.Any = js.native
  
  val Operation: String = js.native
  
  val Parent: IXMLDOMNode = js.native
  
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
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: js.UndefOr[scala.Nothing],
    bstrType: String
  ): ErrorObject = js.native
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: Double
  ): ErrorObject = js.native
  def ReportError(
    varNode: js.Any,
    bstrShortErrorMessage: String,
    fSiteIndependent: Boolean,
    bstrDetailedErrorMessage: js.UndefOr[scala.Nothing],
    lErrorCode: Double,
    bstrType: String
  ): ErrorObject = js.native
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
    lErrorCode: js.UndefOr[scala.Nothing],
    bstrType: String
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
  
  var ReturnMessage: String = js.native
  
  var ReturnStatus: Boolean = js.native
  
  val Site: IXMLDOMNode = js.native
  
  val Source: IXMLDOMNode = js.native
  
  val XDocument: _XDocument = js.native
}
