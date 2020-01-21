package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textFilterMod {
  type TextComparator = js.Function3[
    /* filter */ java.lang.String, 
    /* gridValue */ js.Any, 
    /* filterText */ java.lang.String, 
    scala.Boolean
  ]
  type TextFormatter = js.Function1[/* from */ java.lang.String, java.lang.String]
}
