package typings.aframe.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultComponents extends js.Object {
  var defaultComponents: Material
  var mappings: StringDictionary[js.Any]
}

object DefaultComponents {
  @scala.inline
  def apply(defaultComponents: Material, mappings: StringDictionary[js.Any]): DefaultComponents = {
    val __obj = js.Dynamic.literal(defaultComponents = defaultComponents.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultComponents]
  }
}

