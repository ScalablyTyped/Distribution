package typings.auth0DotWidget.auth0DotWidgetMod

import org.scalablytyped.runtime.Instantiable1
import typings.auth0DashJs.auth0DashJsMod.Auth0DecodedHash
import typings.auth0DashJs.auth0DashJsMod.Auth0Error
import typings.auth0DashJs.auth0DashJsMod.Auth0UserProfile
import typings.auth0DashJs.auth0DashJsMod.Authentication
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0WidgetStatic extends Instantiable1[/* params */ Auth0Constructor, Auth0WidgetStatic] {
  def getClient(): Authentication = js.native
  def getProfile(token: String, callback: js.Function): Auth0UserProfile = js.native
  def parseHash(hash: String): Auth0DecodedHash = js.native
  def reset(options: Auth0Options): Auth0WidgetStatic = js.native
  def reset(options: Auth0Options, callback: js.Function): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options, widgetLoadedCallback: js.Function): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options, widgetLoadedCallback: js.Function, popupCallback: js.Function): Auth0WidgetStatic = js.native
  def signup(
    options: Auth0Options,
    callback: js.Function5[
      /* error */ js.UndefOr[Auth0Error], 
      /* profile */ js.UndefOr[Auth0UserProfile], 
      /* id_token */ js.UndefOr[String], 
      /* access_token */ js.UndefOr[String], 
      /* state */ js.UndefOr[String], 
      _
    ]
  ): Auth0WidgetStatic = js.native
}

