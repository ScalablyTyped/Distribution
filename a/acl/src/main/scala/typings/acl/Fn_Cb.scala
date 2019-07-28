package typings.acl

import typings.acl.aclMod.AnyCallback
import typings.acl.aclMod.strings
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Cb extends js.Object {
  def apply(roles: strings): ^[_] = js.native
  def apply(roles: strings, cb: AnyCallback): ^[_] = js.native
  def apply(roles: strings, permissions: strings): ^[_] = js.native
  def apply(roles: strings, permissions: strings, cb: AnyCallback): ^[_] = js.native
}

