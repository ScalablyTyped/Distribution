package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreLocalStateMod {
  type FragmentMatcher = js.Function3[
    /* rootValue */ js.Any, 
    /* typeCondition */ java.lang.String, 
    /* context */ js.Any, 
    scala.Boolean
  ]
  type Resolver = js.Function5[
    /* fieldName */ java.lang.String, 
    /* rootValue */ js.Any, 
    /* args */ js.Any, 
    /* context */ js.Any, 
    /* info */ apolloDashClientLib.Anon_Field, 
    js.Any
  ]
  type VariableMap = org.scalablytyped.runtime.StringDictionary[js.Any]
}
