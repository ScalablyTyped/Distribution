package typings.activexLibreoffice.com_.sun.star.presentation

import typings.activexLibreoffice.com_.sun.star.document.XLinkTargetSupplier
import typings.activexLibreoffice.com_.sun.star.drawing.GenericDrawingDocument
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

