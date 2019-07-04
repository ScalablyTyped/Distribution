package typings
package apolloDashCacheLib.libCacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache/lib/cache", "ApolloCache")
@js.native
abstract class ApolloCache[TSerialized] ()
  extends apolloDashCacheLib.libTypesDataProxyMod.DataProxy {
  def diff[T](query: apolloDashCacheLib.libTypesCacheMod.CacheNs.DiffOptions): apolloDashCacheLib.libTypesCacheMod.CacheNs.DiffResult[T] = js.native
  def evict[TVariables](query: apolloDashCacheLib.libTypesCacheMod.CacheNs.EvictOptions[TVariables]): apolloDashCacheLib.libTypesCacheMod.CacheNs.EvictionResult = js.native
  def extract(): TSerialized = js.native
  def extract(optimistic: scala.Boolean): TSerialized = js.native
  def performTransaction(transaction: Transaction[TSerialized]): scala.Unit = js.native
  def read[T, TVariables](query: apolloDashCacheLib.libTypesCacheMod.CacheNs.ReadOptions[TVariables]): T | scala.Null = js.native
  def recordOptimisticTransaction(transaction: Transaction[TSerialized], id: java.lang.String): scala.Unit = js.native
  def removeOptimistic(id: java.lang.String): scala.Unit = js.native
  def reset(): js.Promise[scala.Unit] = js.native
  def restore(serializedState: TSerialized): ApolloCache[TSerialized] = js.native
  def transformDocument(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def transformForLink(document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.languageAstMod.DocumentNode = js.native
  def watch(watch: apolloDashCacheLib.libTypesCacheMod.CacheNs.WatchOptions): js.Function0[scala.Unit] = js.native
  def write[TResult, TVariables](write: apolloDashCacheLib.libTypesCacheMod.CacheNs.WriteOptions[TResult, TVariables]): scala.Unit = js.native
  def writeData[TData](hasIdData: apolloDashCacheLib.libTypesCacheMod.CacheNs.WriteDataOptions[TData]): scala.Unit = js.native
  def writeFragment[TData, TVariables](options: apolloDashCacheLib.libTypesCacheMod.CacheNs.WriteFragmentOptions[TData, TVariables]): scala.Unit = js.native
  def writeQuery[TData, TVariables](options: apolloDashCacheLib.libTypesCacheMod.CacheNs.WriteQueryOptions[TData, TVariables]): scala.Unit = js.native
}

