package typings.activexAccess.Access

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Control extends StObject {
  
  /* private */ @JSName("Access.Control_typekey")
  var AccessDotControl_typekey: Control = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  var BottomPadding: Double = js.native
  
  def Column(Index: Double): Any = js.native
  def Column(Index: Double, Row: Double): Any = js.native
  
  def Controls[T](Index: String): T = js.native
  // tslint:disable-next-line:no-unnecessary-generics
  def Controls[T](Index: Double): T = js.native
  @JSName("Controls")
  val Controls_Original: Children = js.native
  
  def Dropdown(): Unit = js.native
  
  val Form: typings.activexAccess.Access.Form = js.native
  
  def Goto(): Unit = js.native
  
  var GridlineColor: Double = js.native
  
  var GridlineStyleBottom: Double = js.native
  
  var GridlineStyleLeft: Double = js.native
  
  var GridlineStyleRight: Double = js.native
  
  var GridlineStyleTop: Double = js.native
  
  var GridlineWidthBottom: Double = js.native
  
  var GridlineWidthLeft: Double = js.native
  
  var GridlineWidthRight: Double = js.native
  
  var GridlineWidthTop: Double = js.native
  
  var HorizontalAnchor: AcHorizontalAnchor = js.native
  
  val Hyperlink: typings.activexAccess.Access.Hyperlink = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  def ItemData(Index: Double): Any = js.native
  
  def ItemsSelected(Index: Any): Double = js.native
  @JSName("ItemsSelected")
  val ItemsSelected_Original: ItemsSelected = js.native
  
  val Layout: AcLayoutType = js.native
  
  val LayoutID: Double = js.native
  
  var LeftPadding: Double = js.native
  
  def Move(Left: Double): Unit = js.native
  def Move(Left: Double, Top: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Double, Width: Unit, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Double, Height: Double): Unit = js.native
  def Move(Left: Double, Top: Unit, Width: Unit, Height: Double): Unit = js.native
  
  var Name: String = js.native
  
  val Object: Any = js.native
  
  def ObjectVerbs(Index: Double): String = js.native
  
  val OldValue: Any = js.native
  
  def Pages(Index: String): Page = js.native
  def Pages(Index: Double): Page = js.native
  @JSName("Pages")
  val Pages_Original: Pages = js.native
  
  val Parent: Any = js.native
  
  def Properties(Index: String): AccessProperty = js.native
  def Properties(Index: Double): AccessProperty = js.native
  @JSName("Properties")
  val Properties_Original: Properties = js.native
  
  val Report: typings.activexAccess.Access.Report = js.native
  
  def Requery(): Unit = js.native
  
  var RightPadding: Double = js.native
  
  def Selected(lRow: Double): Double = js.native
  
  def SetFocus(): Unit = js.native
  
  def SizeToFit(): Unit = js.native
  
  def SmartTags(Index: String): SmartTag = js.native
  def SmartTags(Index: Double): SmartTag = js.native
  @JSName("SmartTags")
  val SmartTags_Original: SmartTags = js.native
  
  var TopPadding: Double = js.native
  
  def Undo(): Unit = js.native
  
  var VerticalAnchor: AcVerticalAnchor = js.native
  
  def _Evaluate(bstrExpr: String, ppsa: Any*): Any = js.native
  
  var _Name: String = js.native
}
