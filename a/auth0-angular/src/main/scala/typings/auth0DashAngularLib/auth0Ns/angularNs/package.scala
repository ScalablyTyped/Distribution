package typings
package auth0DashAngularLib.auth0Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angularNs {
  type IErrorCallback = js.Function1[/* error */ js.Any, scala.Unit]
  type ISuccessCallback = js.Function5[
    /* profile */ js.UndefOr[java.lang.String], 
    /* idToken */ js.UndefOr[java.lang.String], 
    /* accessToken */ js.UndefOr[java.lang.String], 
    /* state */ js.UndefOr[java.lang.String], 
    /* refreshToken */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
