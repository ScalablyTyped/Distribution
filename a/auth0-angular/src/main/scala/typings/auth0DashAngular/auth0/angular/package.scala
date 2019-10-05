package typings.auth0DashAngular.auth0

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angular {
  type IErrorCallback = js.Function1[/* error */ js.Any, Unit]
  type ISuccessCallback = js.Function5[
    /* profile */ js.UndefOr[String], 
    /* idToken */ js.UndefOr[String], 
    /* accessToken */ js.UndefOr[String], 
    /* state */ js.UndefOr[String], 
    /* refreshToken */ js.UndefOr[String], 
    Unit
  ]
}
