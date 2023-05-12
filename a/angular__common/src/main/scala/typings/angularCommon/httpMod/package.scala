package typings.angularCommon.httpMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.CookieName
import typings.angularCommon.httpMod.HttpFeatureKind.CustomXsrfConfiguration
import typings.angularCommon.httpMod.HttpFeatureKind.Interceptors
import typings.angularCommon.httpMod.HttpFeatureKind.JsonpSupport
import typings.angularCommon.httpMod.HttpFeatureKind.LegacyInterceptors
import typings.angularCommon.httpMod.HttpFeatureKind.NoXsrfProtection
import typings.angularCommon.httpMod.HttpFeatureKind.RequestsMadeViaParent
import typings.angularCommon.httpMod.^
import typings.angularCore.mod.EnvironmentProviders
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Provider
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def HTTP_INTERCEPTORS: InjectionToken[js.Array[HttpInterceptor]] = ^.asInstanceOf[js.Dynamic].selectDynamic("HTTP_INTERCEPTORS").asInstanceOf[InjectionToken[js.Array[HttpInterceptor]]]

inline def provideHttpClient(features: HttpFeature[HttpFeatureKind]*): EnvironmentProviders = ^.asInstanceOf[js.Dynamic].applyDynamic("provideHttpClient")(features.asInstanceOf[Seq[js.Any]]*).asInstanceOf[EnvironmentProviders]

inline def withInterceptors(interceptorFns: js.Array[HttpInterceptorFn]): HttpFeature[Interceptors] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInterceptors")(interceptorFns.asInstanceOf[js.Any]).asInstanceOf[HttpFeature[Interceptors]]

inline def withInterceptorsFromDi(): HttpFeature[LegacyInterceptors] = ^.asInstanceOf[js.Dynamic].applyDynamic("withInterceptorsFromDi")().asInstanceOf[HttpFeature[LegacyInterceptors]]

inline def withJsonpSupport(): HttpFeature[JsonpSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("withJsonpSupport")().asInstanceOf[HttpFeature[JsonpSupport]]

inline def withNoXsrfProtection(): HttpFeature[NoXsrfProtection] = ^.asInstanceOf[js.Dynamic].applyDynamic("withNoXsrfProtection")().asInstanceOf[HttpFeature[NoXsrfProtection]]

inline def withRequestsMadeViaParent(): HttpFeature[RequestsMadeViaParent] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRequestsMadeViaParent")().asInstanceOf[HttpFeature[RequestsMadeViaParent]]

inline def withXsrfConfiguration(param0: CookieName): HttpFeature[CustomXsrfConfiguration] = ^.asInstanceOf[js.Dynamic].applyDynamic("withXsrfConfiguration")(param0.asInstanceOf[js.Any]).asInstanceOf[HttpFeature[CustomXsrfConfiguration]]

inline def ɵwithHttpTransferCache(): js.Array[Provider] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275withHttpTransferCache")().asInstanceOf[js.Array[Provider]]

type HttpHandlerFn = js.Function1[/* req */ HttpRequest[Any], Observable_[HttpEvent[Any]]]

type HttpInterceptorFn = js.Function2[/* req */ HttpRequest[Any], /* next */ HttpHandlerFn, Observable_[HttpEvent[Any]]]

/**
  * DI token/abstract type representing a map of JSONP callbacks.
  *
  * In the browser, this should always be the `window` object.
  *
  *
  */
type JsonpCallbackContext = StringDictionary[js.Function1[/* data */ Any, Unit]]
