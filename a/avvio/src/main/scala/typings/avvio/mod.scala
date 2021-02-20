package typings.avvio

import typings.avvio.avvioStrings.close
import typings.avvio.avvioStrings.preReady
import typings.avvio.avvioStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply(): Avvio[Null] = js.native
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply(done: js.Function): Avvio[Null] = js.native
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply[I](instance: I): Avvio[I] = js.native
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply[I](instance: I, options: js.UndefOr[scala.Nothing], done: js.Function): Avvio[I] = js.native
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply[I](instance: I, options: Options): Avvio[I] = js.native
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  def apply[I](instance: I, options: Options, done: js.Function): Avvio[I] = js.native
  
  // Avvio methods
  @js.native
  trait After[I, C] extends StObject {
    
    def apply(fn: js.Function1[/* err */ Error, Unit]): C = js.native
    def apply(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): C = js.native
    def apply(fn: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): C = js.native
  }
  
  @js.native
  trait Avvio[I]
    extends EventEmitter
       with Server[I] {
    
    var booted: Boolean = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_preReady(event: preReady, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
    
    def `override`(server: context[I], fn: Plugin[_, I], options: js.Any): context[I] = js.native
    
    def prettyPrint(): String = js.native
    
    def start(): this.type = js.native
    
    var started: Boolean = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  @js.native
  trait Close[I, C] extends StObject {
    
    def apply(fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def apply(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
    def apply(fn: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
  }
  
  type OnClose[I, C] = js.Function1[/* fn */ js.Function2[/* context */ C, /* done */ js.Function, Unit], C]
  
  @js.native
  trait Options extends StObject {
    
    var autostart: js.UndefOr[Boolean] = js.native
    
    var expose: js.UndefOr[typings.avvio.anon.After] = js.native
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
      def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      @scala.inline
      def setExpose(value: typings.avvio.anon.After): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
    }
  }
  
  type Plugin[O, I] = js.Function3[
    /* server */ context[I], 
    /* options */ O, 
    /* done */ js.Function1[/* err */ js.UndefOr[Error], Unit], 
    Unit
  ]
  
  @js.native
  trait Ready[I, C] extends StObject {
    
    def apply(): js.Promise[C] = js.native
    def apply(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def apply(callback: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
    def apply(callback: js.Function3[/* err */ Error, /* context */ C, /* done */ js.Function, Unit]): Unit = js.native
  }
  
  @js.native
  trait Server[I] extends StObject {
    
    def after(fn: js.Function1[/* err */ Error, Unit]): context[I] = js.native
    def after(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): context[I] = js.native
    def after(fn: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): context[I] = js.native
    @JSName("after")
    var after_Original: After[I, context[I]] = js.native
    
    def close(fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
    def close(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
    def close(fn: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): Unit = js.native
    @JSName("close")
    var close_Original: Close[I, context[I]] = js.native
    
    def onClose(fn: js.Function2[/* context */ context[I], /* done */ js.Function, Unit]): context[I] = js.native
    @JSName("onClose")
    var onClose_Original: OnClose[I, context[I]] = js.native
    
    def ready(): js.Promise[context[I]] = js.native
    def ready(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
    def ready(callback: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit = js.native
    def ready(callback: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): Unit = js.native
    @JSName("ready")
    var ready_Original: Ready[I, context[I]] = js.native
    
    def use[O](fn: Plugin[O, I]): context[I] = js.native
    def use[O](fn: Plugin[O, I], options: O): context[I] = js.native
    @JSName("use")
    var use_Original: Use[I, context[I]] = js.native
  }
  
  type Use[I, C] = js.Function2[/* fn */ Plugin[js.Any, I], /* options */ js.UndefOr[js.Any], C]
  
  type context[I] = mixedInstance[I] | Avvio[I]
  
  type mixedInstance[I] = I with Server[I]
}
