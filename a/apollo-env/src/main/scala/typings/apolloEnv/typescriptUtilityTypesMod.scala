package typings.apolloEnv

import org.scalablytyped.runtime.TopLevel
import typings.std.Pick
import typings.std.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/typescript-utility-types", JSImport.Namespace)
@js.native
object typescriptUtilityTypesMod extends js.Object {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typings.apolloEnv.apolloEnvStrings.DeepPartial with TopLevel[js.Any]
  type WithRequired[T, K /* <: /* keyof T */ String */] = T with (Required[Pick[T, K]])
}

