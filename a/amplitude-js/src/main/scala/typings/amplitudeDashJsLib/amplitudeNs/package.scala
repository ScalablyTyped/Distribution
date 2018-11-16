package typings
package amplitudeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplitudeNs {
  type Callback = js.Function3[
    /* responseCode */ scala.Double, 
    /* responseBody */ java.lang.String, 
    /* details */ js.UndefOr[amplitudeDashJsLib.Anon_Reason], 
    scala.Unit
  ]
  type LogReturn = scala.Double | scala.Unit
}
