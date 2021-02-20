package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoHideMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "equidistance")
  @js.native
  def equidistance(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "equidistanceWithReverseBoth")
  @js.native
  def equidistanceWithReverseBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "getDefault")
  @js.native
  def getDefault(): js.Function2[/* isVertical */ Boolean, /* labelsGroup */ IGroup, Boolean] = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "reserveBoth")
  @js.native
  def reserveBoth(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "reserveFirst")
  @js.native
  def reserveFirst(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
  
  @JSImport("@antv/component/lib/axis/overlap/auto-hide", "reserveLast")
  @js.native
  def reserveLast(isVertical: Boolean, labelsGroup: IGroup): Boolean = js.native
}
