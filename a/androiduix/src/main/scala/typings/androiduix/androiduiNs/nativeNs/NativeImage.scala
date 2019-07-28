package typings.androiduix.androiduiNs.nativeNs

import typings.androiduix.androiduiNs.imageNs.NetImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeImage")
@js.native
class NativeImage () extends NetImage {
  var bottomBorder: js.Array[Double] = js.native
  var getPixelsCallbacks: js.Any = js.native
  var imageId: Double = js.native
  var leftBorder: js.Array[Double] = js.native
  var rightBorder: js.Array[Double] = js.native
  var topBorder: js.Array[Double] = js.native
}

/* static members */
@JSGlobal("androidui.native.NativeImage")
@js.native
object NativeImage extends js.Object {
  /* private */ def notifyGetPixels(imageId: js.Any, callBackIndex: js.Any, data: js.Any): js.Any = js.native
  /* private */ def notifyLoadError(imageId: js.Any): js.Any = js.native
  /* private */ def notifyLoadFinish(
    imageId: js.Any,
    width: js.Any,
    height: js.Any,
    leftBorder: js.Any,
    topBorder: js.Any,
    rightBorder: js.Any,
    bottomBorder: js.Any
  ): js.Any = js.native
}

