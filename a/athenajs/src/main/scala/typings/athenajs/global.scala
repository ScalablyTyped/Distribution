package typings.athenajs

import typings.athenajs.anon.AIR
import typings.athenajs.mod.BitmapTextOptions
import typings.athenajs.mod.DisplayOptions
import typings.athenajs.mod.DrawableOptions
import typings.athenajs.mod.EffectOptions
import typings.athenajs.mod.FXInstance
import typings.athenajs.mod.GameOptions
import typings.athenajs.mod.JSObject
import typings.athenajs.mod.MapOptions
import typings.athenajs.mod.MenuOptions
import typings.athenajs.mod.PaintOptions
import typings.athenajs.mod.Promise
import typings.athenajs.mod.SceneOptions
import typings.athenajs.mod.SimpleTextOptions
import typings.athenajs.mod.SpriteOptions
import typings.athenajs.mod._AudioManager
import typings.athenajs.mod._Dom
import typings.athenajs.mod._InputManager
import typings.athenajs.mod._NotificationManager
import typings.athenajs.mod._ResourceManager
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AthenaJS {
    
    @JSGlobal("AthenaJS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("AthenaJS.AudioManager")
    @js.native
    val AudioManager: _AudioManager = js.native
    
    @JSGlobal("AthenaJS.Behavior")
    @js.native
    class Behavior protected ()
      extends typings.athenajs.mod.Behavior {
      def this(sprite: typings.athenajs.mod.Drawable) = this()
      def this(sprite: typings.athenajs.mod.Drawable, options: JSObject) = this()
    }
    
    @JSGlobal("AthenaJS.BitmapText")
    @js.native
    class BitmapText protected ()
      extends typings.athenajs.mod.BitmapText {
      def this(`type`: String, textOptions: BitmapTextOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Deferred")
    @js.native
    class Deferred ()
      extends typings.athenajs.mod.Deferred
    /* static members */
    object Deferred {
      
      @JSGlobal("AthenaJS.Deferred")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and immediately resolves a new deferred.
        *
        */
      inline def resolve(): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Promise]
      inline def resolve(`val`: js.Any): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(`val`.asInstanceOf[js.Any]).asInstanceOf[Promise]
    }
    
    @JSGlobal("AthenaJS.Display")
    @js.native
    class Display protected ()
      extends typings.athenajs.mod.Display {
      /**
        * Creates a new Display instance
        *
        */
      def this(options: DisplayOptions, target: String) = this()
      def this(options: DisplayOptions, target: HTMLElement) = this()
    }
    
    inline def Dom(): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")().asInstanceOf[_Dom[HTMLElement]]
    inline def Dom(sel: String): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]
    inline def Dom(sel: HTMLElement): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]
    
    @JSGlobal("AthenaJS.Drawable")
    @js.native
    class Drawable protected ()
      extends typings.athenajs.mod.Drawable {
      def this(`type`: String, options: DrawableOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Effect")
    @js.native
    class Effect protected ()
      extends typings.athenajs.mod.Effect {
      /**
        * This the class constructor. Default options are:
        *
        */
      def this(options: EffectOptions, display: typings.athenajs.mod.Display) = this()
    }
    
    @JSGlobal("AthenaJS.FX")
    @js.native
    val FX: FXInstance = js.native
    
    @JSGlobal("AthenaJS.Game")
    @js.native
    class Game protected ()
      extends typings.athenajs.mod.Game {
      def this(options: GameOptions) = this()
    }
    
    @JSGlobal("AthenaJS.InputManager")
    @js.native
    val InputManager: _InputManager = js.native
    
    @JSGlobal("AthenaJS.Map")
    @js.native
    class Map protected ()
      extends typings.athenajs.mod.Map {
      def this(options: MapOptions) = this()
    }
    
    @JSGlobal("AthenaJS.MapEvent")
    @js.native
    class MapEvent protected ()
      extends typings.athenajs.mod.MapEvent {
      /**
        * Creates a new MapEvent
        *
        */
      def this(map: typings.athenajs.mod.Map) = this()
    }
    
    @JSGlobal("AthenaJS.Menu")
    @js.native
    class Menu protected ()
      extends typings.athenajs.mod.Menu {
      def this(id: String, options: MenuOptions) = this()
    }
    
    @JSGlobal("AthenaJS.NotificationManager")
    @js.native
    val NotificationManager: _NotificationManager = js.native
    
    @JSGlobal("AthenaJS.Paint")
    @js.native
    class Paint protected ()
      extends typings.athenajs.mod.Paint {
      def this(`type`: String, paintOptions: PaintOptions) = this()
    }
    
    @JSGlobal("AthenaJS.ResourceManager")
    @js.native
    val ResourceManager: _ResourceManager = js.native
    
    @JSGlobal("AthenaJS.Scene")
    @js.native
    class Scene ()
      extends typings.athenajs.mod.Scene {
      def this(options: SceneOptions) = this()
    }
    
    @JSGlobal("AthenaJS.SimpleText")
    @js.native
    class SimpleText protected ()
      extends typings.athenajs.mod.SimpleText {
      def this(`type`: String, simpleTextOptions: SimpleTextOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Sprite")
    @js.native
    class Sprite protected ()
      extends typings.athenajs.mod.Sprite {
      def this(`type`: String, spriteOptions: SpriteOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Tile")
    @js.native
    class Tile protected ()
      extends typings.athenajs.mod.Tile {
      def this(options: JSObject) = this()
    }
    /* static members */
    object Tile {
      
      @JSGlobal("AthenaJS.Tile")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("AthenaJS.Tile.TYPE")
      @js.native
      def TYPE: AIR = js.native
      inline def TYPE_=(x: AIR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("AthenaJS._FX")
    @js.native
    /**
      * Creates the FX class, adding the linear easing
      */
    class _FX ()
      extends typings.athenajs.mod._FX
  }
}
