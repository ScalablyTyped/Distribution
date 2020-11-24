package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Document extends EventEmitter {
  
  def applyDelta(delta: Delta): Unit = js.native
  def applyDelta(delta: Delta, doNotValidate: Boolean): Unit = js.native
  
  def applyDeltas(deltas: js.Array[Delta]): Unit = js.native
  
  def clippedPos(row: Double, column: Double): Point = js.native
  
  def clonePos(pos: Point): Point = js.native
  
  def createAnchor(row: Double, column: Double): Anchor = js.native
  
  def getAllLines(): js.Array[String] = js.native
  
  def getLine(row: Double): String = js.native
  
  def getLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  def getLinesForRange(range: Range): js.Array[String] = js.native
  
  def getNewLineCharacter(): String = js.native
  
  def getNewLineMode(): NewLineMode = js.native
  
  def getTextRange(range: Range): String = js.native
  
  def getValue(): String = js.native
  
  def indexToPosition(index: Double, startRow: Double): Point = js.native
  
  def insert(position: Point, text: String): Point = js.native
  
  def insertFullLines(row: Double, lines: js.Array[String]): Unit = js.native
  
  def insertInLine(position: Point, text: String): Point = js.native
  
  def insertMergedLines(position: Point, lines: js.Array[String]): Point = js.native
  
  def isNewLine(text: String): Boolean = js.native
  
  def pos(row: Double, column: Double): Point = js.native
  
  def positionToIndex(pos: Point): Double = js.native
  def positionToIndex(pos: Point, startRow: Double): Double = js.native
  
  def remove(range: Range): Point = js.native
  
  def removeFullLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  def removeInLine(row: Double, startColumn: Double, endColumn: Double): Point = js.native
  
  def removeNewLine(row: Double): Unit = js.native
  
  def replace(range: Range, text: String): Point = js.native
  
  def revertDelta(delta: Delta): Unit = js.native
  
  def revertDeltas(deltas: js.Array[Delta]): Unit = js.native
  
  def setNewLineMode(newLineMode: NewLineMode): Unit = js.native
  
  def setValue(text: String): Unit = js.native
}
