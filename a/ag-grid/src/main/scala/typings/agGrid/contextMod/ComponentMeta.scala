package typings.agGrid.contextMod

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentMeta extends js.Object {
  var componentName: String
  var theClass: Instantiable0[js.Object]
}

object ComponentMeta {
  @scala.inline
  def apply(componentName: String, theClass: Instantiable0[js.Object]): ComponentMeta = {
    val __obj = js.Dynamic.literal(componentName = componentName.asInstanceOf[js.Any], theClass = theClass.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ComponentMeta]
  }
}

