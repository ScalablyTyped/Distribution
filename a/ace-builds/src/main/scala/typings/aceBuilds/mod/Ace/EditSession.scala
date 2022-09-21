package typings.aceBuilds.mod.Ace

import typings.aceBuilds.aceBuildsStrings.auto
import typings.aceBuilds.aceBuildsStrings.change
import typings.aceBuilds.aceBuildsStrings.changeFold
import typings.aceBuilds.aceBuildsStrings.changeScrollLeft
import typings.aceBuilds.aceBuildsStrings.changeScrollTop
import typings.aceBuilds.aceBuildsStrings.code
import typings.aceBuilds.aceBuildsStrings.firstLineNumber
import typings.aceBuilds.aceBuildsStrings.foldStyle
import typings.aceBuilds.aceBuildsStrings.free
import typings.aceBuilds.aceBuildsStrings.fullLine
import typings.aceBuilds.aceBuildsStrings.indentedSoftWrap
import typings.aceBuilds.aceBuildsStrings.manual
import typings.aceBuilds.aceBuildsStrings.markbegin
import typings.aceBuilds.aceBuildsStrings.markbeginend
import typings.aceBuilds.aceBuildsStrings.mode
import typings.aceBuilds.aceBuildsStrings.navigateWithinSoftTabs
import typings.aceBuilds.aceBuildsStrings.newLineMode
import typings.aceBuilds.aceBuildsStrings.off
import typings.aceBuilds.aceBuildsStrings.overwrite
import typings.aceBuilds.aceBuildsStrings.printmargin_
import typings.aceBuilds.aceBuildsStrings.screenLine
import typings.aceBuilds.aceBuildsStrings.tabSize
import typings.aceBuilds.aceBuildsStrings.text
import typings.aceBuilds.aceBuildsStrings.tokenizerUpdate
import typings.aceBuilds.aceBuildsStrings.useSoftTabs
import typings.aceBuilds.aceBuildsStrings.useWorker
import typings.aceBuilds.aceBuildsStrings.wrap
import typings.aceBuilds.aceBuildsStrings.wrapMethod
import typings.aceBuilds.anon.Action
import typings.aceBuilds.anon.Data
import typings.aceBuilds.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSession
  extends StObject
     with EventEmitter
     with OptionsProvider {
  
  def addDynamicMarker(marker: MarkerLike, inFront: Boolean): MarkerLike = js.native
  
  def addGutterDecoration(row: Double, className: String): Unit = js.native
  
  def addMarker(range: Range, className: String, `type`: fullLine | screenLine | text): Double = js.native
  def addMarker(range: Range, className: String, `type`: fullLine | screenLine | text, inFront: Boolean): Double = js.native
  def addMarker(range: Range, className: String, `type`: MarkerRenderer): Double = js.native
  def addMarker(range: Range, className: String, `type`: MarkerRenderer, inFront: Boolean): Double = js.native
  
  def adjustWrapLimit(desiredLimit: Double): Boolean = js.native
  
  def clearAnnotations(): Unit = js.native
  
  def clearBreakpoint(row: Double): Unit = js.native
  
  def clearBreakpoints(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  val doc: Document = js.native
  
  def documentToScreenColumn(row: Double, docColumn: Double): Double = js.native
  
  def documentToScreenPosition(docRow: Double, docColumn: Double): Position = js.native
  def documentToScreenPosition(position: Position): Position = js.native
  
  def documentToScreenRow(docRow: Double, docColumn: Double): Double = js.native
  
  def duplicateLines(firstRow: Double, lastRow: Double): Unit = js.native
  
  def getAWordRange(row: Double, column: Double): Range = js.native
  
  def getAnnotations(): js.Array[Annotation] = js.native
  
  def getBreakpoints(): js.Array[String] = js.native
  
  def getDocument(): Document = js.native
  
  def getDocumentLastRowColumn(docRow: Double, docColumn: Double): Double = js.native
  
  def getLength(): Double = js.native
  
  def getLine(row: Double): String = js.native
  
  def getLineWidgetMaxWidth(): Double = js.native
  
  def getLines(firstRow: Double, lastRow: Double): js.Array[String] = js.native
  
  def getMarkers(): js.Array[MarkerLike] = js.native
  def getMarkers(inFront: Boolean): js.Array[MarkerLike] = js.native
  
  def getMode(): SyntaxMode = js.native
  
  def getNavigateWithinSoftTabs(): Boolean = js.native
  
  def getNewLineMode(): NewLineMode = js.native
  
  @JSName("getOption")
  def getOption_firstLineNumber(name: firstLineNumber): Double = js.native
  @JSName("getOption")
  def getOption_foldStyle(name: foldStyle): markbegin | markbeginend | manual = js.native
  @JSName("getOption")
  def getOption_indentedSoftWrap(name: indentedSoftWrap): Boolean = js.native
  @JSName("getOption")
  def getOption_mode(name: mode): String = js.native
  @JSName("getOption")
  def getOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs): Boolean = js.native
  @JSName("getOption")
  def getOption_newLineMode(name: newLineMode): NewLineMode = js.native
  @JSName("getOption")
  def getOption_overwrite(name: overwrite): Boolean = js.native
  @JSName("getOption")
  def getOption_tabSize(name: tabSize): Double = js.native
  @JSName("getOption")
  def getOption_useSoftTabs(name: useSoftTabs): Boolean = js.native
  @JSName("getOption")
  def getOption_useWorker(name: useWorker): Boolean = js.native
  @JSName("getOption")
  def getOption_wrap(name: wrap): off | free | printmargin_ | Boolean | Double = js.native
  @JSName("getOption")
  def getOption_wrapMethod(name: wrapMethod): code | text | auto = js.native
  
  def getOverwrite(): Boolean = js.native
  
  def getRowLineCount(row: Double): Double = js.native
  
  def getRowSplitData(row: Double): js.UndefOr[String] = js.native
  
  def getRowWrapIndent(screenRow: Double): Double = js.native
  
  def getScreenLastRowColumn(screenRow: Double): Double = js.native
  
  def getScreenLength(): Double = js.native
  
  def getScreenTabSize(screenColumn: Double): Double = js.native
  
  def getScreenWidth(): Double = js.native
  
  def getScrollLeft(): Double = js.native
  
  def getScrollTop(): Double = js.native
  
  def getSelection(): Selection = js.native
  
  def getState(row: Double): String = js.native
  
  def getTabSize(): Double = js.native
  
  def getTabString(): String = js.native
  
  def getTextRange(range: Range): String = js.native
  
  def getTokenAt(row: Double, column: Double): Token | Null = js.native
  
  def getTokens(row: Double): js.Array[Token] = js.native
  
  def getUndoManager(): UndoManager = js.native
  
  def getUseSoftTabs(): Boolean = js.native
  
  def getUseWorker(): Boolean = js.native
  
  def getUseWrapMode(): Boolean = js.native
  
  def getValue(): String = js.native
  
  def getWordRange(row: Double, column: Double): Range = js.native
  
  def getWrapLimit(): Double = js.native
  
  def getWrapLimitRange(): Max = js.native
  
  def getdocumentLastRowColumnPosition(docRow: Double, docColumn: Double): Position = js.native
  
  def highlight(re: js.RegExp): Unit = js.native
  
  def highlightLines(startRow: Double, endRow: Double, className: String): Range = js.native
  def highlightLines(startRow: Double, endRow: Double, className: String, inFront: Boolean): Range = js.native
  
  def indentRows(startRow: Double, endRow: Double, indentString: String): Unit = js.native
  
  def insert(position: Position, text: String): Unit = js.native
  
  def isTabStop(position: Position): Boolean = js.native
  
  def markUndoGroup(): Unit = js.native
  
  def moveLinesDown(firstRow: Double, lastRow: Double): Unit = js.native
  
  def moveLinesUp(firstRow: Double, lastRow: Double): Unit = js.native
  
  def moveText(fromRange: Range, toPosition: Position): Unit = js.native
  def moveText(fromRange: Range, toPosition: Position, copy: Boolean): Unit = js.native
  
  @JSName("on")
  def on_change(name: change, callback: js.Function0[Unit]): js.Function = js.native
  // TODO: define BackgroundTokenizer
  @JSName("on")
  def on_changeFold(name: changeFold, callback: js.Function1[/* obj */ Action, Unit]): js.Function = js.native
  @JSName("on")
  def on_changeScrollLeft(name: changeScrollLeft, callback: js.Function1[/* scrollLeft */ Double, Unit]): js.Function = js.native
  @JSName("on")
  def on_changeScrollTop(name: changeScrollTop, callback: js.Function1[/* scrollTop */ Double, Unit]): js.Function = js.native
  @JSName("on")
  def on_tokenizerUpdate(name: tokenizerUpdate, callback: js.Function1[/* obj */ Data, Unit]): js.Function = js.native
  
  def outdentRows(range: Range): Unit = js.native
  
  def redoChanges(deltas: js.Array[Delta]): Unit = js.native
  def redoChanges(deltas: js.Array[Delta], dontSelect: Boolean): Unit = js.native
  
  def remove(range: Range): Unit = js.native
  
  def removeFullLines(firstRow: Double, lastRow: Double): Unit = js.native
  
  def removeGutterDecoration(row: Double, className: String): Unit = js.native
  
  def removeMarker(markerId: Double): Unit = js.native
  
  def replace(range: Range, text: String): Unit = js.native
  
  def resetCaches(): Unit = js.native
  
  def screenToDocumentColumn(screenRow: Double, screenColumn: Double): Double = js.native
  
  def screenToDocumentPosition(screenRow: Double, screenColumn: Double): Position = js.native
  def screenToDocumentPosition(screenRow: Double, screenColumn: Double, offsetX: Double): Position = js.native
  
  def screenToDocumentRow(screenRow: Double, screenColumn: Double): Double = js.native
  
  var selection: Selection = js.native
  
  def setAnnotations(annotations: js.Array[Annotation]): Unit = js.native
  
  def setBreakpoint(row: Double, className: String): Unit = js.native
  
  def setBreakpoints(rows: js.Array[Double]): Unit = js.native
  
  def setDocument(doc: Document): Unit = js.native
  
  def setMode(mode: String): Unit = js.native
  def setMode(mode: String, callback: js.Function0[Unit]): Unit = js.native
  def setMode(mode: SyntaxMode): Unit = js.native
  def setMode(mode: SyntaxMode, callback: js.Function0[Unit]): Unit = js.native
  
  def setNavigateWithinSoftTabs(navigateWithinSoftTabs: Boolean): Unit = js.native
  
  def setNewLineMode(newLineMode: NewLineMode): Unit = js.native
  
  def setOption(name: foldStyle, value: markbegin | markbeginend | manual): Unit = js.native
  def setOption(name: wrapMethod, value: code | text | auto): Unit = js.native
  def setOption(name: wrap, value: off | free | printmargin_): Unit = js.native
  @JSName("setOption")
  def setOption_firstLineNumber(name: firstLineNumber, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_indentedSoftWrap(name: indentedSoftWrap, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_mode(name: mode, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_navigateWithinSoftTabs(name: navigateWithinSoftTabs, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_newLineMode(name: newLineMode, value: NewLineMode): Unit = js.native
  @JSName("setOption")
  def setOption_overwrite(name: overwrite, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_tabSize(name: tabSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_useSoftTabs(name: useSoftTabs, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_useWorker(name: useWorker, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_wrap(name: wrap, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_wrap(name: wrap, value: Double): Unit = js.native
  
  def setOverwrite(overwrite: Boolean): Unit = js.native
  
  def setScrollLeft(scrollLeft: Double): Unit = js.native
  
  def setScrollTop(scrollTop: Double): Unit = js.native
  
  def setTabSize(tabSize: Double): Unit = js.native
  
  def setUndoManager(undoManager: UndoManager): Unit = js.native
  
  def setUndoSelect(enable: Boolean): Unit = js.native
  
  def setUseSoftTabs(`val`: Boolean): Unit = js.native
  
  def setUseWorker(useWorker: Boolean): Unit = js.native
  
  def setUseWrapMode(useWrapMode: Boolean): Unit = js.native
  
  def setValue(text: String): Unit = js.native
  
  def setWrapLimit(limit: Double): Unit = js.native
  
  def setWrapLimitRange(min: Double, max: Double): Unit = js.native
  
  def toggleOverwrite(): Unit = js.native
  
  def undoChanges(deltas: js.Array[Delta]): Unit = js.native
  def undoChanges(deltas: js.Array[Delta], dontSelect: Boolean): Unit = js.native
}
