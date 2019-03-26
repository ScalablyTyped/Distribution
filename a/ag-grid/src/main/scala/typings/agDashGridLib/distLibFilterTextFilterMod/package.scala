package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibFilterTextFilterMod {
  type TextComparator = js.Function3[
    /* filter */ java.lang.String, 
    /* gridValue */ js.Any, 
    /* filterText */ java.lang.String, 
    scala.Boolean
  ]
  type TextFormatter = js.Function1[/* from */ java.lang.String, java.lang.String]
}
