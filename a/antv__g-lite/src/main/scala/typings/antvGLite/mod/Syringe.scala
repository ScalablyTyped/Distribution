package typings.antvGLite.mod

import typings.manaSyringe.anon.PartialTokenOption
import typings.manaSyringe.coreMod.Syringe.InjectOption
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Syringe {
  
  @JSImport("@antv/g-lite", "Syringe")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-lite", "Syringe.ClassOptionSymbol")
  @js.native
  val ClassOptionSymbol: js.Symbol = js.native
  
  @JSImport("@antv/g-lite", "Syringe.DefaultOption")
  @js.native
  val DefaultOption: InjectOption[Any] = js.native
  
  @JSImport("@antv/g-lite", "Syringe.DefinedToken")
  @js.native
  open class DefinedToken protected ()
    extends typings.manaSyringe.mod.Syringe.DefinedToken {
    def this(name: String) = this()
    def this(name: String, option: PartialTokenOption) = this()
  }
  
  @JSImport("@antv/g-lite", "Syringe.Lifecycle")
  @js.native
  object Lifecycle extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.manaSyringe.coreMod.Syringe.Lifecycle & String] = js.native
    
    /* "singleton" */ val singleton: typings.manaSyringe.coreMod.Syringe.Lifecycle.singleton & String = js.native
    
    /* "transient" */ val transient: typings.manaSyringe.coreMod.Syringe.Lifecycle.transient & String = js.native
  }
  
  /**
    * 定义注入标识，默认允许多重注入
    */
  inline def defineToken(name: String): typings.manaSyringe.coreMod.Syringe.DefinedToken = ^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any]).asInstanceOf[typings.manaSyringe.coreMod.Syringe.DefinedToken]
  inline def defineToken(name: String, option: PartialTokenOption): typings.manaSyringe.coreMod.Syringe.DefinedToken = (^.asInstanceOf[js.Dynamic].applyDynamic("defineToken")(name.asInstanceOf[js.Any], option.asInstanceOf[js.Any])).asInstanceOf[typings.manaSyringe.coreMod.Syringe.DefinedToken]
  
  inline def isModule(): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")().asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
  inline def isModule(data: Record[Any, Any]): /* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModule")(data.asInstanceOf[js.Any]).asInstanceOf[/* is mana-syringe.mana-syringe/lib/core.Syringe.Module */ Boolean]
}
