package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

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
  val ListEntries: stdLib.SafeArray[java.lang.String]
  /** appends a new entry to the end of the list */
  def appendListEntry(NewEntry: java.lang.String): scala.Unit
  /** clears the whole list */
  def clearList(): scala.Unit
  /** gets all list entries */
  def getListEntries(): stdLib.SafeArray[java.lang.String]
  /** prepends a new entry to the beginning of the list */
  def prependListEntry(NewEntry: java.lang.String): scala.Unit
}

object XStringListControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: scala.Double,
    ControlWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ListEntries: stdLib.SafeArray[java.lang.String],
    Value: js.Any,
    ValueType: activexDashLibreofficeLib.`type`,
    appendListEntry: java.lang.String => scala.Unit,
    clearList: () => scala.Unit,
    getListEntries: () => stdLib.SafeArray[java.lang.String],
    isModified: () => scala.Boolean,
    notifyModifiedValue: () => scala.Unit,
    prependListEntry: java.lang.String => scala.Unit
  ): XStringListControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext, ControlType = ControlType, ControlWindow = ControlWindow, ListEntries = ListEntries, Value = Value, ValueType = ValueType, appendListEntry = js.Any.fromFunction1(appendListEntry), clearList = js.Any.fromFunction0(clearList), getListEntries = js.Any.fromFunction0(getListEntries), isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue), prependListEntry = js.Any.fromFunction1(prependListEntry))
  
    __obj.asInstanceOf[XStringListControl]
  }
}

