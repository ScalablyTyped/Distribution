package typings.agGrid

import typings.agGrid.gridPanelMod.GridPanel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object animationFrameServiceMod {
  
  @JSImport("ag-grid/dist/lib/misc/animationFrameService", "AnimationFrameService")
  @js.native
  class AnimationFrameService () extends StObject {
    
    def addP1Task(task: js.Function0[Unit]): Unit = js.native
    
    def addP2Task(task: js.Function0[Unit]): Unit = js.native
    
    var eventService: js.Any = js.native
    
    /* private */ def executeFrame(millis: js.Any): js.Any = js.native
    
    def flushAllFrames(): Unit = js.native
    
    var gridOptionsWrapper: js.Any = js.native
    
    var gridPanel: js.Any = js.native
    
    /* private */ def init(): js.Any = js.native
    
    def isQueueEmpty(): Boolean = js.native
    
    var p1Tasks: js.Any = js.native
    
    var p2Tasks: js.Any = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    /* private */ def requestFrame(): js.Any = js.native
    
    def schedule(): Unit = js.native
    
    /* private */ def stopTicking(): js.Any = js.native
    
    var ticking: js.Any = js.native
    
    var useAnimationFrame: js.Any = js.native
    
    /* private */ def verifyAnimationFrameOn(methodName: js.Any): js.Any = js.native
  }
}
