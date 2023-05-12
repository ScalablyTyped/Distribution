package typings.atlaskitDsExplorations

import typings.atlaskitDsExplorations.distTypesComponentsTypesMod.BasePrimitiveProps
import typings.emotionReact.mod.jsx.JSX.Element
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComponentsInteractionSurfaceDotpartialMod {
  
  @JSImport("@atlaskit/ds-explorations/dist/types/components/interaction-surface.partial", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *
    * @example
    * ```js
    * // a minimal icon button
    * <Box as="button">
    *   <InteractionSurface>
    *    <WarningIcon label="icon button" />
    *  </InteractionSurface>
    * </Box>
    * ```
    */
  inline def default(param0: InteractionSurfaceProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* keyof @atlaskit/ds-explorations.anon.Danger */ /* Rewritten from type alias, can be one of: 
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.input
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.inverseDotsubtle
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.neutral
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.neutralDotsubtle
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.neutralDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.selected
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.selectedDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.brandDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.danger
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.dangerDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.warning
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.warningDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.success
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.successDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.discovery
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.discoveryDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.information
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.informationDotbold
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.elevationDotsurface
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.elevationDotsurfaceDotoverlay
    - typings.atlaskitDsExplorations.atlaskitDsExplorationsStrings.elevationDotsurfaceDotraised
  */
  trait InteractionBackgroundColor extends StObject
  
  trait InteractionSurfaceProps
    extends StObject
       with BasePrimitiveProps {
    
    var appearance: js.UndefOr[InteractionBackgroundColor] = js.undefined
    
    var children: ReactNode
  }
  object InteractionSurfaceProps {
    
    inline def apply(): InteractionSurfaceProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractionSurfaceProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InteractionSurfaceProps] (val x: Self) extends AnyVal {
      
      inline def setAppearance(value: InteractionBackgroundColor): Self = StObject.set(x, "appearance", value.asInstanceOf[js.Any])
      
      inline def setAppearanceUndefined: Self = StObject.set(x, "appearance", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
