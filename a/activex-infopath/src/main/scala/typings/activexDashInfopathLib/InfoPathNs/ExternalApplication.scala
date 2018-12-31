package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.ExternalApplication")
@js.native
class ExternalApplication protected () extends js.Object {
  var `InfoPath.ExternalApplication_typekey`: ExternalApplication = js.native
  def CacheSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
  def Close(bstrDocumentURI: java.lang.String): scala.Unit = js.native
  /** @param number [dwBehavior=1] */
  def New(bstrDocumentURI: java.lang.String): scala.Unit = js.native
  def New(bstrDocumentURI: java.lang.String, dwBehavior: scala.Double): scala.Unit = js.native
  def NewFromSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
  def NewFromSolutionWithInputParameters(bstrSolutionURI: java.lang.String, bstrInputParameters: java.lang.String): scala.Unit = js.native
  /** @param number [dwBehavior=1] */
  def Open(bstrDocumentURI: java.lang.String): scala.Unit = js.native
  def Open(bstrDocumentURI: java.lang.String, dwBehavior: scala.Double): scala.Unit = js.native
  def Quit(): scala.Unit = js.native
  /** @param string [bstrBehavior='overwrite'] */
  def RegisterSolution(bstrSolutionURL: java.lang.String): scala.Unit = js.native
  def RegisterSolution(bstrSolutionURL: java.lang.String, bstrBehavior: java.lang.String): scala.Unit = js.native
  def UnregisterSolution(bstrSolutionURI: java.lang.String): scala.Unit = js.native
}

