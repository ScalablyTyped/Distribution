package typings.aframe.anon

import org.scalablytyped.runtime.Instantiable0
import typings.three.mod.Object3D
import typings.three.srcCoreEventDispatcherMod.BaseEvent
import typings.three.srcMathVector3Mod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofObject3D
  extends StObject
     with Instantiable0[Object3D[BaseEvent]] {
  
  /**
    * The default setting for {@link matrixAutoUpdate} for newly created Object3Ds.
    * @defaultValue `true`
    */
  var DEFAULT_MATRIX_AUTO_UPDATE: Boolean = js.native
  
  /**
    * The default setting for {@link matrixWorldAutoUpdate} for newly created Object3Ds.
    * @defaultValue `true`
    */
  var DEFAULT_MATRIX_WORLD_AUTO_UPDATE: Boolean = js.native
  
  /**
    * The default {@link up} direction for objects, also used as the default position for {@link THREE.DirectionalLight | DirectionalLight},
    * {@link THREE.HemisphereLight | HemisphereLight} and {@link THREE.Spotlight | Spotlight} (which creates lights shining from the top down).
    * @defaultValue `new THREE.Vector3( 0, 1, 0)`
    */
  var DEFAULT_UP: Vector3 = js.native
}
