package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object appsyncResolverMod {
  
  type AppSyncResolverHandler[T, V] = typings.awsLambda.handlerMod.Handler[typings.awsLambda.appsyncResolverMod.AppSyncResolverEvent[T], V | js.Array[V]]
}
