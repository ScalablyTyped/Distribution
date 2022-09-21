package typings.apolloServerCaching

import typings.apolloServerCaching.keyValueCacheMod.KeyValueCache
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testsuiteMod {
  
  @JSImport("apollo-server-caching/dist/testsuite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def runKeyValueCacheTests(keyValueCache: KeyValueCache[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("runKeyValueCacheTests")(keyValueCache.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def runKeyValueCacheTests(keyValueCache: KeyValueCache[String], tick: js.Function1[/* ms */ Double, Unit]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("runKeyValueCacheTests")(keyValueCache.asInstanceOf[js.Any], tick.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
