package typings.antvG2.mod

import typings.antvG2.anon.EndAngle
import typings.antvG2.anon.X
import typings.antvG2.antvG2Strings.helix
import typings.antvG2.antvG2Strings.polar
import typings.antvG2.antvG2Strings.rect
import typings.antvG2.antvG2Strings.theta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g2", "BashView")
@js.native
class BashView () extends js.Object {
  
  def animate(option: Boolean): Unit = js.native
  
  def area(): Geom = js.native
  
  def areaStack(): Geom = js.native
  
  def axis(field: String, axisConfig: ChartAxisConfig): this.type = js.native
  def axis(field: String, option: Boolean): this.type = js.native
  def axis(option: Boolean): this.type = js.native
  
  def changeData(data: js.Any): Unit = js.native
  
  def changeVisible(visible: String): Unit = js.native
  
  def clear(): Unit = js.native
  
  @JSName("coord")
  def coord_helix(`type`: helix): Coordinate = js.native
  @JSName("coord")
  def coord_helix(`type`: helix, coordConfig: EndAngle): Coordinate = js.native
  @JSName("coord")
  def coord_polar(`type`: polar): Coordinate = js.native
  @JSName("coord")
  def coord_polar(`type`: polar, coordConfig: EndAngle): Coordinate = js.native
  @JSName("coord")
  def coord_rect(`type`: rect): Coordinate = js.native
  @JSName("coord")
  def coord_rect(`type`: rect, coordConfig: EndAngle): Coordinate = js.native
  @JSName("coord")
  def coord_theta(`type`: theta): Coordinate = js.native
  @JSName("coord")
  def coord_theta(`type`: theta, coordConfig: EndAngle): Coordinate = js.native
  
  def destroy(): Unit = js.native
  
  def edge(): Geom = js.native
  
  def filter(field: String, callback: js.Function1[/* value */ String | Double, Boolean]): this.type = js.native
  
  def getXScale[T](): T = js.native
  
  def getXY(): X = js.native
  
  def getYScales[T](): js.Array[T] = js.native
  
  def guide(): ChartGuide = js.native
  
  def heatmap(): Geom = js.native
  
  def interval(): Geom = js.native
  
  def intervalDodge(): Geom = js.native
  
  def intervalStack(): Geom = js.native
  
  def intervalSymmetric(): Geom = js.native
  
  def line(): Geom = js.native
  
  def path(): Geom = js.native
  
  def point(): Geom = js.native
  
  def pointDodge(): Geom = js.native
  
  def pointJitter(): Geom = js.native
  
  def pointStack(): Geom = js.native
  
  def polygon(): Geom = js.native
  
  def repaint(): Unit = js.native
  
  def scale(field: String, scaleConfig: js.Any): this.type = js.native
  def scale(scaleConfig: js.Any): this.type = js.native
  
  def schema(): Geom = js.native
  
  def schemaDodge(): Geom = js.native
  
  def source(data: js.Any): this.type = js.native
  def source(data: js.Any, scaleConfig: js.Any): this.type = js.native
}
