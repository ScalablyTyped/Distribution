package typings.abstractThings

import typings.abstractThings.thingMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("abstract-things", "Thing")
  @js.native
  open class Thing protected () extends ^ {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  object Thing {
    
    @JSImport("abstract-things", "Thing")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def mixin[T](func: T): T & typings.abstractThings.thingMod.Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(func.asInstanceOf[js.Any]).asInstanceOf[T & typings.abstractThings.thingMod.Thing]
    
    /* static member */
    inline def mixinDynamic[T](mixins: T*): T & typings.abstractThings.thingMod.Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("mixinDynamic")(mixins.asInstanceOf[Seq[js.Any]]*).asInstanceOf[T & typings.abstractThings.thingMod.Thing]
    
    /* static member */
    inline def `type`[T](func: T): T & typings.abstractThings.thingMod.Thing = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(func.asInstanceOf[js.Any]).asInstanceOf[T & typings.abstractThings.thingMod.Thing]
  }
}
