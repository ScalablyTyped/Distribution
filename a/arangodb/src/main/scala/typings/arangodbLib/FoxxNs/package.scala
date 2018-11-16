package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FoxxNs {
  type ConfigurationType = arangodbLib.arangodbLibStrings.integer | arangodbLib.arangodbLibStrings.boolean | arangodbLib.arangodbLibStrings.string | arangodbLib.arangodbLibStrings.number | arangodbLib.arangodbLibStrings.json | arangodbLib.arangodbLibStrings.password | arangodbLib.arangodbLibStrings.int | arangodbLib.arangodbLibStrings.bool
  type Handler = js.Function2[/* req */ Request, /* res */ Response, scala.Unit]
  type Middleware = SimpleMiddleware | DelegateMiddleware
  type NextFunction = js.Function0[scala.Unit]
  type Ranges = js.Array[arangodbLib.Anon_Start] with arangodbLib.Anon_Type
  type SimpleMiddleware = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, scala.Unit]
}
