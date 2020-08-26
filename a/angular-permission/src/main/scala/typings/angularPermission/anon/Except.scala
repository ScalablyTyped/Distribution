package typings.angularPermission.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angular.mod.IPromise
import typings.angularPermission.mod.permission.PermissionRedirectConfigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Except extends js.Object {
  var except: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
  var only: js.UndefOr[js.Function0[Unit] | String | js.Array[String] | IPromise[_]] = js.native
  var redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation] = js.native
}

object Except {
  @scala.inline
  def apply(
    redirectTo: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
  ): Except = {
    val __obj = js.Dynamic.literal(redirectTo = redirectTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Except]
  }
  @scala.inline
  implicit class ExceptOps[Self <: Except] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRedirectToFunction0(value: () => PermissionRedirectConfigation | String): Self = this.set("redirectTo", js.Any.fromFunction0(value))
    @scala.inline
    def setRedirectTo(
      value: String | (js.Function0[PermissionRedirectConfigation | String]) | StringDictionary[PermissionRedirectConfigation]
    ): Self = this.set("redirectTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptVarargs(value: String*): Self = this.set("except", js.Array(value :_*))
    @scala.inline
    def setExceptFunction0(value: () => Unit): Self = this.set("except", js.Any.fromFunction0(value))
    @scala.inline
    def setExcept(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = this.set("except", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
    @scala.inline
    def setOnlyVarargs(value: String*): Self = this.set("only", js.Array(value :_*))
    @scala.inline
    def setOnlyFunction0(value: () => Unit): Self = this.set("only", js.Any.fromFunction0(value))
    @scala.inline
    def setOnly(value: js.Function0[Unit] | String | js.Array[String] | IPromise[_]): Self = this.set("only", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnly: Self = this.set("only", js.undefined)
  }
  
}

