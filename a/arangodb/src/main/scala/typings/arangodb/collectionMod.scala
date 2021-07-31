package typings.arangodb

import typings.arangodb.ArangoDB.Collection
import typings.arangodb.Foxx.CollectionSessionStorage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionMod {
  
  @scala.inline
  def apply(options: String | Collection[js.Any]): CollectionSessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CollectionSessionStorage]
  @scala.inline
  def apply(options: CollectionStorageOptions): CollectionSessionStorage = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[CollectionSessionStorage]
  
  @JSImport("@arangodb/foxx/sessions/storages/collection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CollectionStorageOptions extends StObject {
    
    var autoUpdate: js.UndefOr[Boolean] = js.undefined
    
    var collection: String | Collection[js.Any]
    
    var pruneExpired: js.UndefOr[Boolean] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object CollectionStorageOptions {
    
    @scala.inline
    def apply(collection: String | Collection[js.Any]): CollectionStorageOptions = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollectionStorageOptions]
    }
    
    @scala.inline
    implicit class CollectionStorageOptionsMutableBuilder[Self <: CollectionStorageOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoUpdate(value: Boolean): Self = StObject.set(x, "autoUpdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoUpdateUndefined: Self = StObject.set(x, "autoUpdate", js.undefined)
      
      @scala.inline
      def setCollection(value: String | Collection[js.Any]): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPruneExpired(value: Boolean): Self = StObject.set(x, "pruneExpired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPruneExpiredUndefined: Self = StObject.set(x, "pruneExpired", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
