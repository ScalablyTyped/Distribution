package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColumns extends js.Object {
  
  def Add(): TextColumn = js.native
  def Add(Width: js.UndefOr[scala.Nothing], Spacing: js.UndefOr[scala.Nothing], EvenlySpaced: js.Any): TextColumn = js.native
  def Add(Width: js.UndefOr[scala.Nothing], Spacing: js.Any): TextColumn = js.native
  def Add(Width: js.UndefOr[scala.Nothing], Spacing: js.Any, EvenlySpaced: js.Any): TextColumn = js.native
  def Add(Width: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.UndefOr[scala.Nothing], EvenlySpaced: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any): TextColumn = js.native
  def Add(Width: js.Any, Spacing: js.Any, EvenlySpaced: js.Any): TextColumn = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  var EvenlySpaced: Double = js.native
  
  var FlowDirection: WdFlowDirection = js.native
  
  def Item(Index: Double): TextColumn = js.native
  
  var LineBetween: Double = js.native
  
  val Parent: js.Any = js.native
  
  def SetCount(NumColumns: Double): Unit = js.native
  
  var Spacing: Double = js.native
  
  var Width: Double = js.native
  
  @JSName("Word.TextColumns_typekey")
  var WordDotTextColumns_typekey: TextColumns = js.native
}
