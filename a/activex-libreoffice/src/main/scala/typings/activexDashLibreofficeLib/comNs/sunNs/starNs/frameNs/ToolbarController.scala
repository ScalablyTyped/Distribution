package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

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
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XUpdatable
     with XToolbarController
     with XSubToolbarController

object ToolbarController {
  @scala.inline
  def apply(
    SubToolbarName: java.lang.String,
    acquire: () => scala.Unit,
    click: () => scala.Unit,
    createItemWindow: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    createPopupWindow: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    doubleClick: () => scala.Unit,
    execute: scala.Double => scala.Unit,
    functionSelected: java.lang.String => scala.Unit,
    getSubToolbarName: () => java.lang.String,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    opensSubToolbar: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    statusChanged: FeatureStateEvent => scala.Unit,
    update: () => scala.Unit,
    updateImage: () => scala.Unit
  ): ToolbarController = {
    val __obj = js.Dynamic.literal(SubToolbarName = SubToolbarName, acquire = js.Any.fromFunction0(acquire), click = js.Any.fromFunction0(click), createItemWindow = js.Any.fromFunction1(createItemWindow), createPopupWindow = js.Any.fromFunction0(createPopupWindow), disposing = js.Any.fromFunction1(disposing), doubleClick = js.Any.fromFunction0(doubleClick), execute = js.Any.fromFunction1(execute), functionSelected = js.Any.fromFunction1(functionSelected), getSubToolbarName = js.Any.fromFunction0(getSubToolbarName), initialize = js.Any.fromFunction1(initialize), opensSubToolbar = js.Any.fromFunction0(opensSubToolbar), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), statusChanged = js.Any.fromFunction1(statusChanged), update = js.Any.fromFunction0(update), updateImage = js.Any.fromFunction0(updateImage))
  
    __obj.asInstanceOf[ToolbarController]
  }
}

