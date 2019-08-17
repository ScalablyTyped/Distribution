package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FoxxNs {
  import typings.arangodb.Anon_End
  import typings.arangodb.Anon_Type

  type Handler = js.Function2[/* req */ Request, /* res */ Response, Unit]
  type Middleware = SimpleMiddleware | DelegateMiddleware
  type NextFunction = js.Function0[Unit]
  type Ranges = js.Array[Anon_End] with Anon_Type
  type SimpleMiddleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit]
}
