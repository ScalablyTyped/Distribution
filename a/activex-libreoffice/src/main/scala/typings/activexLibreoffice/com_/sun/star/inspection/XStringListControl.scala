package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
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
@js.native
trait XStringListControl extends XPropertyControl {
  /** gets all list entries */
  val ListEntries: SafeArray[String] = js.native
  /** appends a new entry to the end of the list */
  def appendListEntry(NewEntry: String): Unit = js.native
  /** clears the whole list */
  def clearList(): Unit = js.native
  /** gets all list entries */
  def getListEntries(): SafeArray[String] = js.native
  /** prepends a new entry to the beginning of the list */
  def prependListEntry(NewEntry: String): Unit = js.native
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
    val __obj = js.Dynamic.literal(ControlContext = ControlContext.asInstanceOf[js.Any], ControlType = ControlType.asInstanceOf[js.Any], ControlWindow = ControlWindow.asInstanceOf[js.Any], ListEntries = ListEntries.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], appendListEntry = js.Any.fromFunction1(appendListEntry), clearList = js.Any.fromFunction0(clearList), getListEntries = js.Any.fromFunction0(getListEntries), isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue), prependListEntry = js.Any.fromFunction1(prependListEntry))
    __obj.asInstanceOf[XStringListControl]
  }
  @scala.inline
  implicit class XStringListControlOps[Self <: XStringListControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setListEntries(value: SafeArray[String]): Self = this.set("ListEntries", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendListEntry(value: String => Unit): Self = this.set("appendListEntry", js.Any.fromFunction1(value))
    @scala.inline
    def setClearList(value: () => Unit): Self = this.set("clearList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetListEntries(value: () => SafeArray[String]): Self = this.set("getListEntries", js.Any.fromFunction0(value))
    @scala.inline
    def setPrependListEntry(value: String => Unit): Self = this.set("prependListEntry", js.Any.fromFunction1(value))
  }
  
}

