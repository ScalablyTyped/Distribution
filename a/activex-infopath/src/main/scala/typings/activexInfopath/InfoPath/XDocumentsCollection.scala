package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDocumentsCollection extends StObject {
  
  def Close(varIndex: Any): Unit = js.native
  
  val Count: Double = js.native
  
  /* private */ @JSName("InfoPath.XDocumentsCollection_typekey")
  var InfoPathDotXDocumentsCollection_typekey: XDocumentsCollection = js.native
  
  def Item(varIndex: Any): _XDocument = js.native
  
  /** @param number [dwBehavior=1] */
  def New(varURI: Any): _XDocument = js.native
  def New(varURI: Any, dwBehavior: Double): _XDocument = js.native
  
  def NewFromSolution(varURI: Any): _XDocument = js.native
  
  /** @param number [dwBehavior=1] */
  def NewFromSolutionWithData(varXMLData: Any, varSolutionURI: Any): XDocument = js.native
  def NewFromSolutionWithData(varXMLData: Any, varSolutionURI: Any, dwBehavior: Double): XDocument = js.native
  
  /** @param number [dwBehavior=1] */
  def Open(varURI: Any): _XDocument = js.native
  def Open(varURI: Any, dwBehavior: Double): _XDocument = js.native
}
