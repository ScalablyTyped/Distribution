package typings.apolloDashCache.libCacheMod

import typings.apolloDashCache.libTypesCacheMod.CacheNs.DiffOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.DiffResult
import typings.apolloDashCache.libTypesCacheMod.CacheNs.EvictOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.EvictionResult
import typings.apolloDashCache.libTypesCacheMod.CacheNs.ReadOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.WatchOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.WriteDataOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.WriteFragmentOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.WriteOptions
import typings.apolloDashCache.libTypesCacheMod.CacheNs.WriteQueryOptions
import typings.apolloDashCache.libTypesDataProxyMod.DataProxy
import typings.graphql.languageAstMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache/lib/cache", "ApolloCache")
@js.native
abstract class ApolloCache[TSerialized] () extends DataProxy {
  def diff[T](query: DiffOptions): DiffResult[T] = js.native
  def evict[TVariables](query: EvictOptions[TVariables]): EvictionResult = js.native
  def extract(): TSerialized = js.native
  def extract(optimistic: Boolean): TSerialized = js.native
  def performTransaction(transaction: Transaction[TSerialized]): Unit = js.native
  def read[T, TVariables](query: ReadOptions[TVariables]): T | Null = js.native
  def recordOptimisticTransaction(transaction: Transaction[TSerialized], id: String): Unit = js.native
  def removeOptimistic(id: String): Unit = js.native
  def reset(): js.Promise[Unit] = js.native
  def restore(serializedState: TSerialized): ApolloCache[TSerialized] = js.native
  def transformDocument(document: DocumentNode): DocumentNode = js.native
  def transformForLink(document: DocumentNode): DocumentNode = js.native
  def watch(watch: WatchOptions): js.Function0[Unit] = js.native
  def write[TResult, TVariables](write: WriteOptions[TResult, TVariables]): Unit = js.native
  def writeData[TData](hasIdData: WriteDataOptions[TData]): Unit = js.native
  def writeFragment[TData, TVariables](options: WriteFragmentOptions[TData, TVariables]): Unit = js.native
  def writeQuery[TData, TVariables](options: WriteQueryOptions[TData, TVariables]): Unit = js.native
}

