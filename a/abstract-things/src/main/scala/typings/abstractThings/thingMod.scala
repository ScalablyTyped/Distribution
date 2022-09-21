package typings.abstractThings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object thingMod {
  
  @JSImport("abstract-things/thing", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Thing {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  @JSImport("abstract-things/thing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def mixin[T](func: T): T & Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(func.asInstanceOf[js.Any]).asInstanceOf[T & Thing]
  
  /* static member */
  inline def mixinDynamic[T](mixins: T*): T & Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("mixinDynamic")(mixins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T & Thing]
  
  /* static member */
  inline def `type`[T](func: T): T & Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(func.asInstanceOf[js.Any]).asInstanceOf[T & Thing]
  
  trait EmitEventOptions extends StObject {
    
    var multiple: Boolean
  }
  object EmitEventOptions {
    
    inline def apply(multiple: Boolean): EmitEventOptions = {
      val __obj = js.Dynamic.literal(multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmitEventOptions]
    }
    
    extension [Self <: EmitEventOptions](x: Self) {
      
      inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Thing extends StObject {
    
    def debug(): Unit = js.native
    
    def destroy(): js.Promise[Unit] = js.native
    
    def destroyCallback(): js.Promise[Unit] = js.native
    
    def emitEvent(event: String): Unit = js.native
    def emitEvent(event: String, data: Any): Unit = js.native
    def emitEvent(event: String, data: Any, options: EmitEventOptions): Unit = js.native
    def emitEvent(event: String, data: Unit, options: EmitEventOptions): Unit = js.native
    
    def extendWith[T](mixins: T*): T & Thing = js.native
    
    def id: String | Null = js.native
    def id_=(identifier: String | Null): Unit = js.native
    
    def init(): js.Promise[js.UndefOr[this.type]] = js.native
    
    def initCallback(): js.Promise[Unit] = js.native
    
    def matches(tags: String*): Boolean = js.native
    
    var off: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<new (options : abstract-things.abstract-things/events.EventEmitterOptions | undefined): abstract-things.abstract-things/events.default>['off'] */ js.Any = js.native
    
    var offAny: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<new (options : abstract-things.abstract-things/events.EventEmitterOptions | undefined): abstract-things.abstract-things/events.default>['offAny'] */ js.Any = js.native
    
    var on: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<new (options : abstract-things.abstract-things/events.EventEmitterOptions | undefined): abstract-things.abstract-things/events.default>['on'] */ js.Any = js.native
    
    var onAny: /* import warning: importer.ImportType#apply Failed type conversion: std.InstanceType<new (options : abstract-things.abstract-things/events.EventEmitterOptions | undefined): abstract-things.abstract-things/events.default>['onAny'] */ js.Any = js.native
  }
}
