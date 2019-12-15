package typings.apolloDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreLocalStateMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.apolloDashClient.Anon_Field

  type FragmentMatcher = js.Function3[/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any, Boolean]
  type Resolver = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[Anon_Field], 
    js.Any
  ]
  type VariableMap = StringDictionary[js.Any]
}
