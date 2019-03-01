package typings
package adalDashAngularLib.adalDashAngularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AuthenticationContextNs {
  type TokenCallback = js.Function3[
    /* errorDesc */ java.lang.String | scala.Null, 
    /* token */ java.lang.String | scala.Null, 
    /* error */ js.Any, 
    scala.Unit
  ]
  type UserCallback = js.Function2[
    /* errorDesc */ java.lang.String | scala.Null, 
    /* user */ UserInfo | scala.Null, 
    scala.Unit
  ]
}
