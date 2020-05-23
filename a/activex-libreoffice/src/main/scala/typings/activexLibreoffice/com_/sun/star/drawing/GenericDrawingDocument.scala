package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.awt.Rectangle
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.document.OfficeDocument
import typings.activexLibreoffice.com_.sun.star.i18n.XForbiddenCharacters
import typings.activexLibreoffice.com_.sun.star.lang.Locale
import typings.activexLibreoffice.com_.sun.star.lang.XMultiServiceFactory
import typings.activexLibreoffice.com_.sun.star.style.XStyleFamiliesSupplier
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

