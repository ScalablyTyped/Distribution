package typings.antvGBase

import typings.antvGBase.interfacesMod.IShape
import typings.antvGBase.typesMod.SimpleBBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("@antv/g-base/lib/bbox/rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(shape: IShape): SimpleBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(shape.asInstanceOf[js.Any]).asInstanceOf[SimpleBBox]
}
