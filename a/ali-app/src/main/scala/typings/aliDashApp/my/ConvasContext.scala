package typings.aliDashApp.my

import typings.aliDashApp.aliDashAppStrings.alphabetic
import typings.aliDashApp.aliDashAppStrings.bevel
import typings.aliDashApp.aliDashAppStrings.bottom
import typings.aliDashApp.aliDashAppStrings.butt
import typings.aliDashApp.aliDashAppStrings.center
import typings.aliDashApp.aliDashAppStrings.end
import typings.aliDashApp.aliDashAppStrings.hanging
import typings.aliDashApp.aliDashAppStrings.ideographic
import typings.aliDashApp.aliDashAppStrings.left
import typings.aliDashApp.aliDashAppStrings.middle
import typings.aliDashApp.aliDashAppStrings.miter
import typings.aliDashApp.aliDashAppStrings.right
import typings.aliDashApp.aliDashAppStrings.round
import typings.aliDashApp.aliDashAppStrings.square
import typings.aliDashApp.aliDashAppStrings.start
import typings.aliDashApp.aliDashAppStrings.top
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConvasContext extends js.Object {
  var font: String = js.native
  /**
  		 * 画一条弧线。
  		 * 创建一个圆可以用 arc() 方法指定其实弧度为0，终止弧度为 2 * Math.PI。
  		 *
  		 * @param x
  		 * @param y
  		 * @param r
  		 * @param sAngle
  		 * @param eAngle
  		 */
  def arc(x: Double, y: Double, r: Double, sAngle: Double, eAngle: Double): Unit = js.native
  /**
  		 * 关闭一个路径
  		 * 关闭路径会连接起点和终点。
  		 * 如果关闭路径后没有调用 fill() 或者 stroke() 并开启了新的路径，那之前的路径将不会被渲染。
  		 */
  def beginPath(): Unit = js.native
  /**
  		 * 创建三次方贝塞尔曲线路径。
  		 * 曲线的起始点为路径中前一个点。
  		 * @param cp1x
  		 * @param cp1y
  		 * @param cp2x
  		 * @param cp2y
  		 * @param x
  		 * @param y
  		 */
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  /**
  		 * 清除画布上在该矩形区域内的内容。
  		 * clearRect 并非画一个白色的矩形在地址区域，而是清空，为了有直观感受，可以对 canvas 加了一层背景色。
  		 * @param x 矩形左上角的 x 坐标
  		 * @param y 矩形左上角的 y 坐标
  		 * @param width 矩形路径宽度
  		 * @param height 矩形路径高度
  		 */
  def clearRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  		 * 将当前创建的路径设置为当前剪切路径。
  		 *
  		 */
  def clip(): Unit = js.native
  /**
  		 * 关闭一个路径
  		 * 关闭路径会连接起点和终点。
  		 *
  		 */
  def closePath(): Unit = js.native
  /**
  		 * 创建一个圆形的渐变色。
  		 * 起点在圆心，终点在圆环。
  		 * 需要使用 addColorStop() 来指定渐变点，至少需要两个。
  		 * @param x 圆心 x 坐标
  		 * @param y 圆心 y 坐标
  		 * @param r 圆半径
  		 * @returns
  		 */
  def createCircularGradient(x: Double, y: Double, r: Double): CanvasAction = js.native
  /**
  		 * 创建一个线性的渐变色。
  		 *
  		 * @param x0 起点 x 坐标
  		 * @param y0 起点 y 坐标
  		 * @param x1 终点 x 坐标
  		 * @param y1 终点 y 坐标
  		 */
  def createLinearGradient(x0: Double, y0: Double, x1: Double, y1: Double): CanvasAction = js.native
  /**
  		 * 将之前在绘图上下文中的描述（路径、变形、样式）画到 canvas 中。
  		 * 绘图上下文需要由 my.createCanvasContext(canvasId) 来创建。
  		 * @param [reserve] 本次绘制是否接着上一次绘制，即 reserve 参数为 false 时则在本次调用 drawCanvas绘制之前 native 层应先清空画布再继续绘制；若 reserver 参数为true 时，则保留当前画布上的内容，本次调用drawCanvas绘制的内容覆盖在上面，默认 false
  		 */
  def draw(): Unit = js.native
  def draw(reserve: Boolean): Unit = js.native
  /**
  		 * 绘制图像，图像保持原始尺寸。
  		 *
  		 * @param imageResource 图片资源, 只支持线上 cdn 地址或离线包地址，线上 cdn 需返回头 Access-Control-Allow-Origin: *
  		 * @param x 图像左上角 x 坐标
  		 * @param y 图像左上角 y 坐标
  		 * @param width 图像宽度
  		 * @param height 图像高度
  		 */
  def drawImage(imageResource: String, x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  		 * 对当前路径中的内容进行填充。默认的填充色为黑色。
  		 *
  		 */
  def fill(): Unit = js.native
  /**
  		 * 填充矩形。
  		 * 用 setFillStyle() 设置矩形的填充色，如果没设置则默认是 black。
  		 * @param x 矩形左上角的 x 坐标
  		 * @param y 矩形左上角的 y 坐标
  		 * @param width 矩形路径宽度
  		 * @param height 矩形路径高度
  		 */
  def fillRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  		 * 在画布上绘制被填充的文本。
  		 *
  		 * @param text 文本
  		 * @param x 绘制文本的左上角 x 坐标
  		 * @param y 绘制文本的左上角 y 坐标
  		 */
  def fillText(text: String, x: Double, y: Double): Unit = js.native
  /**
  		 * lineTo 方法增加一个新点，然后创建一条从上次指定点到目标点的线。
  		 * 用 stroke() 方法来画线条
  		 *
  		 * @param x 目标位置 x 坐标
  		 * @param y 目标位置 y 坐标
  		 */
  def lineTo(x: Double, y: Double): Unit = js.native
  def measureText(text: String): TextMetrics = js.native
  /**
  		 * 把路径移动到画布中的指定点，不创建线条。
  		 * 用 stroke() 方法来画线条
  		 * @param x 目标位置 x 坐标
  		 * @param y 目标位置 y 坐标
  		 */
  def moveTo(x: Double, y: Double): Unit = js.native
  /**
  		 * 创建二次贝塞尔曲线路径。
  		 * 曲线的起始点为路径中前一个点。
  		 * @param cpx 贝塞尔控制点 x 坐标
  		 * @param cpy 贝塞尔控制点 y 坐标
  		 * @param x 结束点 x 坐标
  		 * @param y 结束点 y 坐标
  		 */
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  /**
  		 * 创建一个矩形。
  		 *
  		 * @param x 矩形左上角的 x 坐标
  		 * @param y 矩形左上角的 y 坐标
  		 * @param width 矩形路径宽度
  		 * @param height 矩形路径高度
  		 */
  def rect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  		 * 恢复之前保存的绘图上下文。
  		 */
  def restore(): Unit = js.native
  /**
  		 * 以原点为中心，原点可以用 translate方法修改。顺时针旋转当前坐标轴。多次调用rotate，旋转的角度会叠加。
  		 *
  		 * @param rotate 旋转角度，以弧度计(degrees * Math.PI/180；degrees 范围为0~360)
  		 */
  def rotate(rotate: Double): Unit = js.native
  /**
  		 * 保存当前的绘图上下文。
  		 *
  		 */
  def save(): Unit = js.native
  /**
  		 * 在调用scale方法后，之后创建的路径其横纵坐标会被缩放。多次调用scale，倍数会相乘。
  		 *
  		 * @param scaleWidth 横坐标缩放倍数 (1 = 100%，0.5 = 50%，2 = 200%)
  		 * @param scaleHeight 纵坐标轴缩放倍数 (1 = 100%，0.5 = 50%，2 = 200%)
  		 */
  def scale(scaleWidth: Double, scaleHeight: Double): Unit = js.native
  /**
  		 * 设置填充色。
  		 *
  		 * 如果没有设置 fillStyle，则默认颜色为 black。
  		 */
  def setFillStyle(color: Color): Unit = js.native
  /**
  		 * 设置字体大小。
  		 *
  		 * @param fontSize 字号
  		 */
  def setFontSize(fontSize: Double): Unit = js.native
  /**
  		 * 设置全局画笔透明度。
  		 *
  		 * @param alpha 透明度，0 表示完全透明，1 表示不透明 范围 [0, 1]
  		 */
  def setGlobalAlpha(alpha: Double): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_butt(lineCap: butt): Unit = js.native
  /**
  		 * 设置线条的端点样式。
  		 *
  		 * @param lineCap 线条的结束端点样式
  		 */
  @JSName("setLineCap")
  def setLineCap_round(lineCap: round): Unit = js.native
  @JSName("setLineCap")
  def setLineCap_square(lineCap: square): Unit = js.native
  /**
  		 * 设置虚线的样式
  		 *
  		 * @param segments 一组描述交替绘制线段和间距（坐标空间单位）长度的数字。 如果数组元素的数量是奇数， 数组的元素会被复制并重复。例如， [5, 15, 25] 会变成 [5, 15, 25, 5, 15, 25]。
  		 */
  def setLineDash(segments: js.Array[Double]): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_bevel(lineJoin: bevel): Unit = js.native
  @JSName("setLineJoin")
  def setLineJoin_miter(lineJoin: miter): Unit = js.native
  /**
  		 * 设置线条的交点样式。
  		 *
  		 * @param lineJoin 线条的结束交点样式
  		 */
  @JSName("setLineJoin")
  def setLineJoin_round(lineJoin: round): Unit = js.native
  /**
  		 * 设置线条的宽度。
  		 * @param lineWidth 线条宽度，单位为 px
  		 */
  def setLineWidth(lineWidth: Double): Unit = js.native
  /**
  		 * 设置最大斜接长度，斜接长度指的是在两条线交汇处内角和外角之间的距离。 当 setLineJoin() 为 miter 时才有效。超过最大倾斜长度的，连接处将以 lineJoin 为 bevel 来显示
  		 *
  		 * @param miterLimit 最大斜接长度
  		 */
  def setMiterLimit(miterLimit: Double): Unit = js.native
  /**
  		 * 设置阴影样式。
  		 * 如果没有设置，offsetX 的默认值为 0， offsetY 的默认值为 0， blur 的默认值为 0，color 的默认值为 black。
  		 * @param offsetX 阴影相对于形状水平方向的偏移
  		 * @param offsetY 阴影相对于形状竖直方向的偏移
  		 * @param blur 0~100 阴影的模糊级别，值越大越模糊
  		 * @param color 阴影颜色
  		 */
  def setShadow(offsetX: Double, offsetY: Double, blur: Double, color: Color): Unit = js.native
  /**
  		 * 设置边框颜色。
  		 *
  		 * 如果没有设置 strokeStyle，则默认颜色为 black。
  		 */
  def setStrokeStyle(color: Color): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_center(textAlign: center): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_end(textAlign: end): Unit = js.native
  /**
  		 * textAlign 是 Canvas 2D API 描述绘制文本时，文本的对齐方式的属性。注意，该对齐是基于
  		 * CanvasRenderingContext2D.fillText 方法的x的值。所以如果 textAlign="center"，那么该文本将画在 x-50%*width
  		 */
  @JSName("setTextAlign")
  def setTextAlign_left(textAlign: left): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_right(textAlign: right): Unit = js.native
  @JSName("setTextAlign")
  def setTextAlign_start(textAlign: start): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_alphabetic(textBaseline: alphabetic): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_bottom(textBaseline: bottom): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_hanging(textBaseline: hanging): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_ideographic(textBaseline: ideographic): Unit = js.native
  @JSName("setTextBaseline")
  def setTextBaseline_middle(textBaseline: middle): Unit = js.native
  /**
  		 * textBaseline 是 Canvas 2D API 描述绘制文本时，当前文本基线的属性。
  		 */
  @JSName("setTextBaseline")
  def setTextBaseline_top(textBaseline: top): Unit = js.native
  /**
  		 * 使用单位矩阵重新设置（覆盖）当前的变换并调用变换的方法，此变换由方法的变量进行描述。
  		 *
  		 * @param scaleX 水平缩放
  		 * @param skewX 水平倾斜
  		 * @param skewY 垂直倾斜
  		 * @param scaleY 垂直缩放
  		 * @param translateX 水平移动
  		 * @param translateY 垂直移动
  		 */
  def setTransform(
    scaleX: Double,
    skewX: Double,
    skewY: Double,
    scaleY: Double,
    translateX: Double,
    translateY: Double
  ): Unit = js.native
  /**
  		 * 画出当前路径的边框。默认 black。
  		 * stroke() 描绘的的路径是从 beginPath() 开始计算，但是不会将 strokeRect() 包含进去
  		 */
  def stroke(): Unit = js.native
  /**
  		 * 画一个矩形(非填充)。
  		 * 用 setFillStroke() 设置矩形线条的颜色，如果没设置默认是 black。
  		 * @param x 矩形左上角的 x 坐标
  		 * @param y 矩形左上角的 y 坐标
  		 * @param width 矩形路径宽度
  		 * @param height 矩形路径高度
  		 */
  def strokeRect(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  /**
  		 * 把当前画布的内容导出生成图片，并返回文件路径。
  		 */
  def toTempFilePath(): Unit = js.native
  def toTempFilePath(options: Partial[ToTempFilePathOptions]): Unit = js.native
  /**
  		 * 使用矩阵多次叠加当前变换的方法，矩阵由方法的参数进行描述。你可以缩放、旋转、移动和倾斜上下文。
  		 *
  		 * @param scaleX 水平缩放
  		 * @param skewX 水平倾斜
  		 * @param skewY 垂直倾斜
  		 * @param scaleY 垂直缩放
  		 * @param translateX 水平移动
  		 * @param translateY 垂直移动
  		 */
  def transform(
    scaleX: Double,
    skewX: Double,
    skewY: Double,
    scaleY: Double,
    translateX: Double,
    translateY: Double
  ): Unit = js.native
  /**
  		 * 对当前坐标系的原点(0, 0)进行变换，默认的坐标系原点为页面左上角。
  		 *
  		 * @param x 水平坐标平移量
  		 * @param y 竖直坐标平移量
  		 */
  def translate(x: Double, y: Double): Unit = js.native
}

