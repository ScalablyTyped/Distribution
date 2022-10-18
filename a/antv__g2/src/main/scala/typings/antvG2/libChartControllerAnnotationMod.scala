package typings.antvG2

import typings.antvG2.libChartControllerBaseMod.Controller
import typings.antvG2.libChartViewMod.View
import typings.antvG2.libInterfaceMod.AnnotationBaseOption
import typings.antvG2.libInterfaceMod.ArcOption
import typings.antvG2.libInterfaceMod.DataMarkerOption
import typings.antvG2.libInterfaceMod.DataRegionOption
import typings.antvG2.libInterfaceMod.HtmlAnnotationOption
import typings.antvG2.libInterfaceMod.ImageOption
import typings.antvG2.libInterfaceMod.LineOption
import typings.antvG2.libInterfaceMod.RegionFilterOption
import typings.antvG2.libInterfaceMod.RegionOption
import typings.antvG2.libInterfaceMod.ShapeAnnotationOption
import typings.antvG2.libInterfaceMod.TextOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerAnnotationMod {
  
  @JSImport("@antv/g2/lib/chart/controller/annotation", JSImport.Default)
  @js.native
  open class default protected () extends Annotation {
    def this(view: View) = this()
  }
  
  @js.native
  trait Annotation
    extends Controller[js.Array[AnnotationBaseOption]] {
    
    def annotation(option: Any): Unit = js.native
    
    /**
      * 创建 Arc
      * @param option
      * @returns AnnotationController
      */
    def arc(option: ArcOption): this.type = js.native
    
    /* private */ var backgroundContainer: Any = js.native
    
    /* private */ var cache: Any = js.native
    
    /**
      * 清除当前的组件
      */
    /* private */ var clearComponents: Any = js.native
    
    /* private */ var createAnnotation: Any = js.native
    
    /**
      * 创建 DataMarker
      * @param option
      * @returns AnnotationController
      */
    def dataMarker(option: DataMarkerOption): this.type = js.native
    
    /**
      * 创建 DataRegion
      * @param option
      * @returns AnnotationController
      */
    def dataRegion(option: DataRegionOption): Unit = js.native
    
    /* private */ var foregroundContainer: Any = js.native
    
    /**
      * get annotation component config by different type
      * @param type
      * @param option 用户的配置
      * @param theme
      */
    /* private */ var getAnnotationCfg: Any = js.native
    
    /* private */ var getAnnotationTheme: Any = js.native
    
    /**
      * 获得缓存组件的 key
      * @param option
      */
    /* private */ var getCacheKey: Any = js.native
    
    /**
      * get the container by option.top
      * default is on top
      * @param option
      * @returns the container
      */
    /* private */ var getComponentContainer: Any = js.native
    
    /**
      * get coordinate bbox
      */
    /* private */ var getCoordinateBBox: Any = js.native
    
    /**
      * parse all the points between start and end
      * @param start
      * @param end
      * @return Point[]
      */
    /* private */ var getRegionPoints: Any = js.native
    
    /**
      * 创建 HtmlAnnotation
      * @param option
      */
    def html(option: HtmlAnnotationOption): Unit = js.native
    
    /**
      * 创建 image
      * @param option
      * @returns AnnotationController
      */
    def image(option: ImageOption): this.type = js.native
    
    /**
      * is annotation render on top
      * @param option
      * @return whethe on top
      */
    /* private */ var isTop: Any = js.native
    
    /**
      * 创建 Line
      * @param option
      * @returns AnnotationController
      */
    def line(option: LineOption): this.type = js.native
    
    /**
      * region filter 比较特殊的渲染时机
      * @param doWhat
      */
    /* private */ var onAfterRender: Any = js.native
    
    /**
      * parse percent position
      * @param position
      */
    /* private */ var parsePercentPosition: Any = js.native
    
    /**
      * parse the point position to [x, y]
      * @param p Position
      * @returns { x, y }
      */
    /* private */ var parsePosition: Any = js.native
    
    /**
      * 创建 Region
      * @param option
      * @returns AnnotationController
      */
    def region(option: RegionOption): this.type = js.native
    
    /**
      * 创建 RegionFilter
      * @param option
      * @returns AnnotationController
      */
    def regionFilter(option: RegionFilterOption): Unit = js.native
    
    /**
      * 创建 ShapeAnnotation
      * @param option
      */
    def shape(option: ShapeAnnotationOption): Unit = js.native
    
    /**
      * 更新缓存，以及销毁组件
      * @param updated 更新或者创建的组件
      */
    /* private */ var syncCache: Any = js.native
    
    /**
      * 创建 Text
      * @param option
      * @returns AnnotationController
      */
    def text(option: TextOption): this.type = js.native
    
    /**
      * 创建或者更新 annotation
      * @param option
      */
    /* private */ var updateOrCreate: Any = js.native
  }
}
