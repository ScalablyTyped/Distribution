package typings.accessibility

import org.scalablytyped.runtime.StringDictionary
import typings.accessibility.accessibilityBooleans.`true`
import typings.accessibility.anon.Buttons
import typings.accessibility.anon.CBackground
import typings.accessibility.anon.Font
import typings.accessibility.anon.Persistent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Adaptive Accessibility Menu
    */
  @JSImport("accessibility", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Accessibility {
    def this(options: Options) = this()
    
    /* CompleteClass */
    override def alterTextSpace(isIncrease: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def build(): Unit = js.native
    
    /* CompleteClass */
    override def deleteOppositesIfDefined(options: Options): Options = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    override def disabledUnsupportedFeatures(): Unit = js.native
    
    /* CompleteClass */
    override def fontFallback(): Unit = js.native
    
    /* CompleteClass */
    override def initFontSize(): Unit = js.native
    
    /* CompleteClass */
    override def injectCss(): Unit = js.native
    
    /* CompleteClass */
    override def invoke(action: js.Function0[Unit]): Unit = js.native
    
    /* CompleteClass */
    override def listen(): Unit = js.native
    
    /* CompleteClass */
    override val menuInterface: MenuInterface = js.native
    
    /* CompleteClass */
    override def onChange(updateSession: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def read(): Unit = js.native
    
    /* CompleteClass */
    override def resetIfDefined(src: js.Any, dest: js.Any, prop: String): Unit = js.native
    
    /* CompleteClass */
    override def runHotkey(name: String): Unit = js.native
    
    /* CompleteClass */
    override def saveSession(): Unit = js.native
    
    /* CompleteClass */
    override def setSessionFromCache(): Unit = js.native
    
    /* CompleteClass */
    override def speechToText(): Unit = js.native
    
    /* CompleteClass */
    override def textToSpeech(text: String): Unit = js.native
    
    /* CompleteClass */
    override def toggleMenu(): Unit = js.native
  }
  @JSImport("accessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** @deprecated */
  /* static member */
  @scala.inline
  def init(): Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Accessibility]
  @scala.inline
  def init(options: Options): Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Accessibility]
  
  /**
    * Adaptive Accessibility Menu
    */
  trait Accessibility extends StObject {
    
    def alterTextSpace(isIncrease: Boolean): Unit
    
    def build(): Unit
    
    def deleteOppositesIfDefined(options: Options): Options
    
    def destroy(): Unit
    
    def disabledUnsupportedFeatures(): Unit
    
    def fontFallback(): Unit
    
    def initFontSize(): Unit
    
    def injectCss(): Unit
    
    def invoke(action: js.Function0[Unit]): Unit
    
    def listen(): Unit
    
    val menuInterface: MenuInterface
    
    def onChange(updateSession: Boolean): Unit
    
    def read(): Unit
    
    def resetIfDefined(src: js.Any, dest: js.Any, prop: String): Unit
    
    def runHotkey(name: String): Unit
    
    def saveSession(): Unit
    
    def setSessionFromCache(): Unit
    
    def speechToText(): Unit
    
    def textToSpeech(text: String): Unit
    
    def toggleMenu(): Unit
  }
  object Accessibility {
    
    @scala.inline
    def apply(
      alterTextSpace: Boolean => Unit,
      build: () => Unit,
      deleteOppositesIfDefined: Options => Options,
      destroy: () => Unit,
      disabledUnsupportedFeatures: () => Unit,
      fontFallback: () => Unit,
      initFontSize: () => Unit,
      injectCss: () => Unit,
      invoke: js.Function0[Unit] => Unit,
      listen: () => Unit,
      menuInterface: MenuInterface,
      onChange: Boolean => Unit,
      read: () => Unit,
      resetIfDefined: (js.Any, js.Any, String) => Unit,
      runHotkey: String => Unit,
      saveSession: () => Unit,
      setSessionFromCache: () => Unit,
      speechToText: () => Unit,
      textToSpeech: String => Unit,
      toggleMenu: () => Unit
    ): Accessibility = {
      val __obj = js.Dynamic.literal(alterTextSpace = js.Any.fromFunction1(alterTextSpace), build = js.Any.fromFunction0(build), deleteOppositesIfDefined = js.Any.fromFunction1(deleteOppositesIfDefined), destroy = js.Any.fromFunction0(destroy), disabledUnsupportedFeatures = js.Any.fromFunction0(disabledUnsupportedFeatures), fontFallback = js.Any.fromFunction0(fontFallback), initFontSize = js.Any.fromFunction0(initFontSize), injectCss = js.Any.fromFunction0(injectCss), invoke = js.Any.fromFunction1(invoke), listen = js.Any.fromFunction0(listen), menuInterface = menuInterface.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), read = js.Any.fromFunction0(read), resetIfDefined = js.Any.fromFunction3(resetIfDefined), runHotkey = js.Any.fromFunction1(runHotkey), saveSession = js.Any.fromFunction0(saveSession), setSessionFromCache = js.Any.fromFunction0(setSessionFromCache), speechToText = js.Any.fromFunction0(speechToText), textToSpeech = js.Any.fromFunction1(textToSpeech), toggleMenu = js.Any.fromFunction0(toggleMenu))
      __obj.asInstanceOf[Accessibility]
    }
    
    @scala.inline
    implicit class AccessibilityMutableBuilder[Self <: Accessibility] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlterTextSpace(value: Boolean => Unit): Self = StObject.set(x, "alterTextSpace", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuild(value: () => Unit): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeleteOppositesIfDefined(value: Options => Options): Self = StObject.set(x, "deleteOppositesIfDefined", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisabledUnsupportedFeatures(value: () => Unit): Self = StObject.set(x, "disabledUnsupportedFeatures", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFontFallback(value: () => Unit): Self = StObject.set(x, "fontFallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitFontSize(value: () => Unit): Self = StObject.set(x, "initFontSize", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInjectCss(value: () => Unit): Self = StObject.set(x, "injectCss", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvoke(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction1(value))
      
      @scala.inline
      def setListen(value: () => Unit): Self = StObject.set(x, "listen", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMenuInterface(value: MenuInterface): Self = StObject.set(x, "menuInterface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: () => Unit): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def setResetIfDefined(value: (js.Any, js.Any, String) => Unit): Self = StObject.set(x, "resetIfDefined", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRunHotkey(value: String => Unit): Self = StObject.set(x, "runHotkey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSaveSession(value: () => Unit): Self = StObject.set(x, "saveSession", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetSessionFromCache(value: () => Unit): Self = StObject.set(x, "setSessionFromCache", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSpeechToText(value: () => Unit): Self = StObject.set(x, "speechToText", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTextToSpeech(value: String => Unit): Self = StObject.set(x, "textToSpeech", js.Any.fromFunction1(value))
      
      @scala.inline
      def setToggleMenu(value: () => Unit): Self = StObject.set(x, "toggleMenu", js.Any.fromFunction0(value))
    }
  }
  
  trait Dimensions extends StObject {
    
    var height: js.UndefOr[SizeOrPosition] = js.undefined
    
    var width: js.UndefOr[SizeOrPosition] = js.undefined
  }
  object Dimensions {
    
    @scala.inline
    def apply(): Dimensions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dimensions]
    }
    
    @scala.inline
    implicit class DimensionsMutableBuilder[Self <: Dimensions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: SizeOrPosition): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: SizeOrPosition): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type HotKeyDefinition = js.Tuple3[Double, Double, String]
  
  trait HotKeys extends StObject {
    
    /** @default false */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var helpTitles: js.UndefOr[Boolean] = js.undefined
    
    var keys: js.UndefOr[StringDictionary[HotKeyDefinition]] = js.undefined
  }
  object HotKeys {
    
    @scala.inline
    def apply(): HotKeys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HotKeys]
    }
    
    @scala.inline
    implicit class HotKeysMutableBuilder[Self <: HotKeys] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHelpTitles(value: Boolean): Self = StObject.set(x, "helpTitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelpTitlesUndefined: Self = StObject.set(x, "helpTitles", js.undefined)
      
      @scala.inline
      def setKeys(value: StringDictionary[HotKeyDefinition]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    }
  }
  
  trait Icon extends StObject {
    
    /** @default '#4054b2' */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var circular: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var circularBorder: js.UndefOr[Boolean] = js.undefined
    
    /** @default '#fff' */
    var color: js.UndefOr[String] = js.undefined
    
    var dimensions: js.UndefOr[Dimensions] = js.undefined
    
    /** @default 'Material Icons' */
    var fontClass: js.UndefOr[String] = js.undefined
    
    /** @default ['https://fonts.googleapis.com/icon?family=Material+Icons'] */
    var fontFaceSrc: js.UndefOr[js.Array[String]] = js.undefined
    
    /** @default 'Material Icons' */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** @default 'accessible' */
    var img: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[Position] = js.undefined
    
    /** @default false */
    var useEmojis: js.UndefOr[Boolean] = js.undefined
    
    /** @default '9999' */
    var zIndex: js.UndefOr[String | Double] = js.undefined
  }
  object Icon {
    
    @scala.inline
    def apply(): Icon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setCircular(value: Boolean): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularBorder(value: Boolean): Self = StObject.set(x, "circularBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularBorderUndefined: Self = StObject.set(x, "circularBorder", js.undefined)
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
      
      @scala.inline
      def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontClassUndefined: Self = StObject.set(x, "fontClass", js.undefined)
      
      @scala.inline
      def setFontFaceSrc(value: js.Array[String]): Self = StObject.set(x, "fontFaceSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFaceSrcUndefined: Self = StObject.set(x, "fontFaceSrc", js.undefined)
      
      @scala.inline
      def setFontFaceSrcVarargs(value: String*): Self = StObject.set(x, "fontFaceSrc", js.Array(value :_*))
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setImg(value: String): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setUseEmojis(value: Boolean): Self = StObject.set(x, "useEmojis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEmojisUndefined: Self = StObject.set(x, "useEmojis", js.undefined)
      
      @scala.inline
      def setZIndex(value: String | Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait Labels extends StObject {
    
    /** @default 'gray hues' */
    var bigCursor: js.UndefOr[String] = js.undefined
    
    /** @default 'Close' */
    var closeTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'decrease text size' */
    var decreaseText: js.UndefOr[String] = js.undefined
    
    /** @default 'decrease text spacing' */
    var decreaseTextSpacing: js.UndefOr[String] = js.undefined
    
    /** @default 'gray hues' */
    var grayHues: js.UndefOr[String] = js.undefined
    
    /** @default 'increase text size' */
    var increaseText: js.UndefOr[String] = js.undefined
    
    /** @default 'increase text spacing' */
    var increaseTextSpacing: js.UndefOr[String] = js.undefined
    
    /** @default 'invert colors' */
    var invertColors: js.UndefOr[String] = js.undefined
    
    /** @default 'Accessibility Options' */
    var menuTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'reading guide' */
    var readingGuide: js.UndefOr[String] = js.undefined
    
    /** @default 'Reset' */
    var resetTitle: js.UndefOr[String] = js.undefined
    
    /** @default 'speech to text' */
    var speechToText: js.UndefOr[String] = js.undefined
    
    /** @default 'underline links' */
    var textToSpeech: js.UndefOr[String] = js.undefined
    
    /** @default 'underline links' */
    var underlineLinks: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    @scala.inline
    def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit class LabelsMutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBigCursor(value: String): Self = StObject.set(x, "bigCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigCursorUndefined: Self = StObject.set(x, "bigCursor", js.undefined)
      
      @scala.inline
      def setCloseTitle(value: String): Self = StObject.set(x, "closeTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTitleUndefined: Self = StObject.set(x, "closeTitle", js.undefined)
      
      @scala.inline
      def setDecreaseText(value: String): Self = StObject.set(x, "decreaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecreaseTextSpacing(value: String): Self = StObject.set(x, "decreaseTextSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecreaseTextSpacingUndefined: Self = StObject.set(x, "decreaseTextSpacing", js.undefined)
      
      @scala.inline
      def setDecreaseTextUndefined: Self = StObject.set(x, "decreaseText", js.undefined)
      
      @scala.inline
      def setGrayHues(value: String): Self = StObject.set(x, "grayHues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayHuesUndefined: Self = StObject.set(x, "grayHues", js.undefined)
      
      @scala.inline
      def setIncreaseText(value: String): Self = StObject.set(x, "increaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseTextSpacing(value: String): Self = StObject.set(x, "increaseTextSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseTextSpacingUndefined: Self = StObject.set(x, "increaseTextSpacing", js.undefined)
      
      @scala.inline
      def setIncreaseTextUndefined: Self = StObject.set(x, "increaseText", js.undefined)
      
      @scala.inline
      def setInvertColors(value: String): Self = StObject.set(x, "invertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertColorsUndefined: Self = StObject.set(x, "invertColors", js.undefined)
      
      @scala.inline
      def setMenuTitle(value: String): Self = StObject.set(x, "menuTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuTitleUndefined: Self = StObject.set(x, "menuTitle", js.undefined)
      
      @scala.inline
      def setReadingGuide(value: String): Self = StObject.set(x, "readingGuide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingGuideUndefined: Self = StObject.set(x, "readingGuide", js.undefined)
      
      @scala.inline
      def setResetTitle(value: String): Self = StObject.set(x, "resetTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResetTitleUndefined: Self = StObject.set(x, "resetTitle", js.undefined)
      
      @scala.inline
      def setSpeechToText(value: String): Self = StObject.set(x, "speechToText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechToTextUndefined: Self = StObject.set(x, "speechToText", js.undefined)
      
      @scala.inline
      def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      
      @scala.inline
      def setUnderlineLinks(value: String): Self = StObject.set(x, "underlineLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineLinksUndefined: Self = StObject.set(x, "underlineLinks", js.undefined)
    }
  }
  
  @js.native
  trait MenuInterface extends StObject {
    
    def bigCursor(): Unit = js.native
    def bigCursor(destroy: Boolean): Unit = js.native
    
    def decreaseText(): Unit = js.native
    
    def decreaseTextSpacing(): Unit = js.native
    
    def grayHues(): Unit = js.native
    def grayHues(destroy: Boolean): Unit = js.native
    
    def increaseText(): Unit = js.native
    
    def increaseTextSpacing(): Unit = js.native
    
    def invertColors(): Unit = js.native
    def invertColors(destroy: Boolean): Unit = js.native
    
    def readingGuide(): Unit = js.native
    def readingGuide(destroy: Boolean): Unit = js.native
    
    def speechToText(): Unit = js.native
    def speechToText(destroy: Boolean): Unit = js.native
    
    def textToSpeech(): Unit = js.native
    def textToSpeech(destroy: Boolean): Unit = js.native
    
    def underlineLinks(): Unit = js.native
    def underlineLinks(destroy: Boolean): Unit = js.native
  }
  
  trait Modules extends StObject {
    
    /** @default true */
    var bigCursor: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var decreaseText: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var decreaseTextSpacing: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var grayHues: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var increaseText: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var increaseTextSpacing: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var invertColors: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var readingGuide: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var speechToText: js.UndefOr[`true`] = js.undefined
    
    /** @default true */
    var textToSpeech: js.UndefOr[Boolean] = js.undefined
    
    /** @default true */
    var underlineLinks: js.UndefOr[Boolean] = js.undefined
  }
  object Modules {
    
    @scala.inline
    def apply(): Modules = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Modules]
    }
    
    @scala.inline
    implicit class ModulesMutableBuilder[Self <: Modules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBigCursor(value: Boolean): Self = StObject.set(x, "bigCursor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBigCursorUndefined: Self = StObject.set(x, "bigCursor", js.undefined)
      
      @scala.inline
      def setDecreaseText(value: Boolean): Self = StObject.set(x, "decreaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecreaseTextSpacing(value: Boolean): Self = StObject.set(x, "decreaseTextSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecreaseTextSpacingUndefined: Self = StObject.set(x, "decreaseTextSpacing", js.undefined)
      
      @scala.inline
      def setDecreaseTextUndefined: Self = StObject.set(x, "decreaseText", js.undefined)
      
      @scala.inline
      def setGrayHues(value: Boolean): Self = StObject.set(x, "grayHues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrayHuesUndefined: Self = StObject.set(x, "grayHues", js.undefined)
      
      @scala.inline
      def setIncreaseText(value: Boolean): Self = StObject.set(x, "increaseText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseTextSpacing(value: Boolean): Self = StObject.set(x, "increaseTextSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncreaseTextSpacingUndefined: Self = StObject.set(x, "increaseTextSpacing", js.undefined)
      
      @scala.inline
      def setIncreaseTextUndefined: Self = StObject.set(x, "increaseText", js.undefined)
      
      @scala.inline
      def setInvertColors(value: Boolean): Self = StObject.set(x, "invertColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertColorsUndefined: Self = StObject.set(x, "invertColors", js.undefined)
      
      @scala.inline
      def setReadingGuide(value: Boolean): Self = StObject.set(x, "readingGuide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadingGuideUndefined: Self = StObject.set(x, "readingGuide", js.undefined)
      
      @scala.inline
      def setSpeechToText(value: `true`): Self = StObject.set(x, "speechToText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechToTextUndefined: Self = StObject.set(x, "speechToText", js.undefined)
      
      @scala.inline
      def setTextToSpeech(value: Boolean): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
      
      @scala.inline
      def setUnderlineLinks(value: Boolean): Self = StObject.set(x, "underlineLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineLinksUndefined: Self = StObject.set(x, "underlineLinks", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var animations: js.UndefOr[Buttons] = js.undefined
    
    var buttons: js.UndefOr[Font] = js.undefined
    
    var guide: js.UndefOr[CBackground] = js.undefined
    
    var hotkeys: js.UndefOr[HotKeys] = js.undefined
    
    var icon: js.UndefOr[Icon] = js.undefined
    
    var labels: js.UndefOr[Labels] = js.undefined
    
    var menu: js.UndefOr[typings.accessibility.anon.Dimensions] = js.undefined
    
    var modules: js.UndefOr[Modules] = js.undefined
    
    var session: js.UndefOr[Persistent] = js.undefined
    
    /** @default 'en-US' */
    var speechToTextLang: js.UndefOr[String] = js.undefined
    
    /** @default true */
    var textEmlMode: js.UndefOr[Boolean] = js.undefined
    
    /** @default false */
    var textPixelMode: js.UndefOr[Boolean] = js.undefined
    
    /** @default 'en-US' */
    var textToSpeechLang: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimations(value: Buttons): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsUndefined: Self = StObject.set(x, "animations", js.undefined)
      
      @scala.inline
      def setButtons(value: Font): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      @scala.inline
      def setGuide(value: CBackground): Self = StObject.set(x, "guide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGuideUndefined: Self = StObject.set(x, "guide", js.undefined)
      
      @scala.inline
      def setHotkeys(value: HotKeys): Self = StObject.set(x, "hotkeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotkeysUndefined: Self = StObject.set(x, "hotkeys", js.undefined)
      
      @scala.inline
      def setIcon(value: Icon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setLabels(value: Labels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setMenu(value: typings.accessibility.anon.Dimensions): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
      
      @scala.inline
      def setModules(value: Modules): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      @scala.inline
      def setSession(value: Persistent): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
      
      @scala.inline
      def setSpeechToTextLang(value: String): Self = StObject.set(x, "speechToTextLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeechToTextLangUndefined: Self = StObject.set(x, "speechToTextLang", js.undefined)
      
      @scala.inline
      def setTextEmlMode(value: Boolean): Self = StObject.set(x, "textEmlMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextEmlModeUndefined: Self = StObject.set(x, "textEmlMode", js.undefined)
      
      @scala.inline
      def setTextPixelMode(value: Boolean): Self = StObject.set(x, "textPixelMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPixelModeUndefined: Self = StObject.set(x, "textPixelMode", js.undefined)
      
      @scala.inline
      def setTextToSpeechLang(value: String): Self = StObject.set(x, "textToSpeechLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextToSpeechLangUndefined: Self = StObject.set(x, "textToSpeechLang", js.undefined)
    }
  }
  
  trait Position extends StObject {
    
    var bottom: js.UndefOr[SizeOrPosition] = js.undefined
    
    var left: js.UndefOr[SizeOrPosition] = js.undefined
    
    var right: js.UndefOr[SizeOrPosition] = js.undefined
    
    var top: js.UndefOr[SizeOrPosition] = js.undefined
    
    var `type`: String
  }
  object Position {
    
    @scala.inline
    def apply(`type`: String): Position = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: SizeOrPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: SizeOrPosition): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: SizeOrPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: SizeOrPosition): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeOrPosition extends StObject {
    
    var size: Double | String
    
    var units: js.UndefOr[String] = js.undefined
  }
  object SizeOrPosition {
    
    @scala.inline
    def apply(size: Double | String): SizeOrPosition = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeOrPosition]
    }
    
    @scala.inline
    implicit class SizeOrPositionMutableBuilder[Self <: SizeOrPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsUndefined: Self = StObject.set(x, "units", js.undefined)
    }
  }
}
