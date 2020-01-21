package typings.authmosphere

import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("authmosphere/lib/src/types/Precedence", JSImport.Namespace)
@js.native
object precedenceMod extends js.Object {
  @js.native
  trait PrecedenceOptions extends js.Object {
    @JSName("precedenceFunction")
    var precedenceFunction_Original: PrecedenceFunction = js.native
    def precedenceFunction(req: Request_[ParamsDictionary], res: Response_, next: NextFunction): js.Promise[Boolean] = js.native
  }
  
  /**
    * Must return a promise that return true or false. If the result is true the scope checking will be skipped and next is called
    */
  type PrecedenceFunction = js.Function3[
    /* req */ Request_[ParamsDictionary], 
    /* res */ Response_, 
    /* next */ NextFunction, 
    js.Promise[Boolean]
  ]
}

