package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object localStateMod {
  type FragmentMatcher = js.Function3[
    /* rootValue */ js.Any, 
    /* typeCondition */ java.lang.String, 
    /* context */ js.Any, 
    scala.Boolean
  ]
  type Resolver = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[typings.apolloClient.AnonField], 
    js.Any
  ]
  type VariableMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
