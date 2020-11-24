package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/overlap", JSImport.Namespace)
@js.native
object overlapMod extends js.Object {
  
  @js.native
  object autoEllipsis extends js.Object {
    
    def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = js.native
    
    def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = js.native
  }
  
  @js.native
  object autoHide extends js.Object {
    
    def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    def getDefault(): js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean] = js.native
    
    def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
    
    def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  }
  
  @js.native
  object autoRotate extends js.Object {
    
    def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
    def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, customRotate: Double): Boolean = js.native
    
    def getDefault(): js.Function4[
        /* isVertical */ Boolean, 
        /* labelsGroup */ IGroup, 
        /* limitLength */ Double, 
        /* customRotate */ js.UndefOr[Double], 
        Boolean
      ] = js.native
    
    def unfixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
  }
}
