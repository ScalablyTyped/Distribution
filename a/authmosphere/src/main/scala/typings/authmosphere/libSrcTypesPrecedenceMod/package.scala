package typings.authmosphere

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesPrecedenceMod {
  /**
    * Must return a promise that return true or false. If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, js.Promise[Boolean]]
}
