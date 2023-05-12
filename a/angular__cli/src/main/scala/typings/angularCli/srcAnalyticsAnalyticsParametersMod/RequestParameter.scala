package typings.angularCli.srcAnalyticsAnalyticsParametersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RequestParameter extends StObject
@JSImport("@angular/cli/src/analytics/analytics-parameters", "RequestParameter")
@js.native
object RequestParameter extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[RequestParameter & String] = js.native
  
  @js.native
  sealed trait ClientId
    extends StObject
       with RequestParameter
  /* "cid" */ val ClientId: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.ClientId & String = js.native
  
  @js.native
  sealed trait DebugView
    extends StObject
       with RequestParameter
  /* "_dbg" */ val DebugView: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.DebugView & String = js.native
  
  @js.native
  sealed trait GtmVersion
    extends StObject
       with RequestParameter
  /* "gtm" */ val GtmVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.GtmVersion & String = js.native
  
  @js.native
  sealed trait Language
    extends StObject
       with RequestParameter
  /* "ul" */ val Language: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.Language & String = js.native
  
  @js.native
  sealed trait NewToSite
    extends StObject
       with RequestParameter
  /* "_nsi" */ val NewToSite: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.NewToSite & String = js.native
  
  @js.native
  sealed trait NonInteraction
    extends StObject
       with RequestParameter
  /* "ni" */ val NonInteraction: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.NonInteraction & String = js.native
  
  @js.native
  sealed trait PageLocation
    extends StObject
       with RequestParameter
  /* "dl" */ val PageLocation: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.PageLocation & String = js.native
  
  @js.native
  sealed trait PageTitle
    extends StObject
       with RequestParameter
  /* "dt" */ val PageTitle: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.PageTitle & String = js.native
  
  @js.native
  sealed trait ProtocolVersion
    extends StObject
       with RequestParameter
  /* "v" */ val ProtocolVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.ProtocolVersion & String = js.native
  
  @js.native
  sealed trait SessionEngaged
    extends StObject
       with RequestParameter
  /* "seg" */ val SessionEngaged: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.SessionEngaged & String = js.native
  
  @js.native
  sealed trait SessionId
    extends StObject
       with RequestParameter
  /* "sid" */ val SessionId: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.SessionId & String = js.native
  
  @js.native
  sealed trait SessionNumber
    extends StObject
       with RequestParameter
  /* "sct" */ val SessionNumber: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.SessionNumber & String = js.native
  
  @js.native
  sealed trait SessionStart
    extends StObject
       with RequestParameter
  /* "_ss" */ val SessionStart: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.SessionStart & String = js.native
  
  @js.native
  sealed trait TrackingId
    extends StObject
       with RequestParameter
  /* "tid" */ val TrackingId: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.TrackingId & String = js.native
  
  @js.native
  sealed trait TrafficType
    extends StObject
       with RequestParameter
  /* "tt" */ val TrafficType: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.TrafficType & String = js.native
  
  @js.native
  sealed trait UserAgentArchitecture
    extends StObject
       with RequestParameter
  /* "uaa" */ val UserAgentArchitecture: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentArchitecture & String = js.native
  
  @js.native
  sealed trait UserAgentBitness
    extends StObject
       with RequestParameter
  /* "uab" */ val UserAgentBitness: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentBitness & String = js.native
  
  @js.native
  sealed trait UserAgentFullVersionList
    extends StObject
       with RequestParameter
  /* "uafvl" */ val UserAgentFullVersionList: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentFullVersionList & String = js.native
  
  @js.native
  sealed trait UserAgentMobile
    extends StObject
       with RequestParameter
  /* "uamb" */ val UserAgentMobile: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentMobile & String = js.native
  
  @js.native
  sealed trait UserAgentModel
    extends StObject
       with RequestParameter
  /* "uam" */ val UserAgentModel: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentModel & String = js.native
  
  @js.native
  sealed trait UserAgentPlatform
    extends StObject
       with RequestParameter
  /* "uap" */ val UserAgentPlatform: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentPlatform & String = js.native
  
  @js.native
  sealed trait UserAgentPlatformVersion
    extends StObject
       with RequestParameter
  /* "uapv" */ val UserAgentPlatformVersion: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserAgentPlatformVersion & String = js.native
  
  @js.native
  sealed trait UserId
    extends StObject
       with RequestParameter
  /* "uid" */ val UserId: typings.angularCli.srcAnalyticsAnalyticsParametersMod.RequestParameter.UserId & String = js.native
}
