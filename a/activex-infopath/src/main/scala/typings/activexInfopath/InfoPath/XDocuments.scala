package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDocuments extends StObject {
  
  def Close(varIndex: js.Any): Unit = js.native
  
  val Count: Double = js.native
  
  @JSName("InfoPath.XDocuments_typekey")
  var InfoPathDotXDocuments_typekey: XDocuments = js.native
  
  def Item(varIndex: js.Any): _XDocument = js.native
  
  /** @param number [dwBehavior=1] */
  def New(varURI: js.Any): _XDocument = js.native
  def New(varURI: js.Any, dwBehavior: Double): _XDocument = js.native
  
  def NewFromSolution(varURI: js.Any): _XDocument = js.native
  
  /** @param number [dwBehavior=1] */
  def Open(varURI: js.Any): _XDocument = js.native
  def Open(varURI: js.Any, dwBehavior: Double): _XDocument = js.native
}
