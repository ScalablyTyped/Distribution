package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlapMod {
  
  object autoEllipsis {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoEllipsis.ellipsisHead")
    @js.native
    def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoEllipsis.ellipsisMiddle")
    @js.native
    def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoEllipsis.ellipsisTail")
    @js.native
    def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoEllipsis.getDefault")
    @js.native
    def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = js.native
  }
  
  object autoHide {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.equidistance")
    @js.native
    def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.equidistanceWithReverseBoth")
    @js.native
    def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.getDefault")
    @js.native
    def getDefault(): js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean] = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.reserveBoth")
    @js.native
    def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.reserveFirst")
    @js.native
    def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoHide.reserveLast")
    @js.native
    def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  }
  
  object autoRotate {
    
    @JSImport("@antv/component/lib/axis/overlap", "autoRotate.fixedAngle")
    @js.native
    def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
    @JSImport("@antv/component/lib/axis/overlap", "autoRotate.fixedAngle")
    @js.native
    def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, customRotate: Double): Boolean = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoRotate.getDefault")
    @js.native
    def getDefault(): js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ Double, 
        /* customRotate */ js.UndefOr[Double], 
        Boolean
      ] = js.native
    
    @JSImport("@antv/component/lib/axis/overlap", "autoRotate.unfixedAngle")
    @js.native
    def unfixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
  }
}
