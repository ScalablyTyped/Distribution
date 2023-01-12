package typings.antvG2

import typings.antvG2.antvG2Strings.x
import typings.antvG2.antvG2Strings.y
import typings.antvG2.libDependentsMod.Coordinate
import typings.antvG2.libInterfaceMod.CoordinateOption
import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartControllerCoordinateMod {
  
  @JSImport("@antv/g2/lib/chart/controller/coordinate", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CoordinateController {
    def this(option: CoordinateOption) = this()
    
    /**
      * 更新坐标系对象
      * @param start 起始位置
      * @param end   结束位置
      * @return 坐标系实例
      */
    /* CompleteClass */
    override def adjust(start: Point, end: Point): Coordinate = js.native
    
    /* private */ /* CompleteClass */
    var coordinate: Any = js.native
    
    /**
      * 创建坐标系对象
      * @param start 起始位置
      * @param end   结束位置
      * @return 坐标系实例
      */
    /* CompleteClass */
    override def create(start: Point, end: Point): Coordinate = js.native
    
    /**
      * coordinate 实例执行 actions
      * @params includeActions 如果没有指定，则执行全部，否则，执行指定的 action
      */
    /* private */ /* CompleteClass */
    var execActions: Any = js.native
    
    /**
      * 获得 coordinate 实例
      */
    /* CompleteClass */
    override def getCoordinate(): Coordinate = js.native
    
    /**
      * 获取配置
      */
    /* CompleteClass */
    override def getOption(): CoordinateOption = js.native
    
    /**
      * 是否存在某一个 action
      * @param actionName
      */
    /* CompleteClass */
    override def hasAction(actionName: String): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var option: Any = js.native
    
    /**
      * 镜像
      * @param dim
      */
    /* CompleteClass */
    override def reflect(dim: x | y): this.type = js.native
    
    /**
      * 旋转弧度
      * @param angle
      */
    /* CompleteClass */
    override def rotate(angle: Double): this.type = js.native
    
    /**
      * scale
      * @param sx
      * @param sy
      */
    /* CompleteClass */
    override def scale(sx: Double, sy: Double): this.type = js.native
    
    /**
      * 对角变换
      */
    /* CompleteClass */
    override def transpose(): this.type = js.native
    
    /**
      * 更新配置
      * @param option
      */
    /* CompleteClass */
    override def update(option: CoordinateOption): this.type = js.native
    
    /**
      * 包装配置的默认值
      * @param option
      */
    /* private */ /* CompleteClass */
    var wrapperOption: Any = js.native
  }
  
  trait CoordinateController extends StObject {
    
    /**
      * 更新坐标系对象
      * @param start 起始位置
      * @param end   结束位置
      * @return 坐标系实例
      */
    def adjust(start: Point, end: Point): Coordinate
    
    /* private */ var coordinate: Any
    
    /**
      * 创建坐标系对象
      * @param start 起始位置
      * @param end   结束位置
      * @return 坐标系实例
      */
    def create(start: Point, end: Point): Coordinate
    
    /**
      * coordinate 实例执行 actions
      * @params includeActions 如果没有指定，则执行全部，否则，执行指定的 action
      */
    /* private */ var execActions: Any
    
    /**
      * 获得 coordinate 实例
      */
    def getCoordinate(): Coordinate
    
    /**
      * 获取配置
      */
    def getOption(): CoordinateOption
    
    /**
      * 是否存在某一个 action
      * @param actionName
      */
    def hasAction(actionName: String): Boolean
    
    /* private */ var option: Any
    
    /**
      * 镜像
      * @param dim
      */
    def reflect(dim: x | y): this.type
    
    /**
      * 旋转弧度
      * @param angle
      */
    def rotate(angle: Double): this.type
    
    /**
      * scale
      * @param sx
      * @param sy
      */
    def scale(sx: Double, sy: Double): this.type
    
    /**
      * 对角变换
      */
    def transpose(): this.type
    
    /**
      * 更新配置
      * @param option
      */
    def update(option: CoordinateOption): this.type
    
    /**
      * 包装配置的默认值
      * @param option
      */
    /* private */ var wrapperOption: Any
  }
  object CoordinateController {
    
    inline def apply(
      adjust: (Point, Point) => Coordinate,
      coordinate: Any,
      create: (Point, Point) => Coordinate,
      execActions: Any,
      getCoordinate: () => Coordinate,
      getOption: () => CoordinateOption,
      hasAction: String => Boolean,
      option: Any,
      reflect: x | y => CoordinateController,
      rotate: Double => CoordinateController,
      scale: (Double, Double) => CoordinateController,
      transpose: () => CoordinateController,
      update: CoordinateOption => CoordinateController,
      wrapperOption: Any
    ): CoordinateController = {
      val __obj = js.Dynamic.literal(adjust = js.Any.fromFunction2(adjust), coordinate = coordinate.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), execActions = execActions.asInstanceOf[js.Any], getCoordinate = js.Any.fromFunction0(getCoordinate), getOption = js.Any.fromFunction0(getOption), hasAction = js.Any.fromFunction1(hasAction), option = option.asInstanceOf[js.Any], reflect = js.Any.fromFunction1(reflect), rotate = js.Any.fromFunction1(rotate), scale = js.Any.fromFunction2(scale), transpose = js.Any.fromFunction0(transpose), update = js.Any.fromFunction1(update), wrapperOption = wrapperOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinateController]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoordinateController] (val x: Self) extends AnyVal {
      
      inline def setAdjust(value: (Point, Point) => Coordinate): Self = StObject.set(x, "adjust", js.Any.fromFunction2(value))
      
      inline def setCoordinate(value: Any): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCreate(value: (Point, Point) => Coordinate): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setExecActions(value: Any): Self = StObject.set(x, "execActions", value.asInstanceOf[js.Any])
      
      inline def setGetCoordinate(value: () => Coordinate): Self = StObject.set(x, "getCoordinate", js.Any.fromFunction0(value))
      
      inline def setGetOption(value: () => CoordinateOption): Self = StObject.set(x, "getOption", js.Any.fromFunction0(value))
      
      inline def setHasAction(value: String => Boolean): Self = StObject.set(x, "hasAction", js.Any.fromFunction1(value))
      
      inline def setOption(value: Any): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      inline def setReflect(value: typings.antvG2.antvG2Strings.x | y => CoordinateController): Self = StObject.set(x, "reflect", js.Any.fromFunction1(value))
      
      inline def setRotate(value: Double => CoordinateController): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
      
      inline def setScale(value: (Double, Double) => CoordinateController): Self = StObject.set(x, "scale", js.Any.fromFunction2(value))
      
      inline def setTranspose(value: () => CoordinateController): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: CoordinateOption => CoordinateController): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setWrapperOption(value: Any): Self = StObject.set(x, "wrapperOption", value.asInstanceOf[js.Any])
    }
  }
}
