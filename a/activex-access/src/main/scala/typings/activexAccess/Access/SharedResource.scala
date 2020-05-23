package typings.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedResource extends js.Object {
  @JSName("Access.SharedResource_typekey")
  var AccessDotSharedResource_typekey: SharedResource
  var Name: String
  val Parent: js.Any
  val Type: AcResourceType
  def Delete(): Unit
  def IsMemberSafe(dispid: Double): Boolean
}

object SharedResource {
  @scala.inline
  def apply(
    AccessDotSharedResource_typekey: SharedResource,
    Delete: () => Unit,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Parent: js.Any,
    Type: AcResourceType
  ): SharedResource = {
    val __obj = js.Dynamic.literal(Delete = js.Any.fromFunction0(Delete), IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.SharedResource_typekey")(AccessDotSharedResource_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedResource]
  }
}

