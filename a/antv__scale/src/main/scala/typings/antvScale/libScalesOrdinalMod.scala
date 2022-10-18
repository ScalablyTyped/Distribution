package typings.antvScale

import typings.antvScale.libScalesBaseMod.Base
import typings.antvScale.libTypesMod.OrdinalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesOrdinalMod {
  
  @JSImport("@antv/scale/lib/scales/ordinal", "Ordinal")
  @js.native
  open class Ordinal[O /* <: OrdinalOptions */] () extends Base[O] {
    def this(options: OrdinalOptions) = this()
    
    /* private */ var domainIndexMap: Any = js.native
    
    /* protected */ def domainKey(x: Any): Any = js.native
    /* protected */ @JSName("domainKey")
    var domainKey_Original: Transform = js.native
    
    def getDomain(): /* import warning: importer.ImportType#apply Failed type conversion: O['domain'] */ js.Any = js.native
    
    /* protected */ def getRange(): js.Array[Any] = js.native
    
    /* private */ var rangeIndexMap: Any = js.native
    
    /* protected */ def rangeKey(x: Any): Any = js.native
    /* protected */ @JSName("rangeKey")
    var rangeKey_Original: Transform = js.native
    
    /* protected */ var sortedDomain: /* import warning: importer.ImportType#apply Failed type conversion: O['domain'] */ js.Any = js.native
  }
  
  @JSImport("@antv/scale/lib/scales/ordinal", "defaultUnknown")
  @js.native
  val defaultUnknown: js.Symbol = js.native
  
  type Transform = js.Function1[/* x */ Any, Any]
}
