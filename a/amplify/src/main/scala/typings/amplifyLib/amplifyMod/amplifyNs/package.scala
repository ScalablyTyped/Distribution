package typings
package amplifyLib.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplifyNs {
  type Decoder = js.Function5[
    /* data */ js.UndefOr[js.Any], 
    /* status */ js.UndefOr[java.lang.String], 
    /* xhr */ js.UndefOr[jqueryLib.JQueryXHR], 
    /* success */ js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]], 
    /* error */ js.UndefOr[js.Function1[/* repeated */js.Any, scala.Unit]], 
    scala.Unit
  ]
}
