package typings.auth0Widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Auth0Widget")
  @js.native
  open class Auth0Widget protected ()
    extends StObject
       with Auth0WidgetStatic {
    def this(params: Auth0Constructor) = this()
  }
  @JSGlobal("Auth0Widget")
  @js.native
  def Auth0Widget: Auth0WidgetStatic = js.native
  inline def Auth0Widget_=(x: Auth0WidgetStatic): Unit = js.Dynamic.global.updateDynamic("Auth0Widget")(x.asInstanceOf[js.Any])
}
