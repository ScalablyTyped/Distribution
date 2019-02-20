package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Constants extends js.Object

@JSGlobal("com.sun.star.gallery.GalleryItemType.Constants")
@js.native
object Constants extends js.Object {
  @js.native
  sealed trait DRAWING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs.Constants
  
  @js.native
  sealed trait EMPTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs.Constants
  
  @js.native
  sealed trait GRAPHIC
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs.Constants
  
  @js.native
  sealed trait MEDIA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs.Constants
  
  /* 3 */ val DRAWING: DRAWING with scala.Double = js.native
  /* 0 */ val EMPTY: EMPTY with scala.Double = js.native
  /* 1 */ val GRAPHIC: GRAPHIC with scala.Double = js.native
  /* 2 */ val MEDIA: MEDIA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.galleryNs.GalleryItemTypeNs.Constants with scala.Double
  ] = js.native
}

