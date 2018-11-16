package typings
package awesompleteLib.awesompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AwesompleteNs {
  type SortFunction = js.Function2[
    /* left */ scala.Double | js.Array[js.Any], 
    /* right */ scala.Double | js.Array[js.Any], 
    scala.Double
  ]
  type Suggestion = java.lang.String | awesompleteLib.Anon_ValueLabel | (js.Tuple2[java.lang.String, java.lang.String])
}
