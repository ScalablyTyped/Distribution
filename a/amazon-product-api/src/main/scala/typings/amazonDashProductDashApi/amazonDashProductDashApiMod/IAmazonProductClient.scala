package typings.amazonDashProductDashApi.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAmazonProductClient extends js.Object {
  def browseNodeLookup(query: IBrowseNodeLookupOptions): js.Promise[js.Array[js.Object]] = js.native
  def browseNodeLookup(query: IBrowseNodeLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
  def itemLookup(query: IItemLookupOptions): js.Promise[js.Array[js.Object]] = js.native
  def itemLookup(query: IItemLookupOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
  def itemSearch(query: IItemSearchOptions): js.Promise[js.Array[js.Object]] = js.native
  def itemSearch(query: IItemSearchOptions, callback: IAmazonProductQueryCallback): js.Promise[js.Array[js.Object]] = js.native
}

