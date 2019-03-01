package typings
package antdLib.libSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderState extends js.Object {
  var visibles: org.scalablytyped.runtime.NumberDictionary[scala.Boolean]
}

object SliderState {
  @scala.inline
  def apply(visibles: org.scalablytyped.runtime.NumberDictionary[scala.Boolean]): SliderState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("visibles")(visibles)
    __obj.asInstanceOf[SliderState]
  }
}

