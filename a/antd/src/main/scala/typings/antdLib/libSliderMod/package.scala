package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSliderMod {
  type HandleGeneratorFn = js.Function2[
    /* tooltipPrefixCls */ java.lang.String, 
    /* info */ HandleGeneratorInfo, 
    reactLib.reactMod.ReactNs.ReactElement[js.Any]
  ]
  type SliderValue = scala.Double | (js.Tuple2[scala.Double, scala.Double])
}
