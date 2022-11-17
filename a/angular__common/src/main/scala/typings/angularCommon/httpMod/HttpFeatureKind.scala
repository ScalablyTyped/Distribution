package typings.angularCommon.httpMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpFeatureKind extends StObject
@JSImport("@angular/common/http", "HttpFeatureKind")
@js.native
object HttpFeatureKind extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HttpFeatureKind & Double] = js.native
  
  @js.native
  sealed trait CustomXsrfConfiguration
    extends StObject
       with HttpFeatureKind
  /* 2 */ val CustomXsrfConfiguration: typings.angularCommon.httpMod.HttpFeatureKind.CustomXsrfConfiguration & Double = js.native
  
  @js.native
  sealed trait Interceptors
    extends StObject
       with HttpFeatureKind
  /* 0 */ val Interceptors: typings.angularCommon.httpMod.HttpFeatureKind.Interceptors & Double = js.native
  
  @js.native
  sealed trait JsonpSupport
    extends StObject
       with HttpFeatureKind
  /* 4 */ val JsonpSupport: typings.angularCommon.httpMod.HttpFeatureKind.JsonpSupport & Double = js.native
  
  @js.native
  sealed trait LegacyInterceptors
    extends StObject
       with HttpFeatureKind
  /* 1 */ val LegacyInterceptors: typings.angularCommon.httpMod.HttpFeatureKind.LegacyInterceptors & Double = js.native
  
  @js.native
  sealed trait NoXsrfProtection
    extends StObject
       with HttpFeatureKind
  /* 3 */ val NoXsrfProtection: typings.angularCommon.httpMod.HttpFeatureKind.NoXsrfProtection & Double = js.native
  
  @js.native
  sealed trait RequestsMadeViaParent
    extends StObject
       with HttpFeatureKind
  /* 5 */ val RequestsMadeViaParent: typings.angularCommon.httpMod.HttpFeatureKind.RequestsMadeViaParent & Double = js.native
}
