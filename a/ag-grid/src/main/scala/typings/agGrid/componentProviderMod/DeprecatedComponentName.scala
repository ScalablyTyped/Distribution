package typings.agGrid.componentProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecatedComponentName extends js.Object {
  var newComponentName: String
  var propertyHolder: String
}

object DeprecatedComponentName {
  @scala.inline
  def apply(newComponentName: String, propertyHolder: String): DeprecatedComponentName = {
    val __obj = js.Dynamic.literal(newComponentName = newComponentName.asInstanceOf[js.Any], propertyHolder = propertyHolder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeprecatedComponentName]
  }
}

