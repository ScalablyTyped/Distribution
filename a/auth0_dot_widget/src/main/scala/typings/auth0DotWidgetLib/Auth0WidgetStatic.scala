package typings
package auth0DotWidgetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0WidgetStatic
  extends org.scalablytyped.runtime.Instantiable1[/* params */ Auth0Constructor, Auth0WidgetStatic] {
  def getClient(): js.Any = js.native
  def getProfile(token: java.lang.String, callback: js.Function): js.Any = js.native
  def parseHash(hash: java.lang.String): js.Any = js.native
  def reset(options: Auth0Options): Auth0WidgetStatic = js.native
  def reset(options: Auth0Options, callback: js.Function): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options, widgetLoadedCallback: js.Function): Auth0WidgetStatic = js.native
  def signin(options: Auth0Options, widgetLoadedCallback: js.Function, popupCallback: js.Function): Auth0WidgetStatic = js.native
  def signup(
    options: Auth0Options,
    callback: js.Function5[
      /* error */ js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Auth0Error */ js.Any
      ], 
      /* profile */ js.UndefOr[
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Auth0UserProfile */ js.Any
      ], 
      /* id_token */ js.UndefOr[java.lang.String], 
      /* access_token */ js.UndefOr[java.lang.String], 
      /* state */ js.UndefOr[java.lang.String], 
      _
    ]
  ): Auth0WidgetStatic = js.native
}

