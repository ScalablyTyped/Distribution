package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoldLine extends js.Object {
  
  def addFold(fold: Fold): Unit = js.native
  
  def addRemoveChars(row: Double, column: Double, len: Double): Unit = js.native
  
  def containsRow(row: Double): Boolean = js.native
  
  var end: Point = js.native
  
  var folds: js.Array[Fold] = js.native
  
  def getNextFoldTo(row: Double, column: Double): Null | typings.aceBuilds.anon.Fold = js.native
  
  def idxToPosition(idx: Double): Point = js.native
  
  def merge(foldLineNext: FoldLine): Unit = js.native
  
  var range: Range = js.native
  
  def shiftRow(shift: Double): Unit = js.native
  
  def split(row: Double, column: Double): FoldLine = js.native
  
  var start: Point = js.native
  
  def walk(callback: js.Function): Unit = js.native
  def walk(callback: js.Function, endRow: js.UndefOr[scala.Nothing], endColumn: Double): Unit = js.native
  def walk(callback: js.Function, endRow: Double): Unit = js.native
  def walk(callback: js.Function, endRow: Double, endColumn: Double): Unit = js.native
}
