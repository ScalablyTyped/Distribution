package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTransport extends js.Object {
  var clear: js.UndefOr[js.Function1[/* res */ Response, scala.Unit]] = js.undefined
  var get: js.UndefOr[js.Function1[/* req */ Request, java.lang.String | scala.Null]] = js.undefined
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ java.lang.String, scala.Unit]] = js.undefined
}

