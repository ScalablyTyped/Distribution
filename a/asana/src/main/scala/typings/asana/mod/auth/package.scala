package typings.asana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object auth {
  
  @scala.inline
  def App: typings.asana.mod.auth.AppStatic = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("App").asInstanceOf[typings.asana.mod.auth.AppStatic]
  @scala.inline
  def App_=(x: typings.asana.mod.auth.AppStatic): scala.Unit = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("App")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def OauthError: typings.asana.mod.auth.OauthErrorStatic = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("OauthError").asInstanceOf[typings.asana.mod.auth.OauthErrorStatic]
  type OauthError = typings.std.Error
  @scala.inline
  def OauthError_=(x: typings.asana.mod.auth.OauthErrorStatic): scala.Unit = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("OauthError")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def RedirectFlow: typings.asana.mod.auth.RedirectFlowStatic = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].selectDynamic("RedirectFlow").asInstanceOf[typings.asana.mod.auth.RedirectFlowStatic]
  type RedirectFlow = typings.asana.mod.auth.BaseBrowserFlow
  @scala.inline
  def RedirectFlow_=(x: typings.asana.mod.auth.RedirectFlowStatic): scala.Unit = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].updateDynamic("RedirectFlow")(x.asInstanceOf[js.Any])
  
  /**
    * Auto-detects the type of Oauth flow to use that's appropriate to the
    * environment.
    *
    * @returns {Function|null} The type of Oauth flow to use, or null if no
    *     appropriate type could be determined.
    * @param env
    * @return
    */
  @scala.inline
  def autoDetect(env: js.Any): js.Function = typings.asana.mod.auth.^.asInstanceOf[js.Dynamic].applyDynamic("autoDetect")(env.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
