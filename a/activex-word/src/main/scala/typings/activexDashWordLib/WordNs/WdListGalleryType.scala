package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdListGalleryType extends js.Object

@JSGlobal("Word.WdListGalleryType")
@js.native
object WdListGalleryType extends js.Object {
  @js.native
  sealed trait wdBulletGallery
    extends activexDashWordLib.WordNs.WdListGalleryType
  
  @js.native
  sealed trait wdNumberGallery
    extends activexDashWordLib.WordNs.WdListGalleryType
  
  @js.native
  sealed trait wdOutlineNumberGallery
    extends activexDashWordLib.WordNs.WdListGalleryType
  
  /* 1 */ val wdBulletGallery: wdBulletGallery with scala.Double = js.native
  /* 2 */ val wdNumberGallery: wdNumberGallery with scala.Double = js.native
  /* 3 */ val wdOutlineNumberGallery: wdOutlineNumberGallery with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdListGalleryType with scala.Double] = js.native
}

