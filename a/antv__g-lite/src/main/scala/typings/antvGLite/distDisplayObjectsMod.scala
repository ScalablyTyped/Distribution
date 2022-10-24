package typings.antvGLite

import typings.antvGLite.distDisplayObjectsCircleMod.CircleStyleProps
import typings.antvGLite.distDisplayObjectsEllipseMod.EllipseStyleProps
import typings.antvGLite.distDisplayObjectsGroupMod.GroupStyleProps
import typings.antvGLite.distDisplayObjectsHtmlMod.HTMLStyleProps
import typings.antvGLite.distDisplayObjectsImageMod.ImageStyleProps
import typings.antvGLite.distDisplayObjectsLineMod.LineStyleProps
import typings.antvGLite.distDisplayObjectsPathMod.PathStyleProps
import typings.antvGLite.distDisplayObjectsPolygonMod.PolygonStyleProps
import typings.antvGLite.distDisplayObjectsPolylineMod.PolylineStyleProps
import typings.antvGLite.distDisplayObjectsRectMod.RectStyleProps
import typings.antvGLite.distDisplayObjectsTextMod.TextStyleProps
import typings.antvGLite.distDomInterfacesMod.DisplayObjectConfig
import typings.antvGLite.distTypesMod.BaseStyleProps
import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDisplayObjectsMod {
  
  @JSImport("@antv/g-lite/dist/display-objects", "Circle")
  @js.native
  open class Circle ()
    extends typings.antvGLite.distDisplayObjectsCircleMod.Circle {
    def this(param0: DisplayObjectConfig[CircleStyleProps]) = this()
  }
  
  /* note: abstract class */ @JSImport("@antv/g-lite/dist/display-objects", "CustomElement")
  @js.native
  open class CustomElement[CustomElementStyleProps] ()
    extends typings.antvGLite.distDisplayObjectsCustomElementMod.CustomElement[CustomElementStyleProps] {
    def this(param0: DisplayObjectConfig[CustomElementStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObject")
  @js.native
  open class DisplayObject[StyleProps /* <: BaseStyleProps */, ParsedStyleProps /* <: ParsedBaseStyleProps */] protected ()
    extends typings.antvGLite.distDisplayObjectsDisplayObjectMod.DisplayObject[StyleProps, ParsedStyleProps] {
    def this(config: DisplayObjectConfig[StyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "DisplayObjectPool")
  @js.native
  open class DisplayObjectPool ()
    extends typings.antvGLite.distDisplayObjectsDisplayObjectPoolMod.DisplayObjectPool
  
  @JSImport("@antv/g-lite/dist/display-objects", "Ellipse")
  @js.native
  open class Ellipse ()
    extends typings.antvGLite.distDisplayObjectsEllipseMod.Ellipse {
    def this(param0: DisplayObjectConfig[EllipseStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Group")
  @js.native
  open class Group ()
    extends typings.antvGLite.distDisplayObjectsGroupMod.Group {
    def this(param0: DisplayObjectConfig[GroupStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "HTML")
  @js.native
  open class HTML ()
    extends typings.antvGLite.distDisplayObjectsHtmlMod.HTML {
    def this(param0: DisplayObjectConfig[HTMLStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Image")
  @js.native
  open class Image ()
    extends typings.antvGLite.distDisplayObjectsImageMod.Image {
    def this(param0: DisplayObjectConfig[ImageStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Line")
  @js.native
  open class Line ()
    extends typings.antvGLite.distDisplayObjectsLineMod.Line {
    def this(param0: DisplayObjectConfig[LineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Path")
  @js.native
  open class Path ()
    extends typings.antvGLite.distDisplayObjectsPathMod.Path {
    def this(param0: DisplayObjectConfig[PathStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polygon")
  @js.native
  open class Polygon ()
    extends typings.antvGLite.distDisplayObjectsPolygonMod.Polygon {
    def this(param0: DisplayObjectConfig[PolygonStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Polyline")
  @js.native
  open class Polyline ()
    extends typings.antvGLite.distDisplayObjectsPolylineMod.Polyline {
    def this(param0: DisplayObjectConfig[PolylineStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Rect")
  @js.native
  open class Rect ()
    extends typings.antvGLite.distDisplayObjectsRectMod.Rect {
    def this(param0: DisplayObjectConfig[RectStyleProps]) = this()
  }
  
  @JSImport("@antv/g-lite/dist/display-objects", "Text")
  @js.native
  /**
    * @see https://developer.mozilla.org/en-US/docs/Web/API/SVGTextContentElement#constants
    */
  open class Text ()
    extends typings.antvGLite.distDisplayObjectsTextMod.Text {
    def this(param0: DisplayObjectConfig[TextStyleProps]) = this()
  }
}
