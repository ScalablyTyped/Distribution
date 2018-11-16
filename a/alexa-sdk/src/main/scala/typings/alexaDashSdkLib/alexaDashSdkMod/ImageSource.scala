package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ImageSource extends js.Object {
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  /**
       * Recommended sizes for the following dimensions (in px):
       * 480 x 320 for X_SMALL,
       * 720 x 480 for SMALL,
       * 960 x 640 for MEDIUM,
       * 1200 x 800 for LARGE,
       * 1920 x 1280 for X_LARGE
       */
  var size: js.UndefOr[ImageSourceSize] = js.undefined
  var url: java.lang.String
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

