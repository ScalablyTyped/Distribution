package typings.atAsymmetrikLeafletDashD3.leafletMod

import typings.atAsymmetrikLeafletDashD3.leafletMod.internal.ObjectFn
import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
	 * Hexbins
	 */
@js.native
trait HexbinLayer extends Layer {
  def colorRange(): js.Array[String] = js.native
  def colorRange(v: js.Array[String]): this.type = js.native
  def colorScale(): js.Any = js.native
  def colorScale(v: js.Any): this.type = js.native
  def colorScaleExtent(): js.Tuple2[Double, Double] = js.native
  def colorScaleExtent(v: js.Tuple2[Double, Double]): this.type = js.native
  def colorValue(): ObjectFn[Double] = js.native
  def colorValue(v: ObjectFn[Double]): this.type = js.native
  def data(): js.Array[_] = js.native
  def data(v: js.Array[_]): this.type = js.native
  def dispatch(): js.Any = js.native
  def duration(): Double = js.native
  def duration(v: Double): this.type = js.native
  def fill(): ObjectFn[String] = js.native
  def fill(v: ObjectFn[String]): this.type = js.native
  def getLatLngs(): js.Array[_] = js.native
  def hoverHandler(): HexbinHoverHandler = js.native
  def hoverHandler(v: HexbinHoverHandler): this.type = js.native
  def lat(): ObjectFn[Double] = js.native
  def lat(v: ObjectFn[Double]): this.type = js.native
  def lng(): ObjectFn[Double] = js.native
  def lng(v: ObjectFn[Double]): this.type = js.native
  def opacity(): Double = js.native
  def opacity(v: Double): this.type = js.native
  def radius(): Double = js.native
  def radius(v: Double): this.type = js.native
  def radiusRange(): js.Array[Double] = js.native
  def radiusRange(v: js.Array[Double]): this.type = js.native
  def radiusScale(): js.Any = js.native
  def radiusScale(v: js.Any): this.type = js.native
  def radiusScaleExtent(): js.Tuple2[Double, Double] = js.native
  def radiusScaleExtent(v: js.Tuple2[Double, Double]): this.type = js.native
  def radiusValue(): ObjectFn[Double] = js.native
  def radiusValue(v: ObjectFn[Double]): this.type = js.native
  def redraw(): Unit = js.native
  def toGeoJSON(): js.Array[_] = js.native
}

@JSImport("leaflet", "hexbinLayer")
@js.native
object hexbinLayer extends js.Object {
  def apply(): HexbinLayer = js.native
  def apply(config: HexbinLayerConfig): HexbinLayer = js.native
}

