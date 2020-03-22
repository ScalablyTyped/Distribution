package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlerMod {
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | java.lang.String | scala.Null], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ typings.awsLambda.handlerMod.Context, 
    /* callback */ typings.awsLambda.handlerMod.Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
}
