package typings.amplitudeDashJs

import typings.amplitudeDashJs.Anon_Reason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplitudeDashJsMod {
  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Anon_Reason], 
    Unit
  ]
  type LogReturn = Double | Unit
}
