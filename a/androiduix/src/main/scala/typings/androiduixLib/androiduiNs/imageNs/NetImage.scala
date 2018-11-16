package typings
package androiduixLib.androiduiNs.imageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.image.NetImage")
@js.native
class NetImage protected () extends js.Object {
  def this(src: java.lang.String) = this()
  def this(src: java.lang.String, overrideImageRatio: scala.Double) = this()
  var browserImage: js.Any = js.native
  val height: scala.Double = js.native
  var mImageHeight: js.Any = js.native
  var mImageLoaded: js.Any = js.native
  var mImageWidth: js.Any = js.native
  var mOnErrors: js.Any = js.native
  var mOnLoads: js.Any = js.native
  var mOverrideImageRatio: js.Any = js.native
  var mSrc: js.Any = js.native
  var src: java.lang.String = js.native
  val width: scala.Double = js.native
  def addLoadListener(onload: js.Function0[scala.Unit]): scala.Unit = js.native
  def addLoadListener(onload: js.Function0[scala.Unit], onerror: js.Function0[scala.Unit]): scala.Unit = js.native
  /* protected */ def createImage(): scala.Unit = js.native
  /* private */ def fireOnError(): js.Any = js.native
  /* private */ def fireOnLoad(): js.Any = js.native
  def getBorderPixels(
    callBack: js.Function4[
      /* leftBorder */ js.Array[scala.Double], 
      /* topBorder */ js.Array[scala.Double], 
      /* rightBorder */ js.Array[scala.Double], 
      /* bottomBorder */ js.Array[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getImageRatio(): scala.Double = js.native
  def getPixels(
    bound: androiduixLib.androidNs.graphicsNs.Rect,
    callBack: js.Function1[/* data */ js.Array[scala.Double], scala.Unit]
  ): scala.Unit = js.native
  /* protected */ def init(src: java.lang.String): scala.Unit = js.native
  def isImageLoaded(): scala.Boolean = js.native
  /* protected */ def loadImage(): scala.Unit = js.native
  def recycle(): scala.Unit = js.native
  def removeLoadListener(): scala.Unit = js.native
  def removeLoadListener(onload: js.Function0[scala.Unit]): scala.Unit = js.native
  def removeLoadListener(onload: js.Function0[scala.Unit], onerror: js.Function0[scala.Unit]): scala.Unit = js.native
}

