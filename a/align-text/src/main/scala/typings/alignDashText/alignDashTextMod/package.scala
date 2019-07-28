package typings.alignDashText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object alignDashTextMod {
  type Callback = js.Function4[
    /* len */ Double, 
    /* longest */ Double, 
    /* line */ String, 
    /* lines */ js.Array[String], 
    Double | TransformResult
  ]
}
