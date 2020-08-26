package typings.activexLibreoffice.com_.sun.star.view

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typings.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides access to the settings of the controller of an office document. */
@js.native
trait ViewSettings extends XPropertySet {
  /** If this property is `TRUE` , the horizontal ruler is displayed. */
  var ShowHoriRuler: Boolean = js.native
  /** If this property is `TRUE` , the horizontal scroll bar is displayed. */
  var ShowHoriScrollBar: Boolean = js.native
  /** If this property is `TRUE` , the vertical ruler is displayed. */
  var ShowVertRuler: Boolean = js.native
  /** If this property is `TRUE` , the vertical scroll bar is displayed. */
  var ShowVertScrollBar: Boolean = js.native
  /** specifies the zoom-value in percent. */
  var ZoomValue: Double = js.native
}

object ViewSettings {
  @scala.inline
  def apply(
    PropertySetInfo: XPropertySetInfo,
    ShowHoriRuler: Boolean,
    ShowHoriScrollBar: Boolean,
    ShowVertRuler: Boolean,
    ShowVertScrollBar: Boolean,
    ZoomValue: Double,
    acquire: () => Unit,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    getPropertySetInfo: () => XPropertySetInfo,
    getPropertyValue: String => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Unit,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Unit,
    setPropertyValue: (String, js.Any) => Unit
  ): ViewSettings = {
    val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ShowHoriRuler = ShowHoriRuler.asInstanceOf[js.Any], ShowHoriScrollBar = ShowHoriScrollBar.asInstanceOf[js.Any], ShowVertRuler = ShowVertRuler.asInstanceOf[js.Any], ShowVertScrollBar = ShowVertScrollBar.asInstanceOf[js.Any], ZoomValue = ZoomValue.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addPropertyChangeListener = js.Any.fromFunction2(addPropertyChangeListener), addVetoableChangeListener = js.Any.fromFunction2(addVetoableChangeListener), getPropertySetInfo = js.Any.fromFunction0(getPropertySetInfo), getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removePropertyChangeListener = js.Any.fromFunction2(removePropertyChangeListener), removeVetoableChangeListener = js.Any.fromFunction2(removeVetoableChangeListener), setPropertyValue = js.Any.fromFunction2(setPropertyValue))
    __obj.asInstanceOf[ViewSettings]
  }
  @scala.inline
  implicit class ViewSettingsOps[Self <: ViewSettings] (val x: Self) extends AnyVal {
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
    def setShowHoriRuler(value: Boolean): Self = this.set("ShowHoriRuler", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowHoriScrollBar(value: Boolean): Self = this.set("ShowHoriScrollBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowVertRuler(value: Boolean): Self = this.set("ShowVertRuler", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowVertScrollBar(value: Boolean): Self = this.set("ShowVertScrollBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomValue(value: Double): Self = this.set("ZoomValue", value.asInstanceOf[js.Any])
  }
  
}

