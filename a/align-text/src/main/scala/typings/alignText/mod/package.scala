package typings.alignText

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function4[
    /* len */ scala.Double, 
    /* longest */ scala.Double, 
    /* line */ java.lang.String, 
    /* lines */ js.Array[java.lang.String], 
    scala.Double | typings.alignText.mod.TransformResult
  ]
}
