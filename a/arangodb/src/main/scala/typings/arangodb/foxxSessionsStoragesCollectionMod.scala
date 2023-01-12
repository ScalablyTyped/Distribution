package typings.arangodb

import typings.arangodb.ArangoDB.Collection
import typings.arangodb.Foxx.CollectionSessionStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foxxSessionsStoragesCollectionMod {
  
  inline def apply(options: String | Collection[Any]): CollectionSessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CollectionSessionStorage]
  inline def apply(options: CollectionStorageOptions): CollectionSessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CollectionSessionStorage]
  
  @JSImport("@arangodb/foxx/sessions/storages/collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CollectionStorageOptions extends StObject {
    
    var autoUpdate: js.UndefOr[Boolean] = js.undefined
    
    var collection: String | Collection[Any]
    
    var pruneExpired: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object CollectionStorageOptions {
    
    inline def apply(collection: String | Collection[Any]): CollectionStorageOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionStorageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CollectionStorageOptions] (val x: Self) extends AnyVal {
      
      inline def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
      
      inline def setCollection(value: String | Collection[Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setPruneExpired(value: Boolean): Self = StObject.set(x, "pruneExpired", value.asInstanceOf[js.Any])
      
      inline def setPruneExpiredUndefined: Self = StObject.set(x, "pruneExpired", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
