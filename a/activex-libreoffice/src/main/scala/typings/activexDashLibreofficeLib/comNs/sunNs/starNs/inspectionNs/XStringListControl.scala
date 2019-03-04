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
  val ListEntries: activexDashInteropLib.SafeArray[java.lang.String]
  /** appends a new entry to the end of the list */
  def appendListEntry(NewEntry: java.lang.String): scala.Unit
  /** clears the whole list */
  def clearList(): scala.Unit
  /** gets all list entries */
  def getListEntries(): activexDashInteropLib.SafeArray[java.lang.String]
  /** prepends a new entry to the beginning of the list */
  def prependListEntry(NewEntry: java.lang.String): scala.Unit
}

object XStringListControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: scala.Double,
    ControlWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    ListEntries: activexDashInteropLib.SafeArray[java.lang.String],
    Value: js.Any,
    ValueType: activexDashLibreofficeLib.`type`,
    appendListEntry: js.Function1[java.lang.String, scala.Unit],
    clearList: js.Function0[scala.Unit],
    getListEntries: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    isModified: js.Function0[scala.Boolean],
    notifyModifiedValue: js.Function0[scala.Unit],
    prependListEntry: js.Function1[java.lang.String, scala.Unit]
  ): XStringListControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext, ControlType = ControlType, ControlWindow = ControlWindow, ListEntries = ListEntries, Value = Value, ValueType = ValueType, appendListEntry = appendListEntry, clearList = clearList, getListEntries = getListEntries, isModified = isModified, notifyModifiedValue = notifyModifiedValue, prependListEntry = prependListEntry)
  
    __obj.asInstanceOf[XStringListControl]
  }
}

