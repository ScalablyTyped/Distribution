package typings.astDashTypes

import typings.astDashTypes.libTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Defaults extends js.Object {
  var defaults: Anon_EmptyArray
  var isPrimitive: Type[js.Object]
  def geq(than: js.Any): Type[js.Object]
}

object Anon_Defaults {
  @scala.inline
  def apply(defaults: Anon_EmptyArray, geq: js.Any => Type[js.Object], isPrimitive: Type[js.Object]): Anon_Defaults = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Defaults]
  }
}

