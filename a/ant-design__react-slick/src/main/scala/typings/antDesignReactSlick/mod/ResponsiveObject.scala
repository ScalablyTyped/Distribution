package typings.antDesignReactSlick.mod

import typings.antDesignReactSlick.antDesignReactSlickStrings.unslick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsiveObject extends js.Object {
  var breakpoint: Double
  var settings: unslick | Settings
}

object ResponsiveObject {
  @scala.inline
  def apply(breakpoint: Double, settings: unslick | Settings): ResponsiveObject = {
    val __obj = js.Dynamic.literal(breakpoint = breakpoint.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsiveObject]
  }
}

