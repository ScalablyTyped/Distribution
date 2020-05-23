package typings.aliApp.my

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 动画实例可以调用以下方法来描述动画，调用结束后会返回自身，支持链式调用的写法。 */
@js.native
trait Animation extends js.Object {
  /** 颜色值 */
  def backgroundColor(color: String): Animation = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def bottom(length: Double): Animation = js.native
  /**
    * 导出动画操作
    *
    * 注意: export 方法每次调用后会清掉之前的动画操作
    */
  def export(): Animator = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def height(length: Double): Animation = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def left(length: Double): Animation = js.native
  /**
    * 同transform-function matrix
    */
  def matrix(a: Double, b: Double, c: Double, d: Double, tx: Double, ty: Double): Animation = js.native
  /** 同transform-function matrix3d */
  def matrix3d(
    a1: Double,
    b1: Double,
    c1: Double,
    d1: Double,
    a2: Double,
    b2: Double,
    c2: Double,
    d2: Double,
    a3: Double,
    b3: Double,
    c3: Double,
    d3: Double,
    a4: Double,
    b4: Double,
    c4: Double,
    d4: Double
  ): Animation = js.native
  /** 透明度，参数范围 0~1 */
  def opacity(value: Double): Animation = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def right(length: Double): Animation = js.native
  /** deg的范围-180~180，从原点顺时针旋转一个deg角度 */
  def rotate(deg: Double): Animation = js.native
  /** 同transform-function rotate3d */
  def rotate3d(x: Double, y: Double, z: Double, deg: Double): Animation = js.native
  /** deg的范围-180~180，在X轴旋转一个deg角度 */
  def rotateX(deg: Double): Animation = js.native
  /** deg的范围-180~180，在Y轴旋转一个deg角度 */
  def rotateY(deg: Double): Animation = js.native
  /** deg的范围-180~180，在Z轴旋转一个deg角度 */
  def rotateZ(deg: Double): Animation = js.native
  /**
    * 一个参数时，表示在X轴、Y轴同时缩放sx倍数；
    * 两个参数时表示在X轴缩放sx倍数，在Y轴缩放sy倍数
    */
  def scale(sx: Double): Animation = js.native
  def scale(sx: Double, sy: Double): Animation = js.native
  /** 在X轴缩放sx倍数，在Y轴缩放sy倍数，在Z轴缩放sz倍数 */
  def scale3d(sx: Double, sy: Double, sz: Double): Animation = js.native
  /** 在X轴缩放sx倍数 */
  def scaleX(sx: Double): Animation = js.native
  /** 在Y轴缩放sy倍数 */
  def scaleY(sy: Double): Animation = js.native
  /** 在Z轴缩放sy倍数 */
  def scaleZ(sz: Double): Animation = js.native
  /**
    * 参数范围-180~180；
    * 一个参数时，Y轴坐标不变，X轴坐标延顺时针倾斜ax度；
    * 两个参数时，分别在X轴倾斜ax度，在Y轴倾斜ay度
    */
  def skew(ax: Double): Animation = js.native
  def skew(ax: Double, ay: Double): Animation = js.native
  /** 参数范围-180~180；Y轴坐标不变，X轴坐标延顺时针倾斜ax度 */
  def skewX(ax: Double): Animation = js.native
  /** 参数范围-180~180；X轴坐标不变，Y轴坐标延顺时针倾斜ay度 */
  def skewY(ay: Double): Animation = js.native
  /**
    * 调用动画操作方法后要调用 step() 来表示一组动画完成，
    * 可以在一组动画中调用任意多个动画方法，
    * 一组动画中的所有动画会同时开始，
    * 一组动画完成后才会进行下一组动画。
    * @param options 指定当前组动画的配置
    */
  def step(): Unit = js.native
  def step(options: CreateAnimationOptions): Unit = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def top(length: Double): Animation = js.native
  /**
    * 一个参数时，表示在X轴偏移tx，单位px；
    * 两个参数时，表示在X轴偏移tx，在Y轴偏移ty，单位px。
    */
  def translate(tx: Double): Animation = js.native
  def translate(tx: Double, ty: Double): Animation = js.native
  /**
    * 在X轴偏移tx，在Y轴偏移ty，在Z轴偏移tz，单位px
    */
  def translate3d(tx: Double, ty: Double, tz: Double): Animation = js.native
  /**
    * 在X轴偏移tx，单位px
    */
  def translateX(tx: Double): Animation = js.native
  /**
    * 在Y轴偏移tx，单位px
    */
  def translateY(ty: Double): Animation = js.native
  /**
    * 在Z轴偏移tx，单位px
    */
  def translateZ(tz: Double): Animation = js.native
  /** 长度值，如果传入 Number 则默认使用 px，可传入其他自定义单位的长度值 */
  def width(length: Double): Animation = js.native
}

