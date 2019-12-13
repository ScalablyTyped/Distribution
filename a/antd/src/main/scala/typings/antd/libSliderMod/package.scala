package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSliderMod {
  import org.scalablytyped.runtime.NumberDictionary
  import typings.antd.Anon_Info
  import typings.antd.Anon_Label
  import typings.react.reactMod.ReactNode

  type HandleGeneratorFn = js.Function1[/* config */ Anon_Info, ReactNode]
  type SliderMarks = NumberDictionary[ReactNode | Anon_Label]
  type SliderValue = Double | (js.Tuple2[Double, Double])
}
