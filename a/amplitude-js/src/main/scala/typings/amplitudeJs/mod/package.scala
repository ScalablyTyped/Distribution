package typings.amplitudeJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* responseCode */ scala.Double, 
    /* responseBody */ java.lang.String, 
    /* details */ js.UndefOr[typings.amplitudeJs.AnonReason], 
    scala.Unit
  ]
  type LogReturn = js.UndefOr[scala.Double]
}
