package typings.aceBuilds.mod.Ace

import typings.aceBuilds.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UndoManager extends js.Object {
  def add(delta: Delta, allowMerge: Boolean, session: EditSession): Unit = js.native
  def addSelection(selection: String): Unit = js.native
  def addSelection(selection: String, rev: Double): Unit = js.native
  def addSession(session: EditSession): Unit = js.native
  def bookmark(): Unit = js.native
  def bookmark(rev: Double): Unit = js.native
  def canRedo(): Boolean = js.native
  def canUndo(): Boolean = js.native
  def getDeltas(from: Double): js.Array[Delta] = js.native
  def getDeltas(from: Double, to: Double): js.Array[Delta] = js.native
  def getRevision(): Double = js.native
  def getSelection(rev: Double): Rev = js.native
  def getSelection(rev: Double, after: Boolean): Rev = js.native
  def isAtBookmark(): Boolean = js.native
  def markIgnored(from: Double): Unit = js.native
  def markIgnored(from: Double, to: Double): Unit = js.native
  def redo(session: EditSession): Unit = js.native
  def redo(session: EditSession, dontSelect: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def startNewGroup(): Unit = js.native
  def undo(session: EditSession): Unit = js.native
  def undo(session: EditSession, dontSelect: Boolean): Unit = js.native
}

