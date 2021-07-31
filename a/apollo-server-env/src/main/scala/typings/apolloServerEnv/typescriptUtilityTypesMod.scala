package typings.apolloServerEnv

import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptUtilityTypesMod {
  
  type ValueOrPromise[T] = T | js.Promise[T]
  
  type WithRequired[T, K /* <: /* keyof T */ String */] = T & (Required[Pick[T, K]])
}
