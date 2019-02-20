package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a document which consists of multiple pages with drawings.
  *
  * Because its function is needed more than once, its defined as generic one.
  */
@js.native
trait GenericDrawingDocument
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs.OfficeDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XMultiServiceFactory
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with XDrawPageDuplicator
     with XDrawPagesSupplier
     with XMasterPagesSupplier
     with XLayerSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier {
  /** contains the identifier of the default locale of the document. */
  var CharLocale: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.Locale = js.native
  /** This property gives the XForbiddenCharacters. */
  var ForbiddenCharacters: activexDashLibreofficeLib.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters = js.native
  /** This property specifies the length between the default tab stops inside text in this document in 1/100th mm. */
  var TabStop: scala.Double = js.native
  /** if this document is an OLE client, this is the current visible area in 100th mm */
  var VisibleArea: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.Rectangle = js.native
}

