package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsInvariantMod {
  
  @JSImport("@antv/g2plot/lib/utils/invariant", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait LEVEL extends StObject
  @JSImport("@antv/g2plot/lib/utils/invariant", "LEVEL")
  @js.native
  object LEVEL extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LEVEL & String] = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with LEVEL
    /* "error" */ val ERROR: typings.antvG2plot.libUtilsInvariantMod.LEVEL.ERROR & String = js.native
    
    @js.native
    sealed trait INFO
      extends StObject
         with LEVEL
    /* "log" */ val INFO: typings.antvG2plot.libUtilsInvariantMod.LEVEL.INFO & String = js.native
    
    @js.native
    sealed trait WARN
      extends StObject
         with LEVEL
    /* "warn" */ val WARN: typings.antvG2plot.libUtilsInvariantMod.LEVEL.WARN & String = js.native
  }
  
  inline def invariant(condition: Boolean, format: String, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("invariant")((scala.List(condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def log(level: LEVEL, condition: Boolean, format: Any, args: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")((scala.List(level.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
