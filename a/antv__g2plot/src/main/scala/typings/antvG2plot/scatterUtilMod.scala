package typings.antvG2plot

import org.scalablytyped.runtime.StringDictionary
import typings.antvG2plot.anon.PickScatterOptionsmetaxFi
import typings.antvG2plot.metaMod.Meta
import typings.antvG2plot.scatterTypesMod.ScatterOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scatterUtilMod {
  
  @JSImport("@antv/g2plot/lib/plots/scatter/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getMeta(options: PickScatterOptionsmetaxFi): js.UndefOr[Record[String, Meta]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMeta")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Record[String, Meta]]]
  
  inline def getPath(config: RenderOptions): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def getQuadrantDefaultConfig(xBaseline: Double, yBaseline: Double): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getQuadrantDefaultConfig")(xBaseline.asInstanceOf[js.Any], yBaseline.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  trait RenderOptions extends StObject {
    
    var options: ScatterOptions
    
    var view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
  }
  object RenderOptions {
    
    inline def apply(
      options: ScatterOptions,
      view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
    ): RenderOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderOptions]
    }
    
    extension [Self <: RenderOptions](x: Self) {
      
      inline def setOptions(value: ScatterOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setView(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any
      ): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    }
  }
}
