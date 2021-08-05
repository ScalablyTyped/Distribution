package typings.antvComponent

import typings.antvGBase.interfacesMod.IGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoEllipsisMod {
  
  @JSImport("@antv/component/lib/axis/overlap/auto-ellipsis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ellipsisHead(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisHead")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ellipsisMiddle(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisMiddle")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ellipsisTail(isVertical: Boolean, labelGroup: IGroup, limitLength: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ellipsisTail")(isVertical.asInstanceOf[js.Any], labelGroup.asInstanceOf[js.Any], limitLength.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getDefault(): js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefault")().asInstanceOf[js.Function3[/* isVertical */ Boolean, /* labelGroup */ IGroup, /* limitLength */ Double, Boolean]]
}
