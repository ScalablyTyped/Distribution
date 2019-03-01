package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.inspectionNs

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
  def addActionListener(listener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener): scala.Unit
  /**
    * removes a listener which was previously added via {@link addActionListener()}
    * @param listener the listener to revoke
    */
  def removeActionListener(listener: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener): scala.Unit
}

object XHyperlinkControl {
  @scala.inline
  def apply(
    ControlContext: XPropertyControlContext,
    ControlType: scala.Double,
    ControlWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    Value: js.Any,
    ValueType: activexDashLibreofficeLib.`type`,
    addActionListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener, scala.Unit],
    isModified: js.Function0[scala.Boolean],
    notifyModifiedValue: js.Function0[scala.Unit],
    removeActionListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XActionListener, scala.Unit]
  ): XHyperlinkControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ControlContext")(ControlContext)
    __obj.updateDynamic("ControlType")(ControlType)
    __obj.updateDynamic("ControlWindow")(ControlWindow)
    __obj.updateDynamic("Value")(Value)
    __obj.updateDynamic("ValueType")(ValueType)
    __obj.updateDynamic("addActionListener")(addActionListener)
    __obj.updateDynamic("isModified")(isModified)
    __obj.updateDynamic("notifyModifiedValue")(notifyModifiedValue)
    __obj.updateDynamic("removeActionListener")(removeActionListener)
    __obj.asInstanceOf[XHyperlinkControl]
  }
}

