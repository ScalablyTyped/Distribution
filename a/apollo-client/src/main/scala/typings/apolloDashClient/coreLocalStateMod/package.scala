package typings.apolloDashClient

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashClient.Anon_Field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreLocalStateMod {
  type FragmentMatcher = js.Function3[/* rootValue */ js.Any, /* typeCondition */ String, /* context */ js.Any, Boolean]
  type Resolver = js.Function5[
    /* fieldName */ String, 
    /* rootValue */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ Anon_Field, 
    js.Any
  ]
  type VariableMap = StringDictionary[js.Any]
}
