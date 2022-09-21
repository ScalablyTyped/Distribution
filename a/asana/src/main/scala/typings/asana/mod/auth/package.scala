package typings.asana.mod.auth

import typings.asana.mod.auth.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def App_=(x: AppStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])

inline def OauthError: OauthErrorStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("OauthError").asInstanceOf[OauthErrorStatic]
type OauthError = js.Error
inline def OauthError_=(x: OauthErrorStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OauthError")(x.asInstanceOf[js.Any])

inline def RedirectFlow: RedirectFlowStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("RedirectFlow").asInstanceOf[RedirectFlowStatic]
type RedirectFlow = BaseBrowserFlow
inline def RedirectFlow_=(x: RedirectFlowStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RedirectFlow")(x.asInstanceOf[js.Any])

/**
  * Auto-detects the type of Oauth flow to use that's appropriate to the
  * environment.
  *
  * @returns {Function|null} The type of Oauth flow to use, or null if no
  *     appropriate type could be determined.
  * @param env
  * @return
  */
inline def autoDetect(env: Any): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("autoDetect")(env.asInstanceOf[js.Any]).asInstanceOf[js.Function]
