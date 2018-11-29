package typings
package appDashBuilderDashLibLib.outOptionsPkgOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PkgBackgroundOptions extends js.Object {
  /**
       * Alignment of the background image.
       * Options are: center, left, right, top, bottom, topleft, topright, bottomleft, bottomright
       * @default center
       */
  var alignment: js.UndefOr[BackgroundAlignment | scala.Null] = js.undefined
  /**
       * Path to the image to use as an installer background.
       */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Scaling of the background image.
       * Options are: tofit, none, proportional
       * @default tofit
       */
  var scaling: js.UndefOr[BackgroundScaling | scala.Null] = js.undefined
}

