package typings.antvGBase

import typings.antvGBase.registerMod.BoxMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bboxMod {
  
  @JSImport("@antv/g-base/lib/bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBBoxMethod(`type`: String): BoxMethod = ^.asInstanceOf[js.Dynamic].applyDynamic("getBBoxMethod")(`type`.asInstanceOf[js.Any]).asInstanceOf[BoxMethod]
}
