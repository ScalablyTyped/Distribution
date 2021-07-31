package typings.asciiArt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ascii-art", "Figlet")
  @js.native
  val Figlet: js.Any = js.native
  
  @JSImport("ascii-art", "Image")
  @js.native
  val Image_ : js.Any = js.native
  
  @JSImport("ascii-art", "artwork")
  @js.native
  val artwork: ArtworkType = js.native
  
  @JSImport("ascii-art", "font")
  @js.native
  val font: FontType = js.native
  
  @JSImport("ascii-art", "image")
  @js.native
  val image: ImageType = js.native
  
  @JSImport("ascii-art", "join")
  @js.native
  val join: JoinType = js.native
  
  @JSImport("ascii-art", "lines")
  @js.native
  val lines: LinesType = js.native
  
  @JSImport("ascii-art", "overlay")
  @js.native
  val overlay: OverlayType = js.native
  
  @JSImport("ascii-art", "strings")
  @js.native
  val strings: StringsType = js.native
  
  @JSImport("ascii-art", "style")
  @js.native
  val style: StyleType = js.native
  
  @JSImport("ascii-art", "table")
  @js.native
  val table: TableType = js.native
  
  trait Art extends StObject {
    
    def artwork(options: js.Object): Art
    def artwork(options: js.Object, callback: Cb): Art
    @JSName("artwork")
    var artwork_Original: ArtworkType
    
    def font(text: String): Art
    def font(text: String, font: String): Art
    def font(text: String, font: String, styleOrCallback: String): Art
    def font(text: String, font: String, styleOrCallback: String, callback: Cb): Art
    def font(text: String, font: String, styleOrCallback: Unit, callback: Cb): Art
    def font(text: String, font: String, styleOrCallback: Cb): Art
    def font(text: String, font: String, styleOrCallback: Cb, callback: Cb): Art
    def font(text: String, font: Unit, styleOrCallback: String): Art
    def font(text: String, font: Unit, styleOrCallback: String, callback: Cb): Art
    def font(text: String, font: Unit, styleOrCallback: Unit, callback: Cb): Art
    def font(text: String, font: Unit, styleOrCallback: Cb): Art
    def font(text: String, font: Unit, styleOrCallback: Cb, callback: Cb): Art
    @JSName("font")
    var font_Original: FontType
    
    def image(options: js.Object): Art
    def image(options: js.Object, callback: Cb): Art
    @JSName("image")
    var image_Original: ImageType
    
    def join(options: js.Any*): Art
    @JSName("join")
    var join_Original: JoinType
    
    def lines(options: js.Any*): Art
    @JSName("lines")
    var lines_Original: LinesType
    
    def overlay(options: js.Any*): Art
    @JSName("overlay")
    var overlay_Original: OverlayType
    
    def style(text: String): Art
    def style(text: String, style: String): Art
    def style(text: String, style: String, close: Boolean): Art
    def style(text: String, style: Unit, close: Boolean): Art
    @JSName("style")
    var style_Original: StyleType
    
    def table(options: js.Object): Art
    def table(options: js.Object, callback: Cb): Art
    @JSName("table")
    var table_Original: TableType
    
    def toPromise(): js.Promise[String]
    
    var working: Boolean
  }
  object Art {
    
    @scala.inline
    def apply(
      artwork: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art,
      font: (/* text */ String, /* font */ js.UndefOr[String], /* styleOrCallback */ js.UndefOr[String | Cb], /* callback */ js.UndefOr[Cb]) => Art,
      image: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art,
      join: JoinType,
      lines: LinesType,
      overlay: OverlayType,
      style: (/* text */ String, /* style */ js.UndefOr[String], /* close */ js.UndefOr[Boolean]) => Art,
      table: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art,
      toPromise: () => js.Promise[String],
      working: Boolean
    ): Art = {
      val __obj = js.Dynamic.literal(artwork = js.Any.fromFunction2(artwork), font = js.Any.fromFunction4(font), image = js.Any.fromFunction2(image), join = join.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any], style = js.Any.fromFunction3(style), table = js.Any.fromFunction2(table), toPromise = js.Any.fromFunction0(toPromise), working = working.asInstanceOf[js.Any])
      __obj.asInstanceOf[Art]
    }
    
    @scala.inline
    implicit class ArtMutableBuilder[Self <: Art] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtwork(value: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art): Self = StObject.set(x, "artwork", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFont(
        value: (/* text */ String, /* font */ js.UndefOr[String], /* styleOrCallback */ js.UndefOr[String | Cb], /* callback */ js.UndefOr[Cb]) => Art
      ): Self = StObject.set(x, "font", js.Any.fromFunction4(value))
      
      @scala.inline
      def setImage(value: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art): Self = StObject.set(x, "image", js.Any.fromFunction2(value))
      
      @scala.inline
      def setJoin(value: JoinType): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLines(value: LinesType): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlay(value: OverlayType): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: (/* text */ String, /* style */ js.UndefOr[String], /* close */ js.UndefOr[Boolean]) => Art): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTable(value: (/* options */ js.Object, /* callback */ js.UndefOr[Cb]) => Art): Self = StObject.set(x, "table", js.Any.fromFunction2(value))
      
      @scala.inline
      def setToPromise(value: () => js.Promise[String]): Self = StObject.set(x, "toPromise", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWorking(value: Boolean): Self = StObject.set(x, "working", value.asInstanceOf[js.Any])
    }
  }
  
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
  
  @js.native
  trait JoinType extends StObject {
    
    def apply(options: js.Any*): Art = js.native
  }
  
  @js.native
  trait LinesType extends StObject {
    
    def apply(options: js.Any*): Art = js.native
  }
  
  @js.native
  trait OverlayType extends StObject {
    
    def apply(options: js.Any*): Art = js.native
  }
  
  @js.native
  trait StringsType extends StObject {
    
    def apply(options: js.Any*): Art = js.native
  }
  
  type StyleType = js.Function3[
    /* text */ String, 
    /* style */ js.UndefOr[String], 
    /* close */ js.UndefOr[Boolean], 
    Art
  ]
  
  type TableType = js.Function2[/* options */ js.Object, /* callback */ js.UndefOr[Cb], Art]
}
