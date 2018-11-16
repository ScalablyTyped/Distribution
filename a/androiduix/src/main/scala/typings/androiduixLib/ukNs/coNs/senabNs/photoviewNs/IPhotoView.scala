package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhotoView extends js.Object {
  def canZoom(): scala.Boolean = js.native
  def getDisplayMatrix(): androiduixLib.androidNs.graphicsNs.Matrix = js.native
  def getDisplayRect(): androiduixLib.androidNs.graphicsNs.RectF = js.native
  def getIPhotoViewImplementation(): IPhotoView = js.native
  def getMaxScale(): scala.Double = js.native
  def getMaximumScale(): scala.Double = js.native
  def getMediumScale(): scala.Double = js.native
  def getMidScale(): scala.Double = js.native
  def getMinScale(): scala.Double = js.native
  def getMinimumScale(): scala.Double = js.native
  def getOnPhotoTapListener(): androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnPhotoTapListener = js.native
  def getOnViewTapListener(): androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnViewTapListener = js.native
  def getScale(): scala.Double = js.native
  def getScaleType(): androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType = js.native
  def getVisibleRectangleBitmap(): androiduixLib.androidNs.graphicsNs.Canvas = js.native
  def setAllowParentInterceptOnEdge(allow: scala.Boolean): scala.Unit = js.native
  def setDisplayMatrix(finalMatrix: androiduixLib.androidNs.graphicsNs.Matrix): scala.Boolean = js.native
  def setMaxScale(maxScale: scala.Double): scala.Unit = js.native
  def setMaximumScale(maximumScale: scala.Double): scala.Unit = js.native
  def setMediumScale(mediumScale: scala.Double): scala.Unit = js.native
  def setMidScale(midScale: scala.Double): scala.Unit = js.native
  def setMinScale(minScale: scala.Double): scala.Unit = js.native
  def setMinimumScale(minimumScale: scala.Double): scala.Unit = js.native
  def setOnDoubleTapListener(newOnDoubleTapListener: androiduixLib.androidNs.viewNs.GestureDetectorNs.OnDoubleTapListener): scala.Unit = js.native
  def setOnLongClickListener(listener: androiduixLib.androidNs.viewNs.ViewNs.OnLongClickListener): scala.Unit = js.native
  def setOnMatrixChangeListener(listener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnMatrixChangedListener): scala.Unit = js.native
  def setOnPhotoTapListener(listener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnPhotoTapListener): scala.Unit = js.native
  def setOnScaleChangeListener(
    onScaleChangeListener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnScaleChangeListener
  ): scala.Unit = js.native
  def setOnViewTapListener(listener: androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnViewTapListener): scala.Unit = js.native
  def setPhotoViewRotation(rotationDegree: scala.Double): scala.Unit = js.native
  def setRotationBy(rotationDegree: scala.Double): scala.Unit = js.native
  def setRotationTo(rotationDegree: scala.Double): scala.Unit = js.native
  def setScale(scale: scala.Double): scala.Unit = js.native
  def setScale(scale: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def setScale(scale: scala.Double, focalX: scala.Double, focalY: scala.Double, animate: scala.Boolean): scala.Unit = js.native
  def setScaleLevels(minimumScale: scala.Double, mediumScale: scala.Double, maximumScale: scala.Double): scala.Unit = js.native
  def setScaleType(scaleType: androiduixLib.androidNs.widgetNs.ImageViewNs.ScaleType): scala.Unit = js.native
  def setZoomTransitionDuration(milliseconds: scala.Double): scala.Unit = js.native
  def setZoomable(zoomable: scala.Boolean): scala.Unit = js.native
}

