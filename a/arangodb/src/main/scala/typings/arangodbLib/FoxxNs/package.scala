package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FoxxNs {
  type Handler = js.Function2[/* req */ Request, /* res */ Response, scala.Unit]
  type Middleware = SimpleMiddleware | DelegateMiddleware
  type NextFunction = js.Function0[scala.Unit]
  type Ranges = js.Array[arangodbLib.Anon_End] with arangodbLib.Anon_Type
  type SimpleMiddleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, scala.Unit]
}
