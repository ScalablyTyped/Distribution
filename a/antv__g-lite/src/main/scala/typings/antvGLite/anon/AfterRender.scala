package typings.antvGLite.anon

import typings.antvGLite.displayObjectsMod.DisplayObject
import typings.antvGLite.distTypesMod.InteractivePointerEvent
import typings.antvGLite.hookMod.UnsetAdditionalOptions
import typings.antvGLite.interfacesMod.ICamera
import typings.antvGLite.renderingServiceMod.PickingResult
import typings.antvGLite.utilsMod.AsyncParallelHook
import typings.antvGLite.utilsMod.AsyncSeriesWaterfallHook
import typings.antvGLite.utilsMod.SyncHook
import typings.antvGLite.utilsMod.SyncWaterfallHook
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterRender extends StObject {
  
  /**
    * called after every dirty object get rendered
    */
  var afterRender: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]
  
  /**
    * called before every dirty object get rendered
    */
  var beforeRender: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]
  
  /**
    * called at beginning of each frame, won't get called if nothing to re-render
    */
  var beginFrame: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  /**
    * do culling
    */
  var cull: SyncWaterfallHook[js.Tuple2[DisplayObject[Any, Any], ICamera], UnsetAdditionalOptions]
  
  var destroy: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  /**
    * only dirty object which has sth changed will be rendered
    */
  var dirtycheck: SyncWaterfallHook[js.Array[DisplayObject[Any, Any]], UnsetAdditionalOptions]
  
  var endFrame: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]
  
  /**
    * called before any frame rendered
    */
  var init: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]
  
  /**
    * use async but faster method such as GPU-based picking in `g-plugin-device-renderer`
    */
  var pick: AsyncSeriesWaterfallHook[js.Array[PickingResult], PickingResult]
  
  /**
    * Unsafe but sync version of pick.
    */
  var pickSync: SyncWaterfallHook[js.Array[PickingResult], PickingResult]
  
  var pointerCancel: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  /**
    * used in event system
    */
  var pointerDown: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  var pointerMove: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  var pointerOut: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  var pointerOver: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  var pointerUp: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  var pointerWheel: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]
  
  /**
    * called when every dirty object rendering even it's culled
    */
  var render: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]
}
object AfterRender {
  
  inline def apply(
    afterRender: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions],
    beforeRender: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions],
    beginFrame: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    cull: SyncWaterfallHook[js.Tuple2[DisplayObject[Any, Any], ICamera], UnsetAdditionalOptions],
    destroy: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    dirtycheck: SyncWaterfallHook[js.Array[DisplayObject[Any, Any]], UnsetAdditionalOptions],
    endFrame: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions],
    init: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions],
    pick: AsyncSeriesWaterfallHook[js.Array[PickingResult], PickingResult],
    pickSync: SyncWaterfallHook[js.Array[PickingResult], PickingResult],
    pointerCancel: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerDown: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerMove: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerOut: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerOver: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerUp: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    pointerWheel: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions],
    render: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]
  ): AfterRender = {
    val __obj = js.Dynamic.literal(afterRender = afterRender.asInstanceOf[js.Any], beforeRender = beforeRender.asInstanceOf[js.Any], beginFrame = beginFrame.asInstanceOf[js.Any], cull = cull.asInstanceOf[js.Any], destroy = destroy.asInstanceOf[js.Any], dirtycheck = dirtycheck.asInstanceOf[js.Any], endFrame = endFrame.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], pick = pick.asInstanceOf[js.Any], pickSync = pickSync.asInstanceOf[js.Any], pointerCancel = pointerCancel.asInstanceOf[js.Any], pointerDown = pointerDown.asInstanceOf[js.Any], pointerMove = pointerMove.asInstanceOf[js.Any], pointerOut = pointerOut.asInstanceOf[js.Any], pointerOver = pointerOver.asInstanceOf[js.Any], pointerUp = pointerUp.asInstanceOf[js.Any], pointerWheel = pointerWheel.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterRender]
  }
  
  extension [Self <: AfterRender](x: Self) {
    
    inline def setAfterRender(value: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "afterRender", value.asInstanceOf[js.Any])
    
    inline def setBeforeRender(value: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beforeRender", value.asInstanceOf[js.Any])
    
    inline def setBeginFrame(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "beginFrame", value.asInstanceOf[js.Any])
    
    inline def setCull(value: SyncWaterfallHook[js.Tuple2[DisplayObject[Any, Any], ICamera], UnsetAdditionalOptions]): Self = StObject.set(x, "cull", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    inline def setDirtycheck(value: SyncWaterfallHook[js.Array[DisplayObject[Any, Any]], UnsetAdditionalOptions]): Self = StObject.set(x, "dirtycheck", value.asInstanceOf[js.Any])
    
    inline def setEndFrame(value: SyncHook[js.Array[Any], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "endFrame", value.asInstanceOf[js.Any])
    
    inline def setInit(value: AsyncParallelHook[js.Array[Any], UnsetAdditionalOptions]): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setPick(value: AsyncSeriesWaterfallHook[js.Array[PickingResult], PickingResult]): Self = StObject.set(x, "pick", value.asInstanceOf[js.Any])
    
    inline def setPickSync(value: SyncWaterfallHook[js.Array[PickingResult], PickingResult]): Self = StObject.set(x, "pickSync", value.asInstanceOf[js.Any])
    
    inline def setPointerCancel(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerCancel", value.asInstanceOf[js.Any])
    
    inline def setPointerDown(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerDown", value.asInstanceOf[js.Any])
    
    inline def setPointerMove(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerMove", value.asInstanceOf[js.Any])
    
    inline def setPointerOut(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerOut", value.asInstanceOf[js.Any])
    
    inline def setPointerOver(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerOver", value.asInstanceOf[js.Any])
    
    inline def setPointerUp(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerUp", value.asInstanceOf[js.Any])
    
    inline def setPointerWheel(value: SyncHook[js.Array[InteractivePointerEvent], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "pointerWheel", value.asInstanceOf[js.Any])
    
    inline def setRender(value: SyncHook[js.Array[DisplayObject[Any, Any]], Unit, UnsetAdditionalOptions]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
