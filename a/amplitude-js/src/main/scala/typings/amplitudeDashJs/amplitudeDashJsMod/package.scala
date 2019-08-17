package typings.amplitudeDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplitudeDashJsMod {
  import typings.amplitudeDashJs.Anon_Reason

  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Anon_Reason], 
    Unit
  ]
  type LogReturn = Double | Unit
}
