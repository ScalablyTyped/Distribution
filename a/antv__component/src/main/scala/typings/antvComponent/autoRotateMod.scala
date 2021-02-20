package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoRotateMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-rotate", "fixedAngle")
  @js.native
  def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
  @JSImport("@antv/component/lib/axis/overlap/auto-rotate", "fixedAngle")
  @js.native
  def fixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double, customRotate: Double): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-rotate", "getDefault")
  @js.native
  def getDefault(): js.Function4[
    /* isVertical */ Boolean, 
    /* labelsGroup */ IGroup, 
    /* limitLength */ Double, 
    /* customRotate */ js.UndefOr[Double], 
    Boolean
  ] = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-rotate", "unfixedAngle")
  @js.native
  def unfixedAngle(isVertical: Boolean, labelsGroup: IGroup, limitLength: Double): Boolean = js.native
}
