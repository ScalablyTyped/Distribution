package typings.angularDashFileDashUpload

import typings.angular.angularMod.IDeferred
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashFileDashUploadMod {
  type AsyncFilter = js.Function3[
    /* item */ File | FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ IDeferred[js.Any], 
    Unit
  ]
  type SyncFilter = js.Function2[/* item */ File | FileLikeObject, /* options */ js.UndefOr[js.Object], Boolean]
}
