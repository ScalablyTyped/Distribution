package typings.antvGBase

import typings.antvGBase.libInterfacesMod.IShape
import typings.antvGBase.libTypesMod.SimpleBBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBboxCircleMod {
  
  @JSImport("@antv/g-base/lib/bbox/circle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(shape: IShape): SimpleBBox = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(shape.asInstanceOf[js.Any]).asInstanceOf[SimpleBBox]
}
