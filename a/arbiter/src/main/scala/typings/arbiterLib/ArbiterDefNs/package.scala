package typings
package arbiterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArbiterDefNs {
  type SubscribeHandler = js.Function3[
    /* data */ js.Any, 
    /* message */ java.lang.String, 
    /* subscriber_context */ js.Any, 
    scala.Unit
  ]
}
