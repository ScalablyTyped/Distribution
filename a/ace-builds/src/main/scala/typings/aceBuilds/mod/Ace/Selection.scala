package typings.aceBuilds.mod.Ace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selection extends EventEmitter {
  
  def addRange(range: Range): Unit = js.native
  
  def clearSelection(): Unit = js.native
  
  def fromJSON(selection: js.Array[SavedSelection]): Unit = js.native
  def fromJSON(selection: SavedSelection): Unit = js.native
  
  def fromOrientedRange(range: Range): Unit = js.native
  
  def getAllRanges(): js.Array[Range] = js.native
  
  def getAnchor(): Point = js.native
  
  def getCursor(): Point = js.native
  
  def getRange(): Range = js.native
  
  def getWordRange(): Unit = js.native
  
  def isBackwards(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  def isMultiLine(): Boolean = js.native
  
  def moveCursorBy(rows: Double, chars: Double): Unit = js.native
  
  def moveCursorDown(): Unit = js.native
  
  def moveCursorFileEnd(): Unit = js.native
  
  def moveCursorFileStart(): Unit = js.native
  
  def moveCursorLeft(): Unit = js.native
  
  def moveCursorLineEnd(): Unit = js.native
  
  def moveCursorLineStart(): Unit = js.native
  
  def moveCursorLongWordLeft(): Unit = js.native
  
  def moveCursorLongWordRight(): Unit = js.native
  
  def moveCursorRight(): Unit = js.native
  
  def moveCursorTo(row: Double, column: Double): Unit = js.native
  def moveCursorTo(row: Double, column: Double, keepDesiredColumn: Boolean): Unit = js.native
  
  def moveCursorToPosition(position: js.Any): Unit = js.native
  
  def moveCursorToScreen(row: Double, column: Double, keepDesiredColumn: Boolean): Unit = js.native
  
  def moveCursorUp(): Unit = js.native
  
  def moveCursorWordLeft(): Unit = js.native
  
  def moveCursorWordRight(): Unit = js.native
  
  def selectAWord(): Unit = js.native
  
  def selectAll(): Unit = js.native
  
  def selectDown(): Unit = js.native
  
  def selectFileEnd(): Unit = js.native
  
  def selectFileStart(): Unit = js.native
  
  def selectLeft(): Unit = js.native
  
  def selectLine(): Unit = js.native
  
  def selectLineEnd(): Unit = js.native
  
  def selectLineStart(): Unit = js.native
  
  def selectRight(): Unit = js.native
  
  def selectTo(row: Double, column: Double): Unit = js.native
  
  def selectToPosition(pos: js.Any): Unit = js.native
  
  def selectUp(): Unit = js.native
  
  def selectWord(): Unit = js.native
  
  def selectWordLeft(): Unit = js.native
  
  def selectWordRight(): Unit = js.native
  
  def setAnchor(row: Double, column: Double): Unit = js.native
  
  def setCursor(row: Double, column: Double): Unit = js.native
  
  def setRange(range: Range): Unit = js.native
  def setRange(range: Range, reverse: Boolean): Unit = js.native
  
  def setSelectionRange(`match`: js.Any): Unit = js.native
  
  def toJSON(): SavedSelection | js.Array[SavedSelection] = js.native
}
