package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularfireLib {
  type AngularFireAuthService = js.Function1[/* firebase */ js.Any, AngularFireAuth]
  type AngularFireService = js.Function2[/* firebase */ js.Any, /* config */ js.UndefOr[js.Any], AngularFire]
}
