package typings.aceBuilds.mod.Ace

import typings.aceBuilds.anon.FirstRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Folding extends StObject {
  
  def addFold(placeholder: String): Fold = js.native
  def addFold(placeholder: String, range: Range): Fold = js.native
  def addFold(placeholder: Fold): Fold = js.native
  def addFold(placeholder: Fold, range: Range): Fold = js.native
  
  def addFolds(folds: js.Array[Fold]): Unit = js.native
  
  def expandFold(fold: Fold): Unit = js.native
  
  def expandFolds(folds: js.Array[Fold]): Unit = js.native
  
  def foldAll(): Unit = js.native
  def foldAll(startRow: Double): Unit = js.native
  def foldAll(startRow: Double, endRow: Double): Unit = js.native
  def foldAll(startRow: Double, endRow: Double, depth: Double): Unit = js.native
  def foldAll(startRow: Double, endRow: Unit, depth: Double): Unit = js.native
  def foldAll(startRow: Unit, endRow: Double): Unit = js.native
  def foldAll(startRow: Unit, endRow: Double, depth: Double): Unit = js.native
  def foldAll(startRow: Unit, endRow: Unit, depth: Double): Unit = js.native
  
  def getAllFolds(): js.Array[Fold] = js.native
  
  def getCommentFoldRange(row: Double, column: Double, dir: Double): js.UndefOr[Range] = js.native
  
  def getDisplayLine(row: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Double, startRow: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Double, startRow: Double, startColumn: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Double, startRow: Null, startColumn: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Null, startRow: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Null, startRow: Double, startColumn: Double): String = js.native
  def getDisplayLine(row: Double, endColumn: Null, startRow: Null, startColumn: Double): String = js.native
  
  def getFoldAt(row: Double, column: Double, side: Double): Fold = js.native
  
  def getFoldDisplayLine(foldLine: FoldLine): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Double, startRow: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Double, startRow: Double, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Double, startRow: Null, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Null, startRow: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Null, startRow: Double, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Double, endColumn: Null, startRow: Null, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Double, startRow: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Double, startRow: Double, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Double, startRow: Null, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Null, startRow: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Null, startRow: Double, startColumn: Double): String = js.native
  def getFoldDisplayLine(foldLine: FoldLine, endRow: Null, endColumn: Null, startRow: Null, startColumn: Double): String = js.native
  
  def getFoldLine(docRow: Double): FoldLine | Null = js.native
  def getFoldLine(docRow: Double, startFoldLine: FoldLine): FoldLine | Null = js.native
  
  def getFoldRowEnd(docRow: Double): Double = js.native
  def getFoldRowEnd(docRow: Double, startFoldRow: FoldLine): Double = js.native
  
  def getFoldRowStart(docRow: Double): Double = js.native
  def getFoldRowStart(docRow: Double, startFoldRow: FoldLine): Double = js.native
  
  def getFoldStringAt(row: Double, column: Double): String | Null = js.native
  def getFoldStringAt(row: Double, column: Double, trim: Double): String | Null = js.native
  def getFoldStringAt(row: Double, column: Double, trim: Double, foldLine: FoldLine): String | Null = js.native
  def getFoldStringAt(row: Double, column: Double, trim: Unit, foldLine: FoldLine): String | Null = js.native
  
  def getFoldedRowCount(first: Double, last: Double): Double = js.native
  
  def getFoldsInRange(range: Range): js.Array[Fold] = js.native
  
  def getFoldsInRangeList(ranges: js.Array[Range]): js.Array[Fold] = js.native
  
  def getNextFoldLine(docRow: Double): FoldLine | Null = js.native
  def getNextFoldLine(docRow: Double, startFoldLine: FoldLine): FoldLine | Null = js.native
  
  def getParentFoldRangeData(row: Double): FirstRange = js.native
  def getParentFoldRangeData(row: Double, ignoreCurrent: Boolean): FirstRange = js.native
  
  def isRowFolded(docRow: Double): Boolean = js.native
  def isRowFolded(docRow: Double, startFoldRow: FoldLine): Boolean = js.native
  
  def removeFold(fold: Fold): Unit = js.native
  
  def removeFolds(folds: js.Array[Fold]): Unit = js.native
  
  def setFoldStyle(style: String): Unit = js.native
  
  def toggleFold(): Unit = js.native
  def toggleFold(tryToUnfold: Boolean): Unit = js.native
  
  def toggleFoldWidget(): Unit = js.native
  def toggleFoldWidget(toggleParent: Boolean): Unit = js.native
  
  def unfold(): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Double): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Double, expandInner: Boolean): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Null, expandInner: Boolean): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Point): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Point, expandInner: Boolean): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Range): js.UndefOr[js.Array[Fold]] = js.native
  def unfold(location: Range, expandInner: Boolean): js.UndefOr[js.Array[Fold]] = js.native
  
  def updateFoldWidgets(delta: Delta): Unit = js.native
}
