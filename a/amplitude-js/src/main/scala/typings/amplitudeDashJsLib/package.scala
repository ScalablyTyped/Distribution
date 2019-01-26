package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplitudeDashJsLib {
  type Callback = js.Function3[
    /* responseCode */ scala.Double, 
    /* responseBody */ java.lang.String, 
    /* details */ js.UndefOr[Anon_Reason], 
    scala.Unit
  ]
  type LogReturn = scala.Double | scala.Unit
}
