package typings.antvGLite

import typings.antvGLite.distShapesMod.AABB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsRenderableMod {
  
  trait Renderable extends StObject {
    
    /**
      * aabb 应该存在 Renderable 而非 Geometry 中，原因包括：
      * 1. 包围盒会受 transform 影响。例如每次 transform 之后应该重新计算包围盒（center 发生偏移）。
      * 2. 多个 Mesh 可以共享一个 Geometry，但可以各自拥有不同的 aabb
      */
    var bounds: js.UndefOr[AABB] = js.undefined
    
    var boundsDirty: Boolean
    
    /**
      * dirty rectangle flag
      */
    var dirty: Boolean
    
    /**
      * dirty render bounds in last render frame
      */
    var dirtyRenderBounds: AABB
    
    /**
      * Rendering with other renderers, eg. simple Path/Polyline should be treated as instanced Line.
      */
    var proxyNodeName: String
    
    /**
      * account for hierarchy, also including extra rendering effects
      */
    var renderBounds: js.UndefOr[AABB] = js.undefined
    
    var renderBoundsDirty: Boolean
  }
  object Renderable {
    
    inline def apply(
      boundsDirty: Boolean,
      dirty: Boolean,
      dirtyRenderBounds: AABB,
      proxyNodeName: String,
      renderBoundsDirty: Boolean
    ): Renderable = {
      val __obj = js.Dynamic.literal(boundsDirty = boundsDirty.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dirtyRenderBounds = dirtyRenderBounds.asInstanceOf[js.Any], proxyNodeName = proxyNodeName.asInstanceOf[js.Any], renderBoundsDirty = renderBoundsDirty.asInstanceOf[js.Any])
      __obj.asInstanceOf[Renderable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Renderable] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: AABB): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsDirty(value: Boolean): Self = StObject.set(x, "boundsDirty", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDirtyRenderBounds(value: AABB): Self = StObject.set(x, "dirtyRenderBounds", value.asInstanceOf[js.Any])
      
      inline def setProxyNodeName(value: String): Self = StObject.set(x, "proxyNodeName", value.asInstanceOf[js.Any])
      
      inline def setRenderBounds(value: AABB): Self = StObject.set(x, "renderBounds", value.asInstanceOf[js.Any])
      
      inline def setRenderBoundsDirty(value: Boolean): Self = StObject.set(x, "renderBoundsDirty", value.asInstanceOf[js.Any])
      
      inline def setRenderBoundsUndefined: Self = StObject.set(x, "renderBounds", js.undefined)
    }
  }
}
