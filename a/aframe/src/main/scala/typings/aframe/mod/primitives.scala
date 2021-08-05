package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitives {
  
  @JSImport("aframe", "primitives")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMeshMixin(): typings.aframe.anon.DefaultComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeshMixin")().asInstanceOf[typings.aframe.anon.DefaultComponents]
  
  @JSImport("aframe", "primitives.primitives")
  @js.native
  def primitives: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]] = js.native
  inline def primitives_=(x: ObjectMap[Entity[ObjectMap[Component[js.Any, System[js.Any]]]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("primitives")(x.asInstanceOf[js.Any])
}
