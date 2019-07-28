package typings.asciiDashArt.asciiDashArtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Art extends js.Object {
  @JSName("artwork")
  var artwork_Original: ArtworkType = js.native
  @JSName("font")
  var font_Original: FontType = js.native
  @JSName("image")
  var image_Original: ImageType = js.native
  @JSName("join")
  var join_Original: JoinType = js.native
  @JSName("lines")
  var lines_Original: LinesType = js.native
  @JSName("overlay")
  var overlay_Original: OverlayType = js.native
  @JSName("style")
  var style_Original: StyleType = js.native
  @JSName("table")
  var table_Original: TableType = js.native
  var working: Boolean = js.native
  def artwork(options: js.Object): Art = js.native
  def artwork(options: js.Object, callback: Cb): Art = js.native
  def font(text: String): Art = js.native
  def font(text: String, font: String): Art = js.native
  def font(text: String, font: String, styleOrCallback: String): Art = js.native
  def font(text: String, font: String, styleOrCallback: String, callback: Cb): Art = js.native
  def font(text: String, font: String, styleOrCallback: Cb): Art = js.native
  def font(text: String, font: String, styleOrCallback: Cb, callback: Cb): Art = js.native
  def image(options: js.Object): Art = js.native
  def image(options: js.Object, callback: Cb): Art = js.native
  def join(options: js.Any*): Art = js.native
  def lines(options: js.Any*): Art = js.native
  def overlay(options: js.Any*): Art = js.native
  def style(text: String): Art = js.native
  def style(text: String, style: String): Art = js.native
  def style(text: String, style: String, close: Boolean): Art = js.native
  def table(options: js.Object): Art = js.native
  def table(options: js.Object, callback: Cb): Art = js.native
  def toPromise(): js.Promise[String] = js.native
}

