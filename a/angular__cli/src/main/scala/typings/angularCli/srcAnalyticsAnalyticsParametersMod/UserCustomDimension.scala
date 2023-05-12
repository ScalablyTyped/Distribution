package typings.angularCli.srcAnalyticsAnalyticsParametersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserCustomDimension extends StObject
@JSImport("@angular/cli/src/analytics/analytics-parameters", "UserCustomDimension")
@js.native
object UserCustomDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserCustomDimension & String] = js.native
  
  @js.native
  sealed trait AngularCLIMajorVersion
    extends StObject
       with UserCustomDimension
  /* "upn.ng_cli_major_version" */ val AngularCLIMajorVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.AngularCLIMajorVersion & String = js.native
  
  @js.native
  sealed trait AngularCLIVersion
    extends StObject
       with UserCustomDimension
  /* "up.ng_cli_version" */ val AngularCLIVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.AngularCLIVersion & String = js.native
  
  @js.native
  sealed trait NodeMajorVersion
    extends StObject
       with UserCustomDimension
  /* "upn.ng_node_major_version" */ val NodeMajorVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.NodeMajorVersion & String = js.native
  
  @js.native
  sealed trait NodeVersion
    extends StObject
       with UserCustomDimension
  /* "up.ng_node_version" */ val NodeVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.NodeVersion & String = js.native
  
  @js.native
  sealed trait OsArchitecture
    extends StObject
       with UserCustomDimension
  /* "up.ng_os_architecture" */ val OsArchitecture: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.OsArchitecture & String = js.native
  
  @js.native
  sealed trait PackageManager
    extends StObject
       with UserCustomDimension
  /* "up.ng_package_manager" */ val PackageManager: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.PackageManager & String = js.native
  
  @js.native
  sealed trait PackageManagerMajorVersion
    extends StObject
       with UserCustomDimension
  /* "upn.ng_pkg_manager_major_v" */ val PackageManagerMajorVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.PackageManagerMajorVersion & String = js.native
  
  @js.native
  sealed trait PackageManagerVersion
    extends StObject
       with UserCustomDimension
  /* "up.ng_pkg_manager_version" */ val PackageManagerVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.PackageManagerVersion & String = js.native
  
  @js.native
  sealed trait UserId
    extends StObject
       with UserCustomDimension
  /* "up.ng_user_id" */ val UserId: typings.angularCli.srcAnalyticsAnalyticsParametersMod.UserCustomDimension.UserId & String = js.native
}
