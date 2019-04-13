package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourcePathComponent extends js.Object {
  /**
    * The ID of the resource path.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  /**
    * The name of the resource path.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
}

object ResourcePathComponent {
  @scala.inline
  def apply(Id: IdType = null, Name: ResourceNameType = null): ResourcePathComponent = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[ResourcePathComponent]
  }
}

