package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tables extends js.Object {
  
  def Add(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  def Add(
    Range: Range,
    NumRows: Double,
    NumColumns: Double,
    DefaultTableBehavior: js.UndefOr[scala.Nothing],
    AutoFitBehavior: js.Any
  ): Table = js.native
  def Add(Range: Range, NumRows: Double, NumColumns: Double, DefaultTableBehavior: js.Any): Table = js.native
  def Add(
    Range: Range,
    NumRows: Double,
    NumColumns: Double,
    DefaultTableBehavior: js.Any,
    AutoFitBehavior: js.Any
  ): Table = js.native
  
  def AddOld(Range: Range, NumRows: Double, NumColumns: Double): Table = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: Double): Table = js.native
  
  val NestingLevel: Double = js.native
  
  val Parent: js.Any = js.native
  
  @JSName("Word.Tables_typekey")
  var WordDotTables_typekey: Tables = js.native
}
