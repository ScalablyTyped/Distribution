package typings.activexDashLibreoffice.comNs.sunNs.starNs.inspectionNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XActionListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines the interface for an {@link XPropertyControl} which displays its value in a hyperlink-like way
  *
  * Hyperlink controls exchange their value ( {@link XPropertyControl.Value} ) as strings.
  * @since OOo 2.0.3
  */
trait XHyperlinkControl extends XPropertyControl {
  /**
    * adds a listener which will be notified when the user clicked the hyperlink text in the control
    * @param listener the listener to notify of hyperlink clicks
    */
  def addActionListener(listener: XActionListener): Unit
  /**
    * removes a listener which was previously added via {@link addActionListener()}
    * @param listener the listener to revoke
    */
  def removeActionListener(listener: XActionListener): Unit
}

object XHyperlinkControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: Double,
    ControlWindow: XWindow,
    Value: js.Any,
    ValueType: `type`,
    addActionListener: XActionListener => Unit,
    isModified: () => Boolean,
    notifyModifiedValue: () => Unit,
    removeActionListener: XActionListener => Unit
  ): XHyperlinkControl = {
    val __obj = js.Dynamic.literal(ControlContext = ControlContext, ControlType = ControlType, ControlWindow = ControlWindow, Value = Value, ValueType = ValueType, addActionListener = js.Any.fromFunction1(addActionListener), isModified = js.Any.fromFunction0(isModified), notifyModifiedValue = js.Any.fromFunction0(notifyModifiedValue), removeActionListener = js.Any.fromFunction1(removeActionListener))
  
    __obj.asInstanceOf[XHyperlinkControl]
  }
}

