package typings.antvComponent

import typings.antvComponent.typesMod.AxisLabelAutoHideCfg
import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlapMod {
  
  object autoEllipsis {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoEllipsis")
    @js.native
    val ^ : js.Any = js.native
    
    inline def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisHead")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisMiddle")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisTail")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean]]
  }
  
  object autoHide {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide")
    @js.native
    val ^ : js.Any = js.native
    
    inline def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistance")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistance(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistance")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistance(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistance")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistance(isVertical: Boolean, labelsGroup: IGroup, limitLength: Unit, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistance")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistanceWithReverseBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistanceWithReverseBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistanceWithReverseBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Unit, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equidistanceWithReverseBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getDefault(): js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ js.UndefOr[Double], 
        /* autoHideCfg */ js.UndefOr[AxisLabelAutoHideCfg], 
        Boolean
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ js.UndefOr[Double], 
        /* autoHideCfg */ js.UndefOr[AxisLabelAutoHideCfg], 
        Boolean
      ]]
    
    inline def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveBoth(isVertical: Boolean, labelsGroup: IGroup, limitLength: Unit, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveBoth")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveFirst")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveFirst(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveFirst")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveFirst(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveFirst")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveFirst(isVertical: Boolean, labelsGroup: IGroup, limitLength: Unit, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveFirst")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveLast")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveLast(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveLast")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveLast(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveLast")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def reserveLast(isVertical: Boolean, labelsGroup: IGroup, limitLength: Unit, autoHideCfg: AxisLabelAutoHideCfg): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("reserveLast")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], autoHideCfg.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  object autoRotate {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoRotate")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, customRotate: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("fixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any], customRotate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def getDefault(): js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ Double, 
        /* customRotate */ js.UndefOr[Double], 
        Boolean
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ Double, 
        /* customRotate */ js.UndefOr[Double], 
        Boolean
      ]]
    
    inline def unfixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("unfixedAngle")(isVertical.asInstanceOf[js.Any], labelsGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
