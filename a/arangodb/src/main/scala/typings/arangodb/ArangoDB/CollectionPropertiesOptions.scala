package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionPropertiesOptions extends js.Object {
  
  var indexBuckets: js.UndefOr[Double] = js.native
  
  var journalSize: js.UndefOr[Double] = js.native
  
  var replicationFactor: js.UndefOr[Double] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object CollectionPropertiesOptions {
  
  @scala.inline
  def apply(): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
  
  @scala.inline
  implicit class CollectionPropertiesOptionsOps[Self <: CollectionPropertiesOptions] (val x: Self) extends AnyVal {
    
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
    def setIndexBuckets(value: Double): Self = this.set("indexBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexBuckets: Self = this.set("indexBuckets", js.undefined)
    
    @scala.inline
    def setJournalSize(value: Double): Self = this.set("journalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJournalSize: Self = this.set("journalSize", js.undefined)
    
    @scala.inline
    def setReplicationFactor(value: Double): Self = this.set("replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationFactor: Self = this.set("replicationFactor", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = this.set("waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForSync: Self = this.set("waitForSync", js.undefined)
  }
}
