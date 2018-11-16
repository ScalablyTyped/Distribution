package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.XDocumentsCollection")
@js.native
class XDocumentsCollection protected () extends js.Object {
  val Count: scala.Double = js.native
  var `InfoPath.XDocumentsCollection_typekey`: XDocumentsCollection = js.native
  def Close(varIndex: js.Any): scala.Unit = js.native
  def Item(varIndex: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def New(varURI: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def New(varURI: js.Any, dwBehavior: scala.Double): _XDocument = js.native
  def NewFromSolution(varURI: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def NewFromSolutionWithData(varXMLData: js.Any, varSolutionURI: js.Any): XDocument = js.native
  /** @param number [dwBehavior=1] */
  def NewFromSolutionWithData(varXMLData: js.Any, varSolutionURI: js.Any, dwBehavior: scala.Double): XDocument = js.native
  /** @param number [dwBehavior=1] */
  def Open(varURI: js.Any): _XDocument = js.native
  /** @param number [dwBehavior=1] */
  def Open(varURI: js.Any, dwBehavior: scala.Double): _XDocument = js.native
}

