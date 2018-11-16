package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoView")
@js.native
class PhotoView protected ()
  extends androiduixLib.androidNs.widgetNs.ImageView
     with IPhotoView {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, bindElement: stdLib.HTMLElement, defStyle: stdLib.Map[java.lang.String, java.lang.String]) = this()
  var mAttacher: js.Any = js.native
  var mPendingScaleType: js.Any = js.native
  /* InferMemberOverrides */
  override def getScaleType(): androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType = js.native
  /* protected */ def init(): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: androiduixLib.androidNs.viewNs.ViewNs.OnLongClickListener): scala.Unit = js.native
  def setScale(scale: scala.Double, focalX: scala.Double, focalY: scala.Double): scala.Unit = js.native
  /* InferMemberOverrides */
  override def setScaleType(scaleType: androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType): scala.Unit = js.native
}

