package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectIdentifierAndLinkNameTuple extends js.Object {
  /**
    * The name of the link between the parent and the child object.
    */
  var LinkName: js.UndefOr[LinkName] = js.undefined
  /**
    * The ID that is associated with the object.
    */
  var ObjectIdentifier: js.UndefOr[ObjectIdentifier] = js.undefined
}

object ObjectIdentifierAndLinkNameTuple {
  @scala.inline
  def apply(LinkName: LinkName = null, ObjectIdentifier: ObjectIdentifier = null): ObjectIdentifierAndLinkNameTuple = {
    val __obj = js.Dynamic.literal()
    if (LinkName != null) __obj.updateDynamic("LinkName")(LinkName)
    if (ObjectIdentifier != null) __obj.updateDynamic("ObjectIdentifier")(ObjectIdentifier)
    __obj.asInstanceOf[ObjectIdentifierAndLinkNameTuple]
  }
}

