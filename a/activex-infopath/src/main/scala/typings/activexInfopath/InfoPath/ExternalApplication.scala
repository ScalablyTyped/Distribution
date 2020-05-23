package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalApplication extends js.Object {
  @JSName("InfoPath.ExternalApplication_typekey")
  var InfoPathDotExternalApplication_typekey: ExternalApplication = js.native
  def CacheSolution(bstrSolutionURI: String): Unit = js.native
  def Close(bstrDocumentURI: String): Unit = js.native
  /** @param number [dwBehavior=1] */
  def New(bstrDocumentURI: String): Unit = js.native
  def New(bstrDocumentURI: String, dwBehavior: Double): Unit = js.native
  def NewFromSolution(bstrSolutionURI: String): Unit = js.native
  def NewFromSolutionWithInputParameters(bstrSolutionURI: String, bstrInputParameters: String): Unit = js.native
  /** @param number [dwBehavior=1] */
  def Open(bstrDocumentURI: String): Unit = js.native
  def Open(bstrDocumentURI: String, dwBehavior: Double): Unit = js.native
  def Quit(): Unit = js.native
  /** @param string [bstrBehavior='overwrite'] */
  def RegisterSolution(bstrSolutionURL: String): Unit = js.native
  def RegisterSolution(bstrSolutionURL: String, bstrBehavior: String): Unit = js.native
  def UnregisterSolution(bstrSolutionURI: String): Unit = js.native
}

