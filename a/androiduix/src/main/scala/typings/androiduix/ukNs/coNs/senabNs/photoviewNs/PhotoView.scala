package typings.androiduix.ukNs.coNs.senabNs.photoviewNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.viewNs.ViewNs.OnLongClickListener
import typings.androiduix.androidNs.widgetNs.ImageView
import typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("uk.co.senab.photoview.PhotoView")
@js.native
class PhotoView protected ()
  extends ImageView
     with IPhotoView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var mAttacher: js.Any = js.native
  var mPendingScaleType: js.Any = js.native
  /* InferMemberOverrides */
  override def getScaleType(): ScaleType = js.native
  /* protected */ def init(): Unit = js.native
  /* InferMemberOverrides */
  override def setOnLongClickListener(l: OnLongClickListener): Unit = js.native
  def setScale(scale: Double, focalX: Double, focalY: Double): Unit = js.native
  /* InferMemberOverrides */
  override def setScaleType(scaleType: ScaleType): Unit = js.native
}

