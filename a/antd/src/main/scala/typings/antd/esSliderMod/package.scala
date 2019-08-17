package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esSliderMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.antd.Anon_Label
  import typings.react.reactMod.ReactNode

  type HandleGeneratorFn = js.Function2[/* tooltipPrefixCls */ String, /* info */ HandleGeneratorInfo, ReactNode]
  type SliderMarks = NumberDictionary[ReactNode | Anon_Label]
  type SliderValue = Double | (js.Tuple2[Double, Double])
}
