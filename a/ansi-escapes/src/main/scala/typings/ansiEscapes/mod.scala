package typings.ansiEscapes

import typings.ansiEscapes.anon.Annotation
import typings.ansiEscapes.ansiEscapesStrings.auto
import typings.node.Buffer
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ansi-escapes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: remove this in the next major version
  @JSImport("ansi-escapes", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ansiEscapes */ js.Any = js.native
  
  /**
  	Output a beeping sound.
  	*/
  @JSImport("ansi-escapes", "beep")
  @js.native
  def beep: String = js.native
  @scala.inline
  def beep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("beep")(x.asInstanceOf[js.Any])
  
  /**
  	Clear the terminal screen. (Viewport)
  	*/
  @JSImport("ansi-escapes", "clearScreen")
  @js.native
  def clearScreen: String = js.native
  @scala.inline
  def clearScreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearScreen")(x.asInstanceOf[js.Any])
  
  /**
  	Clear the whole terminal, including scrollback buffer. (Not just the visible part of it)
  	*/
  @JSImport("ansi-escapes", "clearTerminal")
  @js.native
  def clearTerminal: String = js.native
  @scala.inline
  def clearTerminal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearTerminal")(x.asInstanceOf[js.Any])
  
  /**
  	Move cursor backward a specific amount of rows.
  	@param count - Count of rows to move backward. Default is `1`.
  	*/
  @JSImport("ansi-escapes", "cursorBackward")
  @js.native
  def cursorBackward(): String = js.native
  @JSImport("ansi-escapes", "cursorBackward")
  @js.native
  def cursorBackward(count: Double): String = js.native
  
  /**
  	Move cursor down a specific amount of rows.
  	@param count - Count of rows to move down. Default is `1`.
  	*/
  @JSImport("ansi-escapes", "cursorDown")
  @js.native
  def cursorDown(): String = js.native
  @JSImport("ansi-escapes", "cursorDown")
  @js.native
  def cursorDown(count: Double): String = js.native
  
  /**
  	Move cursor forward a specific amount of rows.
  	@param count - Count of rows to move forward. Default is `1`.
  	*/
  @JSImport("ansi-escapes", "cursorForward")
  @js.native
  def cursorForward(): String = js.native
  @JSImport("ansi-escapes", "cursorForward")
  @js.native
  def cursorForward(count: Double): String = js.native
  
  /**
  	Get cursor position.
  	*/
  @JSImport("ansi-escapes", "cursorGetPosition")
  @js.native
  def cursorGetPosition: String = js.native
  @scala.inline
  def cursorGetPosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorGetPosition")(x.asInstanceOf[js.Any])
  
  /**
  	Hide cursor.
  	*/
  @JSImport("ansi-escapes", "cursorHide")
  @js.native
  def cursorHide: String = js.native
  @scala.inline
  def cursorHide_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorHide")(x.asInstanceOf[js.Any])
  
  /**
  	Move cursor to the left side.
  	*/
  @JSImport("ansi-escapes", "cursorLeft")
  @js.native
  def cursorLeft: String = js.native
  @scala.inline
  def cursorLeft_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorLeft")(x.asInstanceOf[js.Any])
  
  /**
  	Set the position of the cursor relative to its current position.
  	*/
  @JSImport("ansi-escapes", "cursorMove")
  @js.native
  def cursorMove(x: Double): String = js.native
  @JSImport("ansi-escapes", "cursorMove")
  @js.native
  def cursorMove(x: Double, y: Double): String = js.native
  
  /**
  	Move cursor to the next line.
  	*/
  @JSImport("ansi-escapes", "cursorNextLine")
  @js.native
  def cursorNextLine: String = js.native
  @scala.inline
  def cursorNextLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorNextLine")(x.asInstanceOf[js.Any])
  
  /**
  	Move cursor to the previous line.
  	*/
  @JSImport("ansi-escapes", "cursorPrevLine")
  @js.native
  def cursorPrevLine: String = js.native
  @scala.inline
  def cursorPrevLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorPrevLine")(x.asInstanceOf[js.Any])
  
  /**
  	Restore saved cursor position.
  	*/
  @JSImport("ansi-escapes", "cursorRestorePosition")
  @js.native
  def cursorRestorePosition: String = js.native
  @scala.inline
  def cursorRestorePosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorRestorePosition")(x.asInstanceOf[js.Any])
  
  /**
  	Save cursor position.
  	*/
  @JSImport("ansi-escapes", "cursorSavePosition")
  @js.native
  def cursorSavePosition: String = js.native
  @scala.inline
  def cursorSavePosition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorSavePosition")(x.asInstanceOf[js.Any])
  
  /**
  	Show cursor.
  	*/
  @JSImport("ansi-escapes", "cursorShow")
  @js.native
  def cursorShow: String = js.native
  @scala.inline
  def cursorShow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorShow")(x.asInstanceOf[js.Any])
  
  /**
  	Set the absolute position of the cursor. `x0` `y0` is the top left of the screen.
  	*/
  @JSImport("ansi-escapes", "cursorTo")
  @js.native
  def cursorTo(x: Double): String = js.native
  @JSImport("ansi-escapes", "cursorTo")
  @js.native
  def cursorTo(x: Double, y: Double): String = js.native
  
  /**
  	Move cursor up a specific amount of rows.
  	@param count - Count of rows to move up. Default is `1`.
  	*/
  @JSImport("ansi-escapes", "cursorUp")
  @js.native
  def cursorUp(): String = js.native
  @JSImport("ansi-escapes", "cursorUp")
  @js.native
  def cursorUp(count: Double): String = js.native
  
  @scala.inline
  def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ansiEscapes */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  	Erase the screen from the current line down to the bottom of the screen.
  	*/
  @JSImport("ansi-escapes", "eraseDown")
  @js.native
  def eraseDown: String = js.native
  @scala.inline
  def eraseDown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseDown")(x.asInstanceOf[js.Any])
  
  /**
  	Erase from the current cursor position to the end of the current line.
  	*/
  @JSImport("ansi-escapes", "eraseEndLine")
  @js.native
  def eraseEndLine: String = js.native
  @scala.inline
  def eraseEndLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseEndLine")(x.asInstanceOf[js.Any])
  
  /**
  	Erase the entire current line.
  	*/
  @JSImport("ansi-escapes", "eraseLine")
  @js.native
  def eraseLine: String = js.native
  @scala.inline
  def eraseLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseLine")(x.asInstanceOf[js.Any])
  
  /**
  	Erase from the current cursor position up the specified amount of rows.
  	@param count - Count of rows to erase.
  	*/
  @JSImport("ansi-escapes", "eraseLines")
  @js.native
  def eraseLines(count: Double): String = js.native
  
  /**
  	Erase the screen and move the cursor the top left position.
  	*/
  @JSImport("ansi-escapes", "eraseScreen")
  @js.native
  def eraseScreen: String = js.native
  @scala.inline
  def eraseScreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseScreen")(x.asInstanceOf[js.Any])
  
  /**
  	Erase from the current cursor position to the start of the current line.
  	*/
  @JSImport("ansi-escapes", "eraseStartLine")
  @js.native
  def eraseStartLine: String = js.native
  @scala.inline
  def eraseStartLine_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseStartLine")(x.asInstanceOf[js.Any])
  
  /**
  	Erase the screen from the current line up to the top of the screen.
  	*/
  @JSImport("ansi-escapes", "eraseUp")
  @js.native
  def eraseUp: String = js.native
  @scala.inline
  def eraseUp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eraseUp")(x.asInstanceOf[js.Any])
  
  @JSImport("ansi-escapes", "iTerm")
  @js.native
  def iTerm: Annotation = js.native
  @scala.inline
  def iTerm_=(x: Annotation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("iTerm")(x.asInstanceOf[js.Any])
  
  /**
  	Display an image.
  	_Currently only supported on iTerm2 >=3_
  	See [term-img](https://github.com/sindresorhus/term-img) for a higher-level module.
  	@param buffer - Buffer of an image. Usually read in with `fs.readFile()`.
  	*/
  @JSImport("ansi-escapes", "image")
  @js.native
  def image(buffer: Buffer): String = js.native
  @JSImport("ansi-escapes", "image")
  @js.native
  def image(buffer: Buffer, options: ImageOptions): String = js.native
  
  /**
  	Create a clickable link.
  	[Supported terminals.](https://gist.github.com/egmontkob/eb114294efbcd5adb1944c9f3cb5feda) Use [`supports-hyperlinks`](https://github.com/jamestalmage/supports-hyperlinks) to detect link support.
  	*/
  @JSImport("ansi-escapes", "link")
  @js.native
  def link(text: String, url: String): String = js.native
  
  /**
  	Scroll display down one line.
  	*/
  @JSImport("ansi-escapes", "scrollDown")
  @js.native
  def scrollDown: String = js.native
  @scala.inline
  def scrollDown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollDown")(x.asInstanceOf[js.Any])
  
  /**
  	Scroll display up one line.
  	*/
  @JSImport("ansi-escapes", "scrollUp")
  @js.native
  def scrollUp: String = js.native
  @scala.inline
  def scrollUp_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scrollUp")(x.asInstanceOf[js.Any])
  
  @js.native
  trait AnnotationOptions extends StObject {
    
    /**
    		Create a "hidden" annotation.
    		Annotations created this way can be shown using the "Show Annotations" iTerm command.
    		*/
    val isHidden: js.UndefOr[Boolean] = js.native
    
    /**
    		Nonzero number of columns to annotate.
    		Default: The remainder of the line.
    		*/
    val length: js.UndefOr[Double] = js.native
    
    /**
    		Starting X coordinate.
    		Must be used with `y` and `length`.
    		Default: The cursor position
    		*/
    val x: js.UndefOr[Double] = js.native
    
    /**
    		Starting Y coordinate.
    		Must be used with `x` and `length`.
    		Default: Cursor position.
    		*/
    val y: js.UndefOr[Double] = js.native
  }
  object AnnotationOptions {
    
    @scala.inline
    def apply(): AnnotationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationOptions]
    }
    
    @scala.inline
    implicit class AnnotationOptionsMutableBuilder[Self <: AnnotationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ImageOptions extends StObject {
    
    /**
    		The height is given as a number followed by a unit, or the word `'auto'`.
    		- `N`: N character cells.
    		- `Npx`: N pixels.
    		- `N%`: N percent of the session's width or height.
    		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
    		*/
    val height: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
    
    val preserveAspectRatio: js.UndefOr[Boolean] = js.native
    
    /**
    		The width is given as a number followed by a unit, or the word `'auto'`.
    		- `N`: N character cells.
    		- `Npx`: N pixels.
    		- `N%`: N percent of the session's width or height.
    		- `auto`: The image's inherent size will be used to determine an appropriate dimension.
    		*/
    val width: js.UndefOr[LiteralUnion[auto, Double | String]] = js.native
  }
  object ImageOptions {
    
    @scala.inline
    def apply(): ImageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageOptions]
    }
    
    @scala.inline
    implicit class ImageOptionsMutableBuilder[Self <: ImageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: LiteralUnion[auto, Double | String]): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setWidth(value: LiteralUnion[auto, Double | String]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
