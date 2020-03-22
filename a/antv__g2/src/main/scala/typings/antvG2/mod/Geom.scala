package typings.antvG2.mod

import typings.antvG2.AnonAnimate
import typings.antvG2.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geom extends js.Object {
  def active(open: Boolean): Geom = js.native
  def adjust(adj: String): this.type = js.native
  def adjust(adjs: js.Array[_]): this.type = js.native
  def animate(opt: js.Any): Geom = js.native
  def color(col: String): this.type = js.native
  def color(`type`: String, colors: js.Array[String]): this.type = js.native
  def color(`type`: String, fun: js.Function): this.type = js.native
  def label(exe: String, func: js.Function): this.type = js.native
  def label(exe: String, opt: AnonDictkey): this.type = js.native
  def label(field: String): this.type = js.native
  def opacity(col: String): this.type = js.native
  def opacity(op: Double): this.type = js.native
  def opacity(`type`: String, func: js.Function): this.type = js.native
  def position(pos: String): this.type = js.native
  def position(pos: js.Array[String]): this.type = js.native
  def select(open: Boolean): this.type = js.native
  def select(open: Boolean, opt: AnonAnimate): this.type = js.native
  def select(opt: AnonAnimate): this.type = js.native
  def shape(shape: String): this.type = js.native
  def shape(`type`: String, colors: js.Array[String]): this.type = js.native
  def shape(`type`: String, fun: js.Function): this.type = js.native
  def size(col: String): this.type = js.native
  def size(size: Double): this.type = js.native
  def size(`type`: String, colors: js.Array[Double]): this.type = js.native
  def size(`type`: String, func: js.Function): this.type = js.native
  def style(exe: String, style: js.Any): this.type = js.native
  def style(style: js.Any): this.type = js.native
  def tooltip(exe: String, func: js.Function): this.type = js.native
  def tooltip(field: String): this.type = js.native
  def tooltip(open: Boolean): this.type = js.native
}

