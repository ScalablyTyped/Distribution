package typings.apolloDatasource

import typings.apolloUtilsKeyvaluecache.distKeyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("apollo-datasource", "DataSource")
  @js.native
  open class DataSource[TContext] () extends StObject {
    
    var initialize: js.UndefOr[js.Function1[/* config */ DataSourceConfig[TContext], Unit | js.Promise[Unit]]] = js.native
  }
  
  trait DataSourceConfig[TContext] extends StObject {
    
    var cache: KeyValueCache[String]
    
    var context: TContext
  }
  object DataSourceConfig {
    
    inline def apply[TContext](cache: KeyValueCache[String], context: TContext): DataSourceConfig[TContext] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceConfig[TContext]]
    }
    
    extension [Self <: DataSourceConfig[?], TContext](x: Self & DataSourceConfig[TContext]) {
      
      inline def setCache(value: KeyValueCache[String]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
