package typings.androiduix.ukNs.coNs.senabNs.photoviewNs

import typings.androiduix.androidNs.graphicsNs.Canvas
import typings.androiduix.androidNs.graphicsNs.Matrix
import typings.androiduix.androidNs.graphicsNs.RectF
import typings.androiduix.androidNs.viewNs.GestureDetectorNs.OnDoubleTapListener
import typings.androiduix.androidNs.viewNs.ViewNs.OnLongClickListener
import typings.androiduix.androidNs.widgetNs.ImageViewNs.ScaleType
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnMatrixChangedListener
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnPhotoTapListener
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnScaleChangeListener
import typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs.OnViewTapListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPhotoView extends js.Object {
  def canZoom(): Boolean = js.native
  def getDisplayMatrix(): Matrix = js.native
  def getDisplayRect(): RectF = js.native
  def getIPhotoViewImplementation(): IPhotoView = js.native
  def getMaxScale(): Double = js.native
  def getMaximumScale(): Double = js.native
  def getMediumScale(): Double = js.native
  def getMidScale(): Double = js.native
  def getMinScale(): Double = js.native
  def getMinimumScale(): Double = js.native
  def getOnPhotoTapListener(): OnPhotoTapListener = js.native
  def getOnViewTapListener(): OnViewTapListener = js.native
  def getScale(): Double = js.native
  def getScaleType(): ScaleType = js.native
  def getVisibleRectangleBitmap(): Canvas = js.native
  def setAllowParentInterceptOnEdge(allow: Boolean): Unit = js.native
  def setDisplayMatrix(finalMatrix: Matrix): Boolean = js.native
  def setMaxScale(maxScale: Double): Unit = js.native
  def setMaximumScale(maximumScale: Double): Unit = js.native
  def setMediumScale(mediumScale: Double): Unit = js.native
  def setMidScale(midScale: Double): Unit = js.native
  def setMinScale(minScale: Double): Unit = js.native
  def setMinimumScale(minimumScale: Double): Unit = js.native
  def setOnDoubleTapListener(newOnDoubleTapListener: OnDoubleTapListener): Unit = js.native
  def setOnLongClickListener(listener: OnLongClickListener): Unit = js.native
  def setOnMatrixChangeListener(listener: OnMatrixChangedListener): Unit = js.native
  def setOnPhotoTapListener(listener: OnPhotoTapListener): Unit = js.native
  def setOnScaleChangeListener(onScaleChangeListener: OnScaleChangeListener): Unit = js.native
  def setOnViewTapListener(listener: OnViewTapListener): Unit = js.native
  def setPhotoViewRotation(rotationDegree: Double): Unit = js.native
  def setRotationBy(rotationDegree: Double): Unit = js.native
  def setRotationTo(rotationDegree: Double): Unit = js.native
  def setScale(scale: Double): Unit = js.native
  def setScale(scale: Double, animate: Boolean): Unit = js.native
  def setScale(scale: Double, focalX: Double, focalY: Double, animate: Boolean): Unit = js.native
  def setScaleLevels(minimumScale: Double, mediumScale: Double, maximumScale: Double): Unit = js.native
  def setScaleType(scaleType: ScaleType): Unit = js.native
  def setZoomTransitionDuration(milliseconds: Double): Unit = js.native
  def setZoomable(zoomable: Boolean): Unit = js.native
}

