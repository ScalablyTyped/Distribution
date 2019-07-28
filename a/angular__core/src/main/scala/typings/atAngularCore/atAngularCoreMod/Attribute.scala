package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  /**
    * The name of the attribute whose value can be injected.
    */
  var attributeName: js.UndefOr[String] = js.undefined
}

@JSImport("@angular/core", "Attribute")
@js.native
class AttributeCls protected () extends Attribute {
  def this(name: String) = this()
}

object Attribute {
  @scala.inline
  def apply(attributeName: String = null): Attribute = {
    val __obj = js.Dynamic.literal()
    if (attributeName != null) __obj.updateDynamic("attributeName")(attributeName)
    __obj.asInstanceOf[Attribute]
  }
}

