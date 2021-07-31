package typings.apolloDatasource

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("apollo-datasource", "DataSource")
  @js.native
  abstract class DataSource[TContext] () extends StObject {
    
    var initialize: js.UndefOr[js.Function1[/* config */ DataSourceConfig[TContext], Unit | js.Promise[Unit]]] = js.native
  }
  
  trait DataSourceConfig[TContext] extends StObject {
    
    var cache: KeyValueCache[String]
    
    var context: TContext
  }
  object DataSourceConfig {
    
    @scala.inline
    def apply[TContext](cache: KeyValueCache[String], context: TContext): DataSourceConfig[TContext] = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSourceConfig[TContext]]
    }
    
    @scala.inline
    implicit class DataSourceConfigMutableBuilder[Self <: DataSourceConfig[?], TContext] (val x: Self & DataSourceConfig[TContext]) extends AnyVal {
      
      @scala.inline
      def setCache(value: KeyValueCache[String]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
}
