package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements a component which allows the creation of relation.
  *
  * This service implements a user interface for relations through a graphical design interface.
  *
  * The design view of the {@link RelationDesign} is identical to the first part of
  * @see QueryDesign. It contains all tables which are already connected through a relation.
  * @see com.sun.star.sdb.ContentLoader
  * @see com.sun.star.frame.XDispatch
  * @see com.sun.star.frame.XDispatchProviderInterceptor
  * @since OOo 1.1.2
  */
trait RelationDesign
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object RelationDesign {
  @scala.inline
  def apply(
    Frame: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame,
    Model: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel,
    ViewData: js.Any,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attachFrame: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame, scala.Unit],
    attachModel: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel, scala.Boolean],
    dispose: js.Function0[scala.Unit],
    getFrame: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XFrame],
    getModel: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XModel],
    getViewData: js.Function0[js.Any],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    restoreViewData: js.Function1[js.Any, scala.Unit],
    suspend: js.Function1[scala.Boolean, scala.Boolean]
  ): RelationDesign = {
    val __obj = js.Dynamic.literal(Frame = Frame, Model = Model, ViewData = ViewData, acquire = acquire, addEventListener = addEventListener, attachFrame = attachFrame, attachModel = attachModel, dispose = dispose, getFrame = getFrame, getModel = getModel, getViewData = getViewData, initialize = initialize, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, restoreViewData = restoreViewData, suspend = suspend)
  
    __obj.asInstanceOf[RelationDesign]
  }
}

