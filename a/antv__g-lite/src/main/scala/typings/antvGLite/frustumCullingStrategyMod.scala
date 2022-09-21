package typings.antvGLite

import typings.antvGLite.cullingPluginMod.CullingStrategyContribution
import typings.antvGLite.displayObjectMod.DisplayObject
import typings.antvGLite.interfacesMod.ICamera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frustumCullingStrategyMod {
  
  @JSImport("@antv/g-lite/dist/plugins/FrustumCullingStrategy", "FrustumCullingStrategy")
  @js.native
  open class FrustumCullingStrategy protected ()
    extends StObject
       with CullingStrategyContribution {
    def this(camera: ICamera) = this()
    
    /* private */ var camera: Any = js.native
    
    /**
      *
      * @see「Optimized View Frustum Culling Algorithms for Bounding Boxes」
      * @see https://github.com/antvis/GWebGPUEngine/issues/3
      *
      * * 基础相交测试 the basic intersection test
      * * 标记 masking @see https://cesium.com/blog/2015/08/04/fast-hierarchical-culling/
      * * TODO: 平面一致性测试 the plane-coherency test
      * * TODO: 支持 mesh 指定自身的剔除策略，参考 Babylon.js @see https://doc.babylonjs.com/how_to/optimizing_your_scene#changing-mesh-culling-strategy
      *
      * @param aabb aabb
      * @param parentPlaneMask mask of parent
      * @param planes planes of frustum
      */
    /* private */ var computeVisibilityWithPlaneMask: Any = js.native
    
    /* CompleteClass */
    override def isVisible(`object`: DisplayObject[Any, Any]): Boolean = js.native
  }
}
