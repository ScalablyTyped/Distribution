package typings
package androiduixLib.androiduiNs.nativeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.native.NativeImage")
@js.native
class NativeImage ()
  extends androiduixLib.androiduiNs.imageNs.NetImage {
  var bottomBorder: js.Array[scala.Double] = js.native
  var getPixelsCallbacks: js.Any = js.native
  var imageId: scala.Double = js.native
  var leftBorder: js.Array[scala.Double] = js.native
  var rightBorder: js.Array[scala.Double] = js.native
  var topBorder: js.Array[scala.Double] = js.native
}

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

