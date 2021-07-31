package typings.apolloEnv

import org.scalablytyped.runtime.TopLevel
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptUtilityTypesMod {
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias apollo-env.apollo-env/lib/typescript-utility-types.DeepPartial<T[P]> * / object}
    */ typings.apolloEnv.apolloEnvStrings.DeepPartial & TopLevel[js.Any]
  
  type WithRequired[T, K /* <: /* keyof T */ String */] = T & (Required[Pick[T, K]])
}
