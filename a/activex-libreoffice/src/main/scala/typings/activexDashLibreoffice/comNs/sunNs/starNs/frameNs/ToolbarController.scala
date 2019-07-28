package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.XWindow
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.XUpdatable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an abstract service for a component which offers a more complex user interface to users within a toolbar.
  *
  * A generic toolbar function is represented as a button which has a state (enabled,disabled and selected, not selected). A toolbar controller can be
  * added to a toolbar and provide information or functions within a more sophisticated user interface. ;  A typical example for toolbar controller is the
  * font chooser within the toolbar. It provides all available fonts in a dropdown box and shows the current chosen font.
  * @see com.sun.star.frame.XDispatchProvider
  * @since OOo 2.0
  */
trait ToolbarController
  extends XStatusListener
     with XInitialization
     with XUpdatable
     with XToolbarController
     with XSubToolbarController

object ToolbarController {
  @scala.inline
  def apply(
    SubToolbarName: String,
    acquire: () => Unit,
    click: () => Unit,
    createItemWindow: XWindow => XWindow,
    createPopupWindow: () => XWindow,
    disposing: EventObject => Unit,
    doubleClick: () => Unit,
    execute: Double => Unit,
    functionSelected: String => Unit,
    getSubToolbarName: () => String,
    initialize: SeqEquiv[_] => Unit,
    opensSubToolbar: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    statusChanged: FeatureStateEvent => Unit,
    update: () => Unit,
    updateImage: () => Unit
  ): ToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName, acquire = js.Any.fromFunction0(acquire), click = js.Any.fromFunction0(click), createItemWindow = js.Any.fromFunction1(createItemWindow), createPopupWindow = js.Any.fromFunction0(createPopupWindow), disposing = js.Any.fromFunction1(disposing), doubleClick = js.Any.fromFunction0(doubleClick), execute = js.Any.fromFunction1(execute), functionSelected = js.Any.fromFunction1(functionSelected), getSubToolbarName = js.Any.fromFunction0(getSubToolbarName), initialize = js.Any.fromFunction1(initialize), opensSubToolbar = js.Any.fromFunction0(opensSubToolbar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), statusChanged = js.Any.fromFunction1(statusChanged), update = js.Any.fromFunction0(update), updateImage = js.Any.fromFunction0(updateImage))
  
    __obj.asInstanceOf[ToolbarController]
  }
}

