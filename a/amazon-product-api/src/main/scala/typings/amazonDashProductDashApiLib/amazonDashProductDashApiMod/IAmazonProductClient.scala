package typings
package amazonDashProductDashApiLib.amazonDashProductDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAmazonProductClient extends js.Object {
  def browseNodeLookup(query: IBrowseNodeLookupOptions): stdLib.Promise[js.Array[js.Object]] = js.native
  def browseNodeLookup(query: IBrowseNodeLookupOptions, callback: IAmazonProductQueryCallback): stdLib.Promise[js.Array[js.Object]] = js.native
  def itemLookup(query: IItemLookupOptions): stdLib.Promise[js.Array[js.Object]] = js.native
  def itemLookup(query: IItemLookupOptions, callback: IAmazonProductQueryCallback): stdLib.Promise[js.Array[js.Object]] = js.native
  def itemSearch(query: IItemSearchOptions): stdLib.Promise[js.Array[js.Object]] = js.native
  def itemSearch(query: IItemSearchOptions, callback: IAmazonProductQueryCallback): stdLib.Promise[js.Array[js.Object]] = js.native
}

