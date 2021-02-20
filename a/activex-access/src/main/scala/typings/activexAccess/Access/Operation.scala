package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Operation extends StObject {
  
  @JSName("Access.Operation_typekey")
  var AccessDotOperation_typekey: Operation = js.native
  
  /** @param bstrParameters [bstrParameters=''] */
  def Execute(): js.Any = js.native
  def Execute(bstrParameters: String): js.Any = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  val Name: String = js.native
  
  val Parent: js.Any = js.native
  
  def WSParameters(Index: String): WSParameter = js.native
  def WSParameters(Index: Double): WSParameter = js.native
  @JSName("WSParameters")
  val WSParameters_Original: WSParameters = js.native
}
