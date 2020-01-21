package typings.aframe

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultComponents extends js.Object {
  var defaultComponents: AnonMaterial
  var mappings: StringDictionary[js.Any]
}

object AnonDefaultComponents {
  @scala.inline
  def apply(defaultComponents: AnonMaterial, mappings: StringDictionary[js.Any]): AnonDefaultComponents = {
    val __obj = js.Dynamic.literal(defaultComponents = defaultComponents.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultComponents]
  }
}

