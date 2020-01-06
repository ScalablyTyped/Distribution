package typings.awsDashSdk.clientsWorkmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delegate extends js.Object {
  /**
    * The identifier for the user or group associated as the resource's delegate.
    */
  var Id: String = js.native
  /**
    * The type of the delegate: user or group.
    */
  var Type: MemberType = js.native
}

object Delegate {
  @scala.inline
  def apply(Id: String, Type: MemberType): Delegate = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delegate]
  }
}

