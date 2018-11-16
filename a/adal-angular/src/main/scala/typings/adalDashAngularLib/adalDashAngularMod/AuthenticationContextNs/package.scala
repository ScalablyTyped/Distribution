package typings
package adalDashAngularLib.adalDashAngularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object AuthenticationContextNs {
  type LoggingLevel = adalDashAngularLib.adalDashAngularLibNumbers.`0` | adalDashAngularLib.adalDashAngularLibNumbers.`1` | adalDashAngularLib.adalDashAngularLibNumbers.`2` | adalDashAngularLib.adalDashAngularLibNumbers.`3`
  type RequestType = adalDashAngularLib.adalDashAngularLibStrings.LOGIN | adalDashAngularLib.adalDashAngularLibStrings.RENEW_TOKEN | adalDashAngularLib.adalDashAngularLibStrings.UNKNOWN
  type ResponseType = (adalDashAngularLib.adalDashAngularLibStrings.`id_token token`) | adalDashAngularLib.adalDashAngularLibStrings.token
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
