package typings.alex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * This is either an array of words to ignore or custom Alex' config
    */
  type Config = typings.alex.mod.AlexOptions | js.Array[java.lang.String]
}
