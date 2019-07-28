package typings.amplify

import typings.jquery.JQueryXHR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object amplifyMod {
  type Decoder = js.Function5[
    /* data */ js.UndefOr[js.Any], 
    /* status */ js.UndefOr[String], 
    /* xhr */ js.UndefOr[JQueryXHR], 
    /* success */ js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]], 
    /* error */ js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]], 
    Unit
  ]
}
