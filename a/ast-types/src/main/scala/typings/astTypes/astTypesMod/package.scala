package typings.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object astTypesMod {
  
  type Def = typings.astTypes.astTypesMod.Plugin[scala.Unit]
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Plugin[T] = js.Function1[/* fork */ typings.astTypes.astTypesMod.Fork, T]
}
