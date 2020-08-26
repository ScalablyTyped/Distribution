package typings.arangodb.collectionMod

import typings.arangodb.ArangoDB.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionStorageOptions extends js.Object {
  var autoUpdate: js.UndefOr[Boolean] = js.native
  var collection: String | Collection[_] = js.native
  var pruneExpired: js.UndefOr[Boolean] = js.native
  var ttl: js.UndefOr[Double] = js.native
}

object CollectionStorageOptions {
  @scala.inline
  def apply(collection: String | Collection[_]): CollectionStorageOptions = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionStorageOptions]
  }
  @scala.inline
  implicit class CollectionStorageOptionsOps[Self <: CollectionStorageOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollection(value: String | Collection[_]): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoUpdate(value: Boolean): Self = this.set("autoUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpdate: Self = this.set("autoUpdate", js.undefined)
    @scala.inline
    def setPruneExpired(value: Boolean): Self = this.set("pruneExpired", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePruneExpired: Self = this.set("pruneExpired", js.undefined)
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

