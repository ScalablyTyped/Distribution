package typings.authmosphere

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/Precedence", JSImport.Namespace)
@js.native
object libSrcTypesPrecedenceMod extends js.Object {
  @js.native
  trait PrecedenceOptions extends js.Object {
    @JSName("precedenceFunction")
    var precedenceFunction_Original: PrecedenceFunction = js.native
    def precedenceFunction(req: Request[ParamsDictionary], res: Response, next: NextFunction): js.Promise[Boolean] = js.native
  }
  
  /**
    * Must return a promise that return true or false. If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[
    /* req */ Request[ParamsDictionary], 
    /* res */ Response, 
    /* next */ NextFunction, 
    js.Promise[Boolean]
  ]
}

