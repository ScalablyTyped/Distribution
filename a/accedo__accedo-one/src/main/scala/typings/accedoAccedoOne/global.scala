package typings.accedoAccedoOne

import typings.accedoAccedoOne.mod.AccedoClient
import typings.accedoAccedoOne.mod.AccedoConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object accedoOne {
    
    inline def apply(config: AccedoConfig): AccedoClient = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[AccedoClient]
    
    @JSGlobal("accedoOne")
    @js.native
    val ^ : js.Any = js.native
    
    object AccedoLog {
      
      @JSGlobal("accedoOne.AccedoLog.Level")
      @js.native
      object Level extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.accedoAccedoOne.mod.AccedoLog.Level & String] = js.native
        
        /* "debug" */ val DEBUG: typings.accedoAccedoOne.mod.AccedoLog.Level.DEBUG & String = js.native
        
        /* "error" */ val ERROR: typings.accedoAccedoOne.mod.AccedoLog.Level.ERROR & String = js.native
        
        /* "info" */ val INFO: typings.accedoAccedoOne.mod.AccedoLog.Level.INFO & String = js.native
        
        /* "warn" */ val WARN: typings.accedoAccedoOne.mod.AccedoLog.Level.WARN & String = js.native
      }
    }
  }
}
