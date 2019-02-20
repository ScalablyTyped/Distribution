package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object drawingNs {
  /**
    * this service provides the properties to describe a background filling for a drawing page. It can be obtained by the {@link
    * com.sun.star.lang.XMultiServiceFactory} of a document and be set on draw pages that support a filled background.
    */
  type Background = FillProperties
  /**
    * this is a container for URLs to bitmaps.
    *
    * It is used for example to access the bitmaps that are used inside a document for filling.
    * @see DrawingDocumentFactory
    * @see FillStyle.FillBitmapURL
    */
  type BitmapTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** @since LibreOffice 4.1 */
  type ColorTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  type CoordinateSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  type CoordinateSequenceSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[CoordinateSequence]
  /**
    * this is a container for LineDashs
    *
    * It is used for example to access the LineDashs that are used inside a document.
    * @see DrawingDocumentFactory
    * @see LineDash
    */
  type DashTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  type DoubleSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  type DoubleSequenceSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[DoubleSequence]
  /** specifies a document which consists of multiple pages with drawings. */
  type DrawingDocument = GenericDrawingDocument
  /** @deprecated DeprecatedPleas use the factory interface of the service GenericDrawingDocument. */
  type DrawingDocumentFactory = activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
  type FlagSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PolygonFlags]
  type FlagSequenceSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[FlagSequence]
  /**
    * this is a container for com::sun::star::awt::Gradients
    *
    * It is used for example to access the com::sun::star::awt::Gradients that are used inside a document.
    * @see DrawingDocumentFactory
    * @see com.sun.star.awt.Gradient
    */
  type GradientTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * a component that supports this service lets you export pages, shapes, or groups of shapes from a {@link DrawingDocument} to a file in one of the file
    * formats supported by the component.
    */
  type GraphicExportFilter = XGraphicExportFilter
  /**
    * this is a container for Hatchs
    *
    * It is used for example to access the Hatchs that are used inside a document.
    * @see DrawingDocumentFactory
    * @see Hatch
    */
  type HatchTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * this is a container for PointSequences
    *
    * It is used for example to access the line ends that are used inside a document.
    * @see DrawingDocumentFactory
    * @see PointSequence
    */
  type MarkerTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /**
    * This service is a single master page inside a drawing document.
    *
    * It serves as a background page for zero or more {@link DrawPages} . Since this service is derived from the service {@link GenericDrawPage} , it can be
    * used as a draw page with three differences:
    *
    *  1. It is not linked to any other {@link MasterPage} . 2. It cannot be removed from a document as long as one or more instances of {@link DrawPage}
    * are linked to it. 3. Modifications to a {@link MasterPage} are instantly visible on every {@link DrawPage} that is linked to it.
    */
  type MasterPage = GenericDrawPage
  /**
    * provides access to a container of {@link MasterPages} and makes it possible for them to be manipulated.
    * @see XMasterPagesSupplier
    * @see DrawingDocument
    */
  type MasterPages = XDrawPages
  /** @since LibreOffice 4.1 */
  type ModuleDispatcher = activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XDispatchProvider
  type PointSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Point]
  type PointSequenceSequence = activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[PointSequence]
  /**
    * This service describes a generic container to manage collections of {@link Shape} . The {@link Shape} that are added to this collection are not owned
    * by the collection.
    *
    * This service is used by the view f.e. to return a collection of {@link Shape} that are selected at the ui.
    */
  type ShapeCollection = XShapes
  /** This service is for a generic collection of shapes. */
  type Shapes = XShapes
  /**
    * this is a container for com::sun::star::awt::Gradients
    *
    * It is used for example to access the com::sun::star::awt::Gradients that are used inside a document for fill transparency.
    * @see DrawingDocumentFactory
    * @see com.sun.star.awt.Gradient
    */
  type TransparencyGradientTable = activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** identifies an {@link XShapes} as a {@link DrawPage} . */
  type XDrawPage = XShapes
  /** identifies the object as a {@link Layer} . */
  type XLayer = activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}
