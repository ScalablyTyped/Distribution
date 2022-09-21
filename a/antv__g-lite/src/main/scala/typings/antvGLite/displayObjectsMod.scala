package typings.antvGLite

import typings.antvGLite.circleMod.CircleStyleProps
import typings.antvGLite.displayObjectsPathMod.PathStyleProps
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.domInterfacesMod.DisplayObjectConfig
import typings.antvGLite.ellipseMod.EllipseStyleProps
import typings.antvGLite.groupMod.GroupStyleProps
import typings.antvGLite.htmlMod.HTMLStyleProps
import typings.antvGLite.imageMod.ImageStyleProps
import typings.antvGLite.lineMod.LineStyleProps
import typings.antvGLite.polygonMod.PolygonStyleProps
import typings.antvGLite.polylineMod.PolylineStyleProps
import typings.antvGLite.rectMod.RectStyleProps
import typings.antvGLite.textMod.TextStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayObjectsMod {
  
  @JSImport("@antv/g-lite/dist/display-objects", "Circle")
  @js.native
  open class Circle ()
    extends typings.antvGLite.circleMod.Circle {
    def this(hasStyleRest: DisplayObjectConfig[CircleStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "CustomElement")
  @js.native
  abstract class CustomElement[CustomElementStyleProps] ()
    extends typings.antvGLite.customElementMod.CustomElement[CustomElementStyleProps] {
    def this(hasStyleRest: DisplayObjectConfig[CustomElementStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObject")
  @js.native
  open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected ()
    extends typings.antvGLite.displayObjectMod.DisplayObject[StyleProps, ParsedStyleProps] {
    def this(config: DisplayObjectConfig[StyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObjectPool")
  @js.native
  open class DisplayObjectPool ()
    extends typings.antvGLite.displayObjectPoolMod.DisplayObjectPool
  
  @JSImport("@antv/g-lite/dist/display-objects", "Ellipse")
  @js.native
  open class Ellipse ()
    extends typings.antvGLite.ellipseMod.Ellipse {
    def this(hasStyleRest: DisplayObjectConfig[EllipseStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Group")
  @js.native
  open class Group ()
    extends typings.antvGLite.groupMod.Group {
    def this(hasStyleRest: DisplayObjectConfig[GroupStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "HTML")
  @js.native
  open class HTML ()
    extends typings.antvGLite.htmlMod.HTML {
    def this(hasStyleRest: DisplayObjectConfig[HTMLStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Image")
  @js.native
  open class Image ()
    extends typings.antvGLite.imageMod.Image {
    def this(hasStyleRest: DisplayObjectConfig[ImageStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Line")
  @js.native
  open class Line ()
    extends typings.antvGLite.lineMod.Line {
    def this(hasStyleRest: DisplayObjectConfig[LineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Path")
  @js.native
  open class Path ()
    extends typings.antvGLite.displayObjectsPathMod.Path {
    def this(hasStyleRest: DisplayObjectConfig[PathStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polygon")
  @js.native
  open class Polygon ()
    extends typings.antvGLite.polygonMod.Polygon {
    def this(hasStyleRest: DisplayObjectConfig[PolygonStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polyline")
  @js.native
  open class Polyline ()
    extends typings.antvGLite.polylineMod.Polyline {
    def this(hasStyleRest: DisplayObjectConfig[PolylineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Rect")
  @js.native
  open class Rect ()
    extends typings.antvGLite.rectMod.Rect {
    def this(hasStyleRest: DisplayObjectConfig[RectStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Text")
  @js.native
  /**
    * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement#constants
    */
  open class Text ()
    extends typings.antvGLite.textMod.Text {
    def this(hasStyleRest: DisplayObjectConfig[TextStyleProps]) = this()
  }
}
