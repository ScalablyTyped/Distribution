package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageBreak extends StObject {
  
  /* private */ @JSName("Access.PageBreak_typekey")
  var AccessDotPageBreak_typekey: PageBreak = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  var ControlName: String = js.native
  
  var ControlType: Double = js.native
  
  var EventProcPrefix: String = js.native
  
  var InSelection: Boolean = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var IsVisible: Boolean = js.native
  
  var Left: Double = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Unit, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Unit, Height: Double): Unit = js.native
  
  var Name: String = js.native
  
  val Parent: Any = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  var Section: Double = js.native
  
  def SizeToFit(): Unit = js.native
  
  var Tag: String = js.native
  
  var Top: Double = js.native
  
  var Visible: Boolean = js.native
  
  def _Evaluate(bstrExpr: String, ppsa: Any*): Any = js.native
  
  var _Name: String = js.native
}
