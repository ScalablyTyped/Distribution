package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alias extends js.Object {
  /**
    * The canonical name of the alias.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * A list of names for the alias, including the canonical name.
    */
  var Names: js.UndefOr[AliasNames] = js.native
  /**
    * The type of the alias.
    */
  var Type: js.UndefOr[String] = js.native
}

object Alias {
  @scala.inline
  def apply(Name: String = null, Names: AliasNames = null, Type: String = null): Alias = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Names != null) __obj.updateDynamic("Names")(Names.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alias]
  }
}

