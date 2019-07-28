package typings.angularfire

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AngularFireArrayService extends js.Object {
  @JSName("$extend")
  def $extend(ChildClass: js.Object): js.Object = js.native
  @JSName("$extend")
  def $extend(ChildClass: js.Object, methods: js.Object): js.Object = js.native
  def apply(
    firebase: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Firebase */ js.Any
  ): AngularFireArray = js.native
}

