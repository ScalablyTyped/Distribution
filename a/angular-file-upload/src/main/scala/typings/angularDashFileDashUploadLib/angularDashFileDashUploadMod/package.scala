package typings
package angularDashFileDashUploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularDashFileDashUploadMod {
  type AsyncFilter = js.Function3[
    /* item */ stdLib.File | FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    /* deferred */ angularLib.angularMod.angularNs.IDeferred[js.Any], 
    scala.Unit
  ]
  type SyncFilter = js.Function2[
    /* item */ stdLib.File | FileLikeObject, 
    /* options */ js.UndefOr[js.Object], 
    scala.Boolean
  ]
}
