package typings.apolloDashEnv

import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libTypescriptDashUtilityDashTypesMod {
  type DeepPartial[T] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]:? object}
    */ typings.apolloDashEnv.apolloDashEnvStrings.DeepPartial with js.Any
  type WithRequired[T, K /* <: String */] = T with (Required[Pick[T, K]])
}
