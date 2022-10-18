package typings.agilite

import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsUtilsMod {
  
  @JSImport("agilite/dist/utils/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def authenticateToken(): js.Promise[AxiosResponse[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateToken")().asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  inline def authenticateToken(apiServerUrl: String): js.Promise[AxiosResponse[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("authenticateToken")(apiServerUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  inline def authenticateToken(apiServerUrl: String, apiKey: String): js.Promise[AxiosResponse[Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateToken")(apiServerUrl.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  inline def authenticateToken(apiServerUrl: Unit, apiKey: String): js.Promise[AxiosResponse[Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("authenticateToken")(apiServerUrl.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  
  inline def executeCRUDRequest(
    apiServerUrl: js.UndefOr[String],
    apiKey: js.UndefOr[String],
    teamId: js.UndefOr[String],
    appName: js.UndefOr[String],
    method: js.UndefOr[String],
    data: js.UndefOr[Any],
    headers: js.UndefOr[Any]
  ): js.Promise[AxiosResponse[Any, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("executeCRUDRequest")(apiServerUrl.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any], teamId.asInstanceOf[js.Any], appName.asInstanceOf[js.Any], method.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  
  inline def executeRequest(): js.Promise[AxiosResponse[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeRequest")().asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
  inline def executeRequest(config: Any): js.Promise[AxiosResponse[Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("executeRequest")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AxiosResponse[Any, Any]]]
}
