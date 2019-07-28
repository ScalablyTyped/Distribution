package typings.activexDashLibreoffice.comNs.sunNs.starNs.presentationNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs.XLinkTargetSupplier
import typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs.GenericDrawingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is the service provided by a presentation document. */
@js.native
trait PresentationDocument
  extends GenericDrawingDocument
     with XPresentationSupplier
     with XCustomPresentationSupplier
     with XLinkTargetSupplier

