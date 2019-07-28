package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Denied extends js.Object {
  /**
    * Information that explicitly denies the authorization. 
    */
  var explicitDeny: js.UndefOr[ExplicitDeny] = js.undefined
  /**
    * Information that implicitly denies the authorization. When a policy doesn't explicitly deny or allow an action on a resource it is considered an implicit deny.
    */
  var implicitDeny: js.UndefOr[ImplicitDeny] = js.undefined
}

object Denied {
  @scala.inline
  def apply(explicitDeny: ExplicitDeny = null, implicitDeny: ImplicitDeny = null): Denied = {
    val __obj = js.Dynamic.literal()
    if (explicitDeny != null) __obj.updateDynamic("explicitDeny")(explicitDeny)
    if (implicitDeny != null) __obj.updateDynamic("implicitDeny")(implicitDeny)
    __obj.asInstanceOf[Denied]
  }
}

