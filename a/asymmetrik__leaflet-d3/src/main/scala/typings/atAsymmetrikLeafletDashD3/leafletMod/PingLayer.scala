package typings.atAsymmetrikLeafletDashD3.leafletMod

import typings.atAsymmetrikLeafletDashD3.leafletMod.internal.ObjectFn
import typings.leaflet.leafletMod.Layer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*
	 * Pings
	 */
@js.native
trait PingLayer extends Layer {
  def data(): js.Array[_] = js.native
  def duration(): Double = js.native
  def duration(v: Double): this.type = js.native
  def fps(): Double = js.native
  def fps(v: Double): this.type = js.native
  def getActualFps(): Double = js.native
  def lat(): ObjectFn[Double] = js.native
  def lat(v: ObjectFn[Double]): this.type = js.native
  def lng(): ObjectFn[Double] = js.native
  def lng(v: ObjectFn[Double]): this.type = js.native
  def opacityRange(): js.Array[Double] = js.native
  def opacityRange(v: js.Array[Double]): this.type = js.native
  def opacityScale(): js.Any = js.native
  def opacityScale(v: js.Any): this.type = js.native
  def ping(data: js.Any): this.type = js.native
  def ping(data: js.Any, cssClass: String): this.type = js.native
  def radiusRange(): js.Array[Double] = js.native
  def radiusRange(v: js.Array[Double]): this.type = js.native
  def radiusScale(): js.Any = js.native
  def radiusScale(v: js.Any): this.type = js.native
  def radiusScaleFactor(): Double = js.native
  def radiusScaleFactor(v: Double): this.type = js.native
}

@JSImport("leaflet", "pingLayer")
@js.native
object pingLayer extends js.Object {
  def apply(): PingLayer = js.native
  def apply(config: PingLayerConfig): PingLayer = js.native
}

