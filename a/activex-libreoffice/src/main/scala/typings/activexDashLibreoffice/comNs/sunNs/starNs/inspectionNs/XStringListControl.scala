package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which, additionally to the basic behavior, supports a list of strings interpreted as possible
  * property values.
  *
  * A control which would canonically implement this interface is a list box control: The string list defined by {@link XStringListControl} would in the
  * control be represented as drop-down list containing all the strings.
  * @since OOo 2.0.3
  */
trait XStringListControl extends XPropertyControl {
  /** gets all list entries */
  val ListEntries: SafeArray[String]
  /** appends a new entry to the end of the list */
  def appendListEntry(NewEntry: String): Unit
  /** clears the whole list */
  def clearList(): Unit
  /** gets all list entries */
  def getListEntries(): SafeArray[String]
  /** prepends a new entry to the beginning of the list */
  def prependListEntry(NewEntry: String): Unit
}

object XStringListControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    ListEntries: SafeArray[String],
    Value: js.Any,
    ValueType: `type`,
    appendListEntry: String => Unit,
    clearList: () => Unit,
    getListEntries: () => SafeArray[String],
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit,
    prependListEntry: String => Unit
  ): XStringListControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext, ControlType = ControlType, ControlWindow = ControlWindow, ListEntries = ListEntries, Value = Value, ValueType = ValueType, appendListEntry = js.Any.fromFunction1(appendListEntry), clearList = js.Any.fromFunction0(clearList), getListEntries = js.Any.fromFunction0(getListEntries), isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue), prependListEntry = js.Any.fromFunction1(prependListEntry))
  
    __obj.asInstanceOf[XStringListControl]
  }
}

