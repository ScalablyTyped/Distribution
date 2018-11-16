package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcTestabilityTestabilityMod {
  type DoneCallback = js.Function2[
    /* didWork */ scala.Boolean, 
    /* tasks */ js.UndefOr[js.Array[PendingMacrotask]], 
    scala.Unit
  ]
  type UpdateCallback = js.Function1[/* tasks */ js.Array[PendingMacrotask], scala.Boolean]
}
