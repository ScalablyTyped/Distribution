package typings.atlaskitAnalyticsNext

import typings.atlaskitAnalyticsNext.distTypesTypesMod.CreateEventMap
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUsePatchedPropsMod {
  
  @JSImport("@atlaskit/analytics-next/dist/types/hooks/usePatchedProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def usePatchedProps[Props /* <: Record[String, Any] */](createEventMap: Unit, wrappedComponentProps: Props): PatchedPropsHook = (^.asInstanceOf[js.Dynamic].applyDynamic("usePatchedProps")(createEventMap.asInstanceOf[js.Any], wrappedComponentProps.asInstanceOf[js.Any])).asInstanceOf[PatchedPropsHook]
  inline def usePatchedProps[Props /* <: Record[String, Any] */](createEventMap: CreateEventMap, wrappedComponentProps: Props): PatchedPropsHook = (^.asInstanceOf[js.Dynamic].applyDynamic("usePatchedProps")(createEventMap.asInstanceOf[js.Any], wrappedComponentProps.asInstanceOf[js.Any])).asInstanceOf[PatchedPropsHook]
  
  trait PatchedPropsHook extends StObject {
    
    var patchedEventProps: CreateEventMap
  }
  object PatchedPropsHook {
    
    inline def apply(patchedEventProps: CreateEventMap): PatchedPropsHook = {
      val __obj = js.Dynamic.literal(patchedEventProps = patchedEventProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[PatchedPropsHook]
    }
    
    extension [Self <: PatchedPropsHook](x: Self) {
      
      inline def setPatchedEventProps(value: CreateEventMap): Self = StObject.set(x, "patchedEventProps", value.asInstanceOf[js.Any])
    }
  }
}
