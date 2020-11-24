package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait COMAddIns extends js.Object {
  
  def apply(Index: String): COMAddIn = js.native
  def apply(Index: Double): COMAddIn = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): COMAddIn = js.native
  def Item(Index: Double): COMAddIn = js.native
  
  val Parent: js.Any = js.native
  
  def SetAppModal(varfModal: Boolean): Unit = js.native
  
  def Update(): Unit = js.native
}
