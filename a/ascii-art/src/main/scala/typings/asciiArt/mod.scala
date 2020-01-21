package typings.asciiArt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ascii-art", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
  
  val Figlet: js.Any = js.native
  @JSName("Image")
  val Image_ : js.Any = js.native
  val artwork: ArtworkType = js.native
  val font: FontType = js.native
  val image: ImageType = js.native
  val join: JoinType = js.native
  val lines: LinesType = js.native
  val overlay: OverlayType = js.native
  val strings: StringsType = js.native
  val style: StyleType = js.native
  val table: TableType = js.native
  type ArtworkType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type Cb = js.Function1[/* result */ String, Unit]
  type FontType = js.Function4[
    /* text */ String, 
    /* font */ js.UndefOr[String], 
    /* styleOrCallback */ js.UndefOr[String | Cb], 
    /* callback */ js.UndefOr[Cb], 
    Art
  ]
  type ImageType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
  type JoinType = js.Function1[/* repeated */ js.Any, Art]
  type LinesType = js.Function1[/* repeated */ js.Any, Art]
  type OverlayType = js.Function1[/* repeated */ js.Any, Art]
  type StringsType = js.Function1[/* repeated */ js.Any, Art]
  type StyleType = js.Function3[
    /* text */ String, 
    /* style */ js.UndefOr[String], 
    /* close */ js.UndefOr[Boolean], 
    Art
  ]
  type TableType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
}

