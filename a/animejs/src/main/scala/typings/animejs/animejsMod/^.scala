package typings.animejs.animejsMod

import org.scalablytyped.runtime.StringDictionary
import typings.animejs.Anon_El
import typings.std.HTMLElement
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("animejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val running: js.Array[AnimeInstance] = js.native
  val speed: Double = js.native
  // Helpers
  val version: String = js.native
  def apply(params: AnimeParams): AnimeInstance = js.native
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): js.Function1[/* t */ Double, Double] = js.native
  def get(targets: AnimeTarget, prop: String): String | Double = js.native
  def path(): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: String): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: String, percent: Double): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: Null, percent: Double): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: HTMLElement): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: HTMLElement, percent: Double): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: SVGElement): js.Function1[/* prop */ String, Anon_El] = js.native
  def path(path: SVGElement, percent: Double): js.Function1[/* prop */ String, Anon_El] = js.native
  def random(min: Double, max: Double): Double = js.native
  def remove(targets: js.Array[AnimeTarget]): Unit = js.native
  def remove(targets: AnimeTarget): Unit = js.native
  def set(targets: AnimeTarget, value: StringDictionary[js.Any]): Unit = js.native
  def setDashoffset(): Double = js.native
  def setDashoffset(el: HTMLElement): Double = js.native
  def setDashoffset(el: SVGElement): Double = js.native
  def stagger(value: String): FunctionBasedParameter = js.native
  def stagger(value: String, options: StaggerOptions): FunctionBasedParameter = js.native
  def stagger(value: js.Array[Double | String]): FunctionBasedParameter = js.native
  def stagger(value: js.Array[Double | String], options: StaggerOptions): FunctionBasedParameter = js.native
  def stagger(value: Double): FunctionBasedParameter = js.native
  def stagger(value: Double, options: StaggerOptions): FunctionBasedParameter = js.native
  // Timeline
  def timeline(): AnimeTimelineInstance = js.native
  def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = js.native
  def timeline(params: AnimeParams): AnimeTimelineInstance = js.native
}

