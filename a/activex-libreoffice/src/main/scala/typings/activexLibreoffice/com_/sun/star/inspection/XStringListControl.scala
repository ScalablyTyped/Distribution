package typings.activexLibreoffice.com_.sun.star.inspection

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XWindow
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * defines the interface for an {@link XPropertyControl} which, additionally to the basic behavior, supports a list of strings interpreted as possible
  * property values.
  *
  * A control which would canonically implement this interface is a list box control: The string list defined by {@link XStringListControl} would in the
  * control be represented as drop-down list containing all the strings.
  * @since OOo 2.0.3
  */
trait XStringListControl
  extends StObject
     with XPropertyControl {
  
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
  
  inline def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    ListEntries: SafeArray[String],
    Value: Any,
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
  implicit open class MutableBuilder[Self <: XStringListControl] (val x: Self) extends AnyVal {
    
    inline def setAppendListEntry(value: String => Unit): Self = StObject.set(x, "appendListEntry", js.Any.fromFunction1(value))
    
    inline def setClearList(value: () => Unit): Self = StObject.set(x, "clearList", js.Any.fromFunction0(value))
    
    inline def setGetListEntries(value: () => SafeArray[String]): Self = StObject.set(x, "getListEntries", js.Any.fromFunction0(value))
    
    inline def setListEntries(value: SafeArray[String]): Self = StObject.set(x, "ListEntries", value.asInstanceOf[js.Any])
    
    inline def setPrependListEntry(value: String => Unit): Self = StObject.set(x, "prependListEntry", js.Any.fromFunction1(value))
  }
}
