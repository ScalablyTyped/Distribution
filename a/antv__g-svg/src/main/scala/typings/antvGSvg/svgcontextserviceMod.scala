package typings.antvGSvg

import typings.antvGLite.anon.PartialDataURLOptions
import typings.antvGLite.contextServiceMod.ContextService
import typings.antvGLite.distTypesMod.CanvasConfig
import typings.antvGLite.distTypesMod.CanvasLike
import typings.std.DOMRect
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgcontextserviceMod {
  
  @JSImport("@antv/g-svg/dist/SVGContextService", "SVGContextService")
  @js.native
  open class SVGContextService protected ()
    extends StObject
       with ContextService[SVGElement] {
    def this(canvasConfig: CanvasConfig) = this()
    
    /* private */ @JSName("$container")
    var $container: Any = js.native
    
    /* private */ @JSName("$namespace")
    var $namespace: Any = js.native
    
    /* CompleteClass */
    override def applyCursorStyle(cursor: String): Unit = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* private */ var dpr: Any = js.native
    
    /* CompleteClass */
    override def getBoundingClientRect(): js.UndefOr[DOMRect] = js.native
    
    /* CompleteClass */
    override def getContext(): SVGElement | Null = js.native
    
    /* CompleteClass */
    override def getDPR(): Double = js.native
    
    /* CompleteClass */
    override def getDomElement(): CanvasLike | Null = js.native
    
    /* CompleteClass */
    override def init(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def resize(width: Double, height: Double): Unit = js.native
    
    def toDataURL(): js.Promise[String] = js.native
    /* CompleteClass */
    override def toDataURL(options: PartialDataURLOptions): js.Promise[String] = js.native
    def toDataURL(options: typings.antvGSvg.anon.PartialDataURLOptions): js.Promise[String] = js.native
  }
}
