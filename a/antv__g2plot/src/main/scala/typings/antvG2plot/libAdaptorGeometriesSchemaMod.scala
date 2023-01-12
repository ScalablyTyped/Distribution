package typings.antvG2plot

import typings.antvG2plot.libAdaptorGeometriesBaseMod.GeometryOptions
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libCoreAdaptorMod.Params
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAdaptorGeometriesSchemaMod {
  
  @JSImport("@antv/g2plot/lib/adaptor/geometries/schema", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def schema[O /* <: SchemaGeometryOptions */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("schema")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
  
  trait SchemaGeometryOptions
    extends StObject
       with GeometryOptions {
    
    /** point 图形映射规则 */
    val schema: js.UndefOr[MappingOptions] = js.undefined
    
    /** 分组字段 */
    val seriesField: js.UndefOr[String] = js.undefined
  }
  object SchemaGeometryOptions {
    
    inline def apply(): SchemaGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SchemaGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SchemaGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setSchema(value: MappingOptions): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
      
      inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
    }
  }
}
