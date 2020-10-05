package typings.angularRouter.mod

import typings.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanLoad extends js.Object {
  def canLoad(route: Route, segments: js.Array[UrlSegment]): (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree = js.native
}

object CanLoad {
  @scala.inline
  def apply(
    canLoad: (Route, js.Array[UrlSegment]) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
  ): CanLoad = {
    val __obj = js.Dynamic.literal(canLoad = js.Any.fromFunction2(canLoad))
    __obj.asInstanceOf[CanLoad]
  }
  @scala.inline
  implicit class CanLoadOps[Self <: CanLoad] (val x: Self) extends AnyVal {
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
    def setCanLoad(
      value: (Route, js.Array[UrlSegment]) => (Observable_[Boolean | UrlTree]) | (js.Promise[Boolean | UrlTree]) | Boolean | UrlTree
    ): Self = this.set("canLoad", js.Any.fromFunction2(value))
  }
  
}

