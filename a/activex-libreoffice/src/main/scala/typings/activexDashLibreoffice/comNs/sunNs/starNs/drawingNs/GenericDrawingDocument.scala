package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs.Rectangle
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.OfficeDocument
import typings.activexDashLibreoffice.comNs.sunNs.starNs.i18nNs.XForbiddenCharacters
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.Locale
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XMultiServiceFactory
import typings.activexDashLibreoffice.comNs.sunNs.starNs.styleNs.XStyleFamiliesSupplier
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
  extends OfficeDocument
     with XMultiServiceFactory
     with XPropertySet
     with XDrawPageDuplicator
     with XDrawPagesSupplier
     with XMasterPagesSupplier
     with XLayerSupplier
     with XStyleFamiliesSupplier {
  /** contains the identifier of the default locale of the document. */
  var CharLocale: Locale = js.native
  /** This property gives the XForbiddenCharacters. */
  var ForbiddenCharacters: XForbiddenCharacters = js.native
  /** This property specifies the length between the default tab stops inside text in this document in 1/100th mm. */
  var TabStop: Double = js.native
  /** if this document is an OLE client, this is the current visible area in 100th mm */
  var VisibleArea: Rectangle = js.native
}

