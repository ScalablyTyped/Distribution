package typings.antvG2

import typings.antvG2.anon.PartialBBox
import typings.antvG2.libConstantMod.DIRECTION
import typings.antvG2.libInterfaceMod.Padding
import typings.antvG2.libInterfaceMod.Point
import typings.antvG2.libInterfaceMod.Region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilBboxMod {
  
  @JSImport("@antv/g2/lib/util/bbox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2/lib/util/bbox", "BBox")
  @js.native
  open class BBox () extends StObject {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
    
    /**
      * 取并集
      * @param subBBox
      */
    def add(subBBox: BBox*): BBox = js.native
    
    def bl: Point = js.native
    
    def bottom: Point = js.native
    
    def br: Point = js.native
    
    /**
      * 是否碰撞
      * @param bbox
      */
    def collide(bbox: BBox): Boolean = js.native
    
    /**
      * 是否包含了另一个包围盒
      * @param child
      */
    def contains(child: BBox): Boolean = js.native
    
    /**
      * bbox 剪裁
      * @param subBBox
      * @param direction
      */
    def cut(subBBox: BBox, direction: DIRECTION): BBox = js.native
    
    /**
      * get the gap of two bbox, if not exceed, then 0
      * @param bbox
      * @returns [top, right, bottom, left]
      */
    def exceed(bbox: BBox): Padding = js.native
    
    /**
      * 扩张形成新的
      * @param gap
      */
    def expand(gap: Padding): BBox = js.native
    
    /** 包围盒高度 */
    var height: Double = js.native
    
    /**
      * 包围盒是否相等
      * @param {BBox} bbox 包围盒
      * @returns      包围盒是否相等
      */
    def isEqual(bbox: BBox): Boolean = js.native
    
    /**
      * 点是否在 bbox 中
      * @param p
      */
    def isPointIn(p: Point): Boolean = js.native
    
    def left: Point = js.native
    
    def maxX: Double = js.native
    
    def maxY: Double = js.native
    
    /**
      * 取交集
      * @param subBBox
      */
    def merge(subBBox: BBox*): BBox = js.native
    
    def minX: Double = js.native
    
    def minY: Double = js.native
    
    def right: Point = js.native
    
    /**
      * 收缩形成新的
      * @param gap
      */
    def shrink(gap: Padding): BBox = js.native
    
    /**
      * 获取包围盒大小
      * @returns 包围盒大小
      */
    def size(): Double = js.native
    
    def tl: Point = js.native
    
    def top: Point = js.native
    
    def tr: Point = js.native
    
    /** 包围盒宽度 */
    var width: Double = js.native
    
    /** x 轴坐标系 */
    var x: Double = js.native
    
    /** y 轴坐标系 */
    var y: Double = js.native
  }
  /* static members */
  object BBox {
    
    @JSImport("@antv/g2/lib/util/bbox", "BBox")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(bbox: typings.antvGBase.libTypesMod.BBox): BBox = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(bbox.asInstanceOf[js.Any]).asInstanceOf[BBox]
    
    inline def fromRange(minX: Double, minY: Double, maxX: Double, maxY: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRange")(minX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any])).asInstanceOf[BBox]
  }
  
  inline def getRegionBBox(bbox: BBox, region: Region): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegionBBox")(bbox.asInstanceOf[js.Any], region.asInstanceOf[js.Any])).asInstanceOf[BBox]
  
  inline def toPoints(bbox: PartialBBox): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toPoints")(bbox.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
