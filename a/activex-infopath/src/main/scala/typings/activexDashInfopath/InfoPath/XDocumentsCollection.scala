package typings.activexDashInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDocumentsCollection")
@js.native
class XDocumentsCollection protected () extends js.Object {
  val Count: Double = js.native
  @JSName("InfoPath.XDocumentsCollection_typekey")
  var InfoPathDotXDocumentsCollection_typekey: XDocumentsCollection = js.native
  def Close(varIndex: js.Any): Unit = js.native
  def Item(varIndex: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def New(varURI: js.Any): _XDocument = js.native
  def New(varURI: js.Any, dwBehavior: Double): _XDocument = js.native
  def NewFromSolution(varURI: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def NewFromSolutionWithData(varXMLData: js.Any, varSolutionURI: js.Any): XDocument = js.native
  def NewFromSolutionWithData(varXMLData: js.Any, varSolutionURI: js.Any, dwBehavior: Double): XDocument = js.native
  /** @param number [dwBehavior=1] */
  def Open(varURI: js.Any): _XDocument = js.native
  def Open(varURI: js.Any, dwBehavior: Double): _XDocument = js.native
}

