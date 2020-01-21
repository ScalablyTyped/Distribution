package typings.antd.sliderMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderState extends js.Object {
  var visibles: NumberDictionary[Boolean]
}

object SliderState {
  @scala.inline
  def apply(visibles: NumberDictionary[Boolean]): SliderState = {
    val __obj = js.Dynamic.literal(visibles = visibles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SliderState]
  }
}

