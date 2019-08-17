package typings.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSrcTypesPrecedenceMod {
  import typings.express.expressMod.NextFunction
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  /**
    * Must return a promise that return true or false. If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, js.Promise[Boolean]]
}
