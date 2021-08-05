package typings.avvio

import typings.avvio.avvioStrings.close
import typings.avvio.avvioStrings.preReady
import typings.avvio.avvioStrings.start
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Avvio[Null] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Avvio[Null]]
  inline def apply(done: js.Function): Avvio[Null] = ^.asInstanceOf[js.Dynamic].apply(done.asInstanceOf[js.Any]).asInstanceOf[Avvio[Null]]
  inline def apply[I](instance: I): Avvio[I] = ^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any]).asInstanceOf[Avvio[I]]
  inline def apply[I](instance: I, options: Unit, done: js.Function): Avvio[I] = (^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Avvio[I]]
  inline def apply[I](instance: I, options: Options): Avvio[I] = (^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Avvio[I]]
  inline def apply[I](instance: I, options: Options, done: js.Function): Avvio[I] = (^.asInstanceOf[js.Dynamic].apply(instance.asInstanceOf[js.Any], options.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Avvio[I]]
  
  @JSImport("avvio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    
    def `override`(server: context[I], fn: Plugin[js.Any, I], options: js.Any): context[I] = js.native
    
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
  
  trait Options extends StObject {
    
    var autostart: js.UndefOr[Boolean] = js.undefined
    
    var expose: js.UndefOr[typings.avvio.anon.After] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAutostart(value: Boolean): Self = StObject.set(x, "autostart", value.asInstanceOf[js.Any])
      
      inline def setAutostartUndefined: Self = StObject.set(x, "autostart", js.undefined)
      
      inline def setExpose(value: typings.avvio.anon.After): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      inline def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
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
  
  trait Server[I] extends StObject {
    
    def after(fn: js.Function1[/* err */ Error, Unit]): context[I]
    def after(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): context[I]
    def after(fn: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): context[I]
    @JSName("after")
    var after_Original: After[I, context[I]]
    
    def close(fn: js.Function1[/* err */ Error, Unit]): Unit
    def close(fn: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit
    def close(fn: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): Unit
    @JSName("close")
    var close_Original: Close[I, context[I]]
    
    def onClose(fn: js.Function2[/* context */ context[I], /* done */ js.Function, Unit]): context[I]
    @JSName("onClose")
    var onClose_Original: OnClose[I, context[I]]
    
    def ready(): js.Promise[context[I]]
    def ready(callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit
    def ready(callback: js.Function2[/* err */ Error, /* done */ js.Function, Unit]): Unit
    def ready(callback: js.Function3[/* err */ Error, /* context */ context[I], /* done */ js.Function, Unit]): Unit
    @JSName("ready")
    var ready_Original: Ready[I, context[I]]
    
    def use[O](fn: Plugin[O, I]): context[I]
    def use[O](fn: Plugin[O, I], options: O): context[I]
    @JSName("use")
    var use_Original: Use[I, context[I]]
  }
  object Server {
    
    inline def apply[I](
      after: After[I, context[I]],
      close: Close[I, context[I]],
      onClose: /* fn */ js.Function2[context[I], /* done */ js.Function, Unit] => context[I],
      ready: Ready[I, context[I]],
      use: (/* fn */ Plugin[js.Any, I], /* options */ js.UndefOr[js.Any]) => context[I]
    ): Server[I] = {
      val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], onClose = js.Any.fromFunction1(onClose), ready = ready.asInstanceOf[js.Any], use = js.Any.fromFunction2(use))
      __obj.asInstanceOf[Server[I]]
    }
    
    extension [Self <: Server[?], I](x: Self & Server[I]) {
      
      inline def setAfter(value: After[I, context[I]]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setClose(value: Close[I, context[I]]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: /* fn */ js.Function2[context[I], /* done */ js.Function, Unit] => context[I]): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setReady(value: Ready[I, context[I]]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setUse(value: (/* fn */ Plugin[js.Any, I], /* options */ js.UndefOr[js.Any]) => context[I]): Self = StObject.set(x, "use", js.Any.fromFunction2(value))
    }
  }
  
  type Use[I, C] = js.Function2[/* fn */ Plugin[js.Any, I], /* options */ js.UndefOr[js.Any], C]
  
  type context[I] = mixedInstance[I] | Avvio[I]
  
  type mixedInstance[I] = I & Server[I]
}
