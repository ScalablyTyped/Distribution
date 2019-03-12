package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the undo/redo stacks of a document
  *
  * **Undo**
  *
  * Changes to a document usually result in recording of information how to undo those changes, if desired. A so-called undo action records the
  * information how to undo a single change. Undo actions are maintained in a stack, so that the changes they represent can be undo in the reverse order
  * they have originally been applied.
  *
  * **Redo**
  *
  * Additionally, the Undo manager manages a Redo stack: Actions which are undone are moved from the Undo to the Redo stack, so it is possible to re-apply
  * the changes to the document.
  *
  * **Undo contexts**
  *
  * For collecting multiple changes in a single undo action, so-called Undo contexts are provided. When an Undo context is entered, all subsequently added
  * Undo actions are not pushed onto the undo stack directly, but considered a sub action of the Undo context. Once the Undo context is left, a single
  * undo action is pushed onto the undo stack, which comprises all those single Undo actions. ;  Undo contexts can be arbitrarily nested.
  *
  * **Hidden Undo actions**
  *
  * Hidden Undo actions are those which in no observable way contribute to the undo stack. That is, any method retrieving information about the stack will
  * behave as if the undo action does not exist. Nonetheless, calling {@link undo()} respectively {@link redo()} will include those actions. ;  Hidden
  * Undo actions can be created by calling {@link enterHiddenUndoContext()} , following by {@link leaveUndoContext()} .
  *
  * **Locking**
  *
  * An Undo manager can be locked and unlocked, using the XLockable::lock() and XLockable::unlock() methods. When it is locked, then every attempt to add
  * an undo action, or to enter or leave an Undo context, will be silently ignored.
  * @since OOo 3.4
  */
trait XUndoManager
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XLockable {
  /**
    * returns the titles of all actions currently on the Redo stack, from top to bottom
    * @see XUndoAction.Title
    */
  val AllRedoActionTitles: stdLib.SafeArray[java.lang.String]
  /**
    * returns the titles of all actions currently on the undo stack, from top to bottom
    * @see XUndoAction.Title
    */
  val AllUndoActionTitles: stdLib.SafeArray[java.lang.String]
  /**
    * returns the title of the top-most action on the Redo stack
    * @see XUndoAction.Title
    * @throws EmptyUndoStackException when the Redo stack is currently empty
    */
  val CurrentRedoActionTitle: java.lang.String
  /**
    * returns the title of the top-most action on the undo stack
    * @see XUndoAction.Title
    * @throws EmptyUndoStackException when the undo stack is currently empty
    */
  val CurrentUndoActionTitle: java.lang.String
  /**
    * adds the given undo action to the undo stack.
    *
    * The redo stack is cleared when a new action is pushed onto the undo stack.
    *
    * The Undo manager takes ownership of any actions pushed onto the undo stack. This means that if the action is finally removed from the Undo manager's
    * control (e.g. by calling {@link clear()} resp. {@link clearRedo()} ), it will be disposed, as long as it supports the {@link
    * com.sun.star.lang.XComponent} interface.
    *
    * If the Undo manager is [locked]{@link url="#locking"} at the moment the method is called, the call will be ignored, and the undo action will
    * immediately be disposed, if applicable.
    * @throws com::sun::star::lang::IllegalArgumentException if the given undo action is `NULL` .
    */
  def addUndoAction(iAction: XUndoAction): scala.Unit
  /** adds a listener to be notified of changes in the Undo/Redo stacks. */
  def addUndoManagerListener(iListener: XUndoManagerListener): scala.Unit
  /**
    * clears the undo and the redo stack.
    *
    * All actions will be removed from both the Undo and the Redo stack. Actions which implement the {@link com.sun.star.lang.XComponent} interface will be
    * disposed.
    * @throws UndoContextNotClosedException if the method is invoked while an undo context is still open
    */
  def clear(): scala.Unit
  /**
    * clears the redo stack.
    *
    * All actions will be removed from the Redo stack. Actions which implement the {@link com.sun.star.lang.XComponent} interface will be disposed.
    * @throws UndoContextNotClosedException if the method is invoked while an undo context is still open
    */
  def clearRedo(): scala.Unit
  /**
    * enters a new undo context, creating a hidden undo action.
    *
    * A hidden undo action does not, in any visible way, contribute to the undo stack. This means that Calling {@link undo()} when the top-element is a
    * hidden undo action will transparently undo this action, and also undo the new top element of the stack.Calling {@link redo()} when the top-element is
    * a hidden action will transparently redo this action, and also redo the new top element of the stack.In any user interface presenting the current Undo
    * or Redo actions to the user, a hidden action will not be listed.
    *
    *
    *
    * A new undo action will be added to the undo stack. As long as the context is not left, every undo action added to the stack will be treated as sub
    * action. This means it will not be directly accessible at the undo manager, not appear in any user interface, and cannot be separately undone or
    * re-done.
    *
    * Each call to `enterHiddenUndoContext` must be paired by a call to {@link leaveUndoContext()} , otherwise, the document's undo stack is left in an
    * inconsistent state.
    *
    * Undo contexts can be nested, i.e. it is legitimate to call {@link enterUndoContext()} and `enterHiddenUndoContext` multiple times without calling
    * {@link leaveUndoContext()} inbetween.
    * @see enterUndoContext
    * @see leaveUndoContext
    * @throws EmptyUndoStackException if the undo stack is currently empty, in which case it is impossible to push a hidden undo action onto it.
    */
  def enterHiddenUndoContext(): scala.Unit
  /**
    * enters a new undo context.
    *
    * A new undo action will be added to the undo stack, with the title given as `iTitle` . As long as the context is not left, every undo action added to
    * the stack will be treated as sub action. This means it will not be directly accessible at the Undo manager, not appear in any user interface, and
    * cannot be separately undone or re-done.
    *
    * Each call to `enterUndoContext` must be paired by a call to {@link leaveUndoContext()} , otherwise, the document's undo stack is left in an
    * inconsistent state.
    *
    * Undo contexts can be nested, i.e. it is legitimate to call `enterUndoContext` and {@link enterHiddenUndoContext()} multiple times without calling
    * {@link leaveUndoContext()} inbetween.
    * @see leaveUndoContext
    */
  def enterUndoContext(iTitle: java.lang.String): scala.Unit
  /**
    * returns the titles of all actions currently on the Redo stack, from top to bottom
    * @see XUndoAction.Title
    */
  def getAllRedoActionTitles(): stdLib.SafeArray[java.lang.String]
  /**
    * returns the titles of all actions currently on the undo stack, from top to bottom
    * @see XUndoAction.Title
    */
  def getAllUndoActionTitles(): stdLib.SafeArray[java.lang.String]
  /**
    * returns the title of the top-most action on the Redo stack
    * @see XUndoAction.Title
    * @throws EmptyUndoStackException when the Redo stack is currently empty
    */
  def getCurrentRedoActionTitle(): java.lang.String
  /**
    * returns the title of the top-most action on the undo stack
    * @see XUndoAction.Title
    * @throws EmptyUndoStackException when the undo stack is currently empty
    */
  def getCurrentUndoActionTitle(): java.lang.String
  /**
    * determines whether {@link redo()} can reasonably be expected to succeed.
    * @returns `FALSE` if and only if the redo stack is currently empty, or there is an open and not-yet-closed undo context.
    */
  def isRedoPossible(): scala.Boolean
  /**
    * determines whether {@link undo()} can reasonably be expected to succeed.
    * @returns `FALSE` if and only if the undo stack is currently empty, or there is an open and not-yet-closed undo context.
    */
  def isUndoPossible(): scala.Boolean
  /**
    * leaves the undo context previously opened via {@link enterUndoContext()} respectively {@link enterHiddenUndoContext()} .
    *
    * If no undo action has been added since the context has been opened, the context is not only left, but silently removed, and does not contribute to the
    * undo stack at all. In this case, possible listeners will be notified via {@link XUndoManagerListener.cancelledContext()} .
    *
    * Otherwise, the undo context will be closed, and added to the Undo stack; the redo stack will be cleared, and listeners will be notified via {@link
    * XUndoManagerListener.leftContext()} resp. {@link XUndoManagerListener.leftHiddenContext()}
    * @see enterUndoContext
    * @see enterHiddenUndoContext
    * @throws com::sun::star::util::InvalidStateException if no undo context is currently open.
    */
  def leaveUndoContext(): scala.Unit
  /**
    * replays the action on the document which has most recently been undone
    *
    * Effectively, invoking this method will invoke {@link XUndoAction.redo()} on the top-most action of the redo stackmove this action from the redo stack
    * to the undo stack
    * @see undo
    * @throws EmptyUndoStackException when the Redo stack is currently empty
    * @throws UndoContextNotClosedException if there currently is an open undo context
    * @throws UndoFailedException if the invocation of {@link XUndoAction.redo()} raised this exception. In this case, the redo stack of the undo manager will
    */
  def redo(): scala.Unit
  /** removes a previously added listener */
  def removeUndoManagerListener(iListener: XUndoManagerListener): scala.Unit
  /**
    * resets the Undo manager
    *
    * In particular, this method will remove all locks from the undo managerclose all open undo contextsclear the undo stackclear the redo stack
    *
    * Note that possible listeners will not get notifications for the single parts of the reset, i.e. there will be no single {@link
    * XUndoManagerListener.allActionsCleared()} , {@link XUndoManagerListener.leftContext()} , etc., notifications. Instead, listeners will be notified of
    * the reset by calling their {@link XUndoManagerListener.resetAll()} method.
    */
  def reset(): scala.Unit
  /**
    * reverts the most recent action on the document.
    *
    * Effectively, invoking this method will invoke {@link XUndoAction.undo()} on the top-most action of the undo stackmove this undo action from the undo
    * stack to the redo stack
    * @see redo
    * @see enterUndoContext
    * @throws EmptyUndoStackException if the undo stack is currently empty
    * @throws UndoContextNotClosedException if there currently is an open undo context
    * @throws UndoFailedException if the invocation of {@link XUndoAction.undo()} raised this exception. In this case, the undo stack of the undo manager will
    */
  def undo(): scala.Unit
}

object XUndoManager {
  @scala.inline
  def apply(
    AllRedoActionTitles: stdLib.SafeArray[java.lang.String],
    AllUndoActionTitles: stdLib.SafeArray[java.lang.String],
    CurrentRedoActionTitle: java.lang.String,
    CurrentUndoActionTitle: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    acquire: () => scala.Unit,
    addUndoAction: XUndoAction => scala.Unit,
    addUndoManagerListener: XUndoManagerListener => scala.Unit,
    clear: () => scala.Unit,
    clearRedo: () => scala.Unit,
    enterHiddenUndoContext: () => scala.Unit,
    enterUndoContext: java.lang.String => scala.Unit,
    getAllRedoActionTitles: () => stdLib.SafeArray[java.lang.String],
    getAllUndoActionTitles: () => stdLib.SafeArray[java.lang.String],
    getCurrentRedoActionTitle: () => java.lang.String,
    getCurrentUndoActionTitle: () => java.lang.String,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    isLocked: () => scala.Boolean,
    isRedoPossible: () => scala.Boolean,
    isUndoPossible: () => scala.Boolean,
    leaveUndoContext: () => scala.Unit,
    lock: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    redo: () => scala.Unit,
    release: () => scala.Unit,
    removeUndoManagerListener: XUndoManagerListener => scala.Unit,
    reset: () => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    undo: () => scala.Unit,
    unlock: () => scala.Unit
  ): XUndoManager = {
    val __obj = js.Dynamic.literal(AllRedoActionTitles = AllRedoActionTitles, AllUndoActionTitles = AllUndoActionTitles, CurrentRedoActionTitle = CurrentRedoActionTitle, CurrentUndoActionTitle = CurrentUndoActionTitle, Parent = Parent, acquire = js.Any.fromFunction0(acquire), addUndoAction = js.Any.fromFunction1(addUndoAction), addUndoManagerListener = js.Any.fromFunction1(addUndoManagerListener), clear = js.Any.fromFunction0(clear), clearRedo = js.Any.fromFunction0(clearRedo), enterHiddenUndoContext = js.Any.fromFunction0(enterHiddenUndoContext), enterUndoContext = js.Any.fromFunction1(enterUndoContext), getAllRedoActionTitles = js.Any.fromFunction0(getAllRedoActionTitles), getAllUndoActionTitles = js.Any.fromFunction0(getAllUndoActionTitles), getCurrentRedoActionTitle = js.Any.fromFunction0(getCurrentRedoActionTitle), getCurrentUndoActionTitle = js.Any.fromFunction0(getCurrentUndoActionTitle), getParent = js.Any.fromFunction0(getParent), isLocked = js.Any.fromFunction0(isLocked), isRedoPossible = js.Any.fromFunction0(isRedoPossible), isUndoPossible = js.Any.fromFunction0(isUndoPossible), leaveUndoContext = js.Any.fromFunction0(leaveUndoContext), lock = js.Any.fromFunction0(lock), queryInterface = js.Any.fromFunction1(queryInterface), redo = js.Any.fromFunction0(redo), release = js.Any.fromFunction0(release), removeUndoManagerListener = js.Any.fromFunction1(removeUndoManagerListener), reset = js.Any.fromFunction0(reset), setParent = js.Any.fromFunction1(setParent), undo = js.Any.fromFunction0(undo), unlock = js.Any.fromFunction0(unlock))
  
    __obj.asInstanceOf[XUndoManager]
  }
}

