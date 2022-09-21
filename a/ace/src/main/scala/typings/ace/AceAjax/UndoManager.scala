package typings.ace.AceAjax

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndoManager extends StObject {
  
  /**
    * Marks the current status clean
    * @param rev {:rev}
    **/
  def bookmark(): Unit = js.native
  def bookmark(rev: Double): Unit = js.native
  
  /**
    * Returns `true` if there are redo operations left to perform.
    **/
  def canRedo(): Boolean = js.native
  
  /**
    * Returns `true` if there are undo operations left to perform.
    **/
  def canUndo(): Boolean = js.native
  
  /**
    * Alias for canRedo
    **/
  def hasRedo(): Boolean = js.native
  
  /**
    * Alias for canUndo
    **/
  def hasUndo(): Boolean = js.native
  
  /**
    * Returns if the current status is clean
    **/
  def isAtBookmark(): Boolean = js.native
  
  /**
    * Alias for isAtBookmark
    **/
  def isClean(): Boolean = js.native
  
  /**
    * Alias for bookmark
    **/
  def markClean(): Unit = js.native
  def markClean(rev: Double): Unit = js.native
  
  /**
    * [Perform a redo operation on the document, reimplementing the last change.]{: #UndoManager.redo}
    * @param session {:session}
    * @param dontSelect {:dontSelect}
    **/
  def redo(): Unit = js.native
  def redo(session: Unit, dontSelect: Boolean): Unit = js.native
  def redo(session: IEditSession): Unit = js.native
  def redo(session: IEditSession, dontSelect: Boolean): Unit = js.native
  
  /**
    * Destroys the stack of undo and redo redo operations.
    **/
  def reset(): Unit = js.native
  
  /**
    * [Perform an undo operation on the document, reverting the last change.]{: #UndoManager.undo}
    * @param session {:session}
    * @param dontSelect {:dontSelect}
    **/
  def undo(): Range = js.native
  def undo(session: Unit, dontSelect: Boolean): Range = js.native
  def undo(session: IEditSession): Range = js.native
  def undo(session: IEditSession, dontSelect: Boolean): Range = js.native
}
