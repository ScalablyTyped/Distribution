package typings.angularCli.srcAnalyticsAnalyticsParametersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventCustomDimension extends StObject
@JSImport("@angular/cli/src/analytics/analytics-parameters", "EventCustomDimension")
@js.native
object EventCustomDimension extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventCustomDimension & String] = js.native
  
  @js.native
  sealed trait Aot
    extends StObject
       with EventCustomDimension
  /* "ep.ng_aot" */ val Aot: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Aot & String = js.native
  
  @js.native
  sealed trait BuilderTarget
    extends StObject
       with EventCustomDimension
  /* "ep.ng_builder_target" */ val BuilderTarget: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.BuilderTarget & String = js.native
  
  @js.native
  sealed trait Command
    extends StObject
       with EventCustomDimension
  /* "ep.ng_command" */ val Command: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Command & String = js.native
  
  @js.native
  sealed trait InlineStyle
    extends StObject
       with EventCustomDimension
  /* "ep.ng_inline_style" */ val InlineStyle: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.InlineStyle & String = js.native
  
  @js.native
  sealed trait InlineTemplate
    extends StObject
       with EventCustomDimension
  /* "ep.ng_inline_template" */ val InlineTemplate: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.InlineTemplate & String = js.native
  
  @js.native
  sealed trait Optimization
    extends StObject
       with EventCustomDimension
  /* "ep.ng_optimization" */ val Optimization: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Optimization & String = js.native
  
  @js.native
  sealed trait Routing
    extends StObject
       with EventCustomDimension
  /* "ep.ng_routing" */ val Routing: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Routing & String = js.native
  
  @js.native
  sealed trait SchematicCollectionName
    extends StObject
       with EventCustomDimension
  /* "ep.ng_schematic_collection_name" */ val SchematicCollectionName: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.SchematicCollectionName & String = js.native
  
  @js.native
  sealed trait SchematicName
    extends StObject
       with EventCustomDimension
  /* "ep.ng_schematic_name" */ val SchematicName: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.SchematicName & String = js.native
  
  @js.native
  sealed trait Standalone
    extends StObject
       with EventCustomDimension
  /* "ep.ng_standalone" */ val Standalone: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Standalone & String = js.native
  
  @js.native
  sealed trait Style
    extends StObject
       with EventCustomDimension
  /* "ep.ng_style" */ val Style: typings.angularCli.srcAnalyticsAnalyticsParametersMod.EventCustomDimension.Style & String = js.native
}
