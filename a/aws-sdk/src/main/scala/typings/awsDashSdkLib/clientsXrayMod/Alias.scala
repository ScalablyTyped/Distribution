package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alias extends js.Object {
  /**
    * The canonical name of the alias.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * A list of names for the alias, including the canonical name.
    */
  var Names: js.UndefOr[AliasNames] = js.undefined
  /**
    * The type of the alias.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object Alias {
  @scala.inline
  def apply(Name: String = null, Names: AliasNames = null, Type: String = null): Alias = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[Alias]
  }
}

