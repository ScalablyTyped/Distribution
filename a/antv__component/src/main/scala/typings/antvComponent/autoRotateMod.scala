package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/component/lib/axis/overlap/auto-rotate", JSImport.Namespace)
@js.native
object autoRotateMod extends js.Object {
  
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
