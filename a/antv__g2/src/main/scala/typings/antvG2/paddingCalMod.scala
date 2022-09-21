package typings.antvG2

import typings.antvG2.constantMod.DIRECTION
import typings.antvG2.libInterfaceMod.Padding
import typings.antvGBase.typesMod.BBox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paddingCalMod {
  
  @JSImport("@antv/g2/lib/chart/layout/padding-cal", "PaddingCal")
  @js.native
  /**
    * 初始的 padding 数据
    * @param top
    * @param right
    * @param bottom
    * @param left
    */
  open class PaddingCal () extends StObject {
    def this(top: Double) = this()
    def this(top: Double, right: Double) = this()
    def this(top: Unit, right: Double) = this()
    def this(top: Double, right: Double, bottom: Double) = this()
    def this(top: Double, right: Unit, bottom: Double) = this()
    def this(top: Unit, right: Double, bottom: Double) = this()
    def this(top: Unit, right: Unit, bottom: Double) = this()
    def this(top: Double, right: Double, bottom: Double, left: Double) = this()
    def this(top: Double, right: Double, bottom: Unit, left: Double) = this()
    def this(top: Double, right: Unit, bottom: Double, left: Double) = this()
    def this(top: Double, right: Unit, bottom: Unit, left: Double) = this()
    def this(top: Unit, right: Double, bottom: Double, left: Double) = this()
    def this(top: Unit, right: Double, bottom: Unit, left: Double) = this()
    def this(top: Unit, right: Unit, bottom: Double, left: Double) = this()
    def this(top: Unit, right: Unit, bottom: Unit, left: Double) = this()
    
    /* private */ var bottom: Any = js.native
    
    /**
      * 获得最终的 padding
      */
    def getPadding(): Padding = js.native
    
    /**
      * 在某一个方向增加 padding
      * @param bbox
      * @param direction
      */
    def inc(bbox: BBox, direction: DIRECTION): PaddingCal = js.native
    
    /* private */ var left: Any = js.native
    
    /**
      * 取最大区间
      * @param padding
      */
    def max(padding: Padding): PaddingCal = js.native
    
    /* private */ var right: Any = js.native
    
    /**
      * 四周增加 padding
      * @param padding
      */
    def shrink(padding: Padding): PaddingCal = js.native
    
    /* private */ var top: Any = js.native
  }
  /* static members */
  object PaddingCal {
    
    @JSImport("@antv/g2/lib/chart/layout/padding-cal", "PaddingCal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * 使用静态方法创建一个
      * @param top
      * @param right
      * @param bottom
      * @param left
      */
    inline def instance(): PaddingCal = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[PaddingCal]
    inline def instance(top: Double): PaddingCal = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any]).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Double, bottom: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Double, bottom: Double, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Double, bottom: Unit, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Unit, bottom: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Unit, bottom: Double, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Double, right: Unit, bottom: Unit, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Double, bottom: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Double, bottom: Double, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Double, bottom: Unit, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Unit, bottom: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Unit, bottom: Double, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
    inline def instance(top: Unit, right: Unit, bottom: Unit, left: Double): PaddingCal = (^.asInstanceOf[js.Dynamic].applyDynamic("instance")(top.asInstanceOf[js.Any], right.asInstanceOf[js.Any], bottom.asInstanceOf[js.Any], left.asInstanceOf[js.Any])).asInstanceOf[PaddingCal]
  }
  
  @js.native
  trait PaddingCalCtor extends StObject {
    
    def instance(): PaddingCal = js.native
    def instance(top: Double): PaddingCal = js.native
    def instance(top: Double, right: Double): PaddingCal = js.native
    def instance(top: Double, right: Double, bottom: Double): PaddingCal = js.native
    def instance(top: Double, right: Double, bottom: Double, left: Double): PaddingCal = js.native
    def instance(top: Double, right: Double, bottom: Unit, left: Double): PaddingCal = js.native
    def instance(top: Double, right: Unit, bottom: Double): PaddingCal = js.native
    def instance(top: Double, right: Unit, bottom: Double, left: Double): PaddingCal = js.native
    def instance(top: Double, right: Unit, bottom: Unit, left: Double): PaddingCal = js.native
    def instance(top: Unit, right: Double): PaddingCal = js.native
    def instance(top: Unit, right: Double, bottom: Double): PaddingCal = js.native
    def instance(top: Unit, right: Double, bottom: Double, left: Double): PaddingCal = js.native
    def instance(top: Unit, right: Double, bottom: Unit, left: Double): PaddingCal = js.native
    def instance(top: Unit, right: Unit, bottom: Double): PaddingCal = js.native
    def instance(top: Unit, right: Unit, bottom: Double, left: Double): PaddingCal = js.native
    def instance(top: Unit, right: Unit, bottom: Unit, left: Double): PaddingCal = js.native
  }
}
