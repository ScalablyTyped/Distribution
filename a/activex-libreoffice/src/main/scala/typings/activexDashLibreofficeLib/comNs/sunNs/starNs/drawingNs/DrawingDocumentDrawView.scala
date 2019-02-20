package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This component integrates a view to a {@link DrawPages} or {@link MasterPage} from a {@link DrawingDocument} . */
trait DrawingDocumentDrawView
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.Controller
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XWindow
     with activexDashLibreofficeLib.comNs.sunNs.starNs.viewNs.XFormLayerAccess
     with XDrawView
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /** If the view is in layer mode, the user can modify the layer of the model of this view in the user interface. */
  var IsLayerMode: scala.Boolean
  /** If the view is in master page mode, the view shows the master pages of this model. */
  var IsMasterPageMode: scala.Boolean
  /**
    * defines the offset from the top left position of the displayed page to the top left position of the view area in 100th/mm.
    * @since OOo 1.1.2
    */
  var ViewOffset: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point
  /** This is the area that is currently visible. */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle
  /**
    * This property defines the zoom type for the document.
    * @see com.sun.star.view.DocumentZoomType Note: After setting other types then {@link com.sun.star.view.DocumentZoomType.BY_VALUE} , implementations may
    * @since OOo 1.1.2
    */
  var ZoomType: scala.Double
  /**
    * Defines the zoom value to use. Valid only if the ZoomType is set to {@link com.sun.star.view.DocumentZoomType.BY_VALUE} .
    * @since OOo 1.1.2
    */
  var ZoomValue: scala.Double
}

