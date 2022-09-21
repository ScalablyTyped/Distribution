package typings.accessibility

import typings.accessibility.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Accessibility {
    
    /**
      * Adaptive Accessibility Menu
      */
    @JSGlobal("Accessibility")
    @js.native
    open class ^ ()
      extends typings.accessibility.mod.^ {
      def this(options: Options) = this()
    }
    
    @JSGlobal("Accessibility")
    @js.native
    val ^ : js.Any = js.native
    
    /** @deprecated */
    /* static member */
    inline def init(): typings.accessibility.mod.Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[typings.accessibility.mod.Accessibility]
    inline def init(options: Options): typings.accessibility.mod.Accessibility = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[typings.accessibility.mod.Accessibility]
  }
}
