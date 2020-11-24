package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean] = js.native
  
  var count: js.UndefOr[Boolean] = js.native
  
  var failOnWarning: js.UndefOr[Boolean] = js.native
  
  var fullCount: js.UndefOr[Boolean] = js.native
  
  var intermediateCommitCount: js.UndefOr[Double] = js.native
  
  var intermediateCommitSize: js.UndefOr[Double] = js.native
  
  var maxNumberOfPlans: js.UndefOr[Double] = js.native
  
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.native
  
  var maxWarningCount: js.UndefOr[Double] = js.native
  
  var memoryLimit: js.UndefOr[Double] = js.native
  
  var profile: js.UndefOr[Boolean] = js.native
  
  // enterprise
  var skipInaccessibleCollections: js.UndefOr[Boolean] = js.native
  
  var stream: js.UndefOr[Boolean] = js.native
}
object QueryOptions {
  
  @scala.inline
  def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit class QueryOptionsOps[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
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
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCount(value: Boolean): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setFailOnWarning(value: Boolean): Self = this.set("failOnWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnWarning: Self = this.set("failOnWarning", js.undefined)
    
    @scala.inline
    def setFullCount(value: Boolean): Self = this.set("fullCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullCount: Self = this.set("fullCount", js.undefined)
    
    @scala.inline
    def setIntermediateCommitCount(value: Double): Self = this.set("intermediateCommitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediateCommitCount: Self = this.set("intermediateCommitCount", js.undefined)
    
    @scala.inline
    def setIntermediateCommitSize(value: Double): Self = this.set("intermediateCommitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediateCommitSize: Self = this.set("intermediateCommitSize", js.undefined)
    
    @scala.inline
    def setMaxNumberOfPlans(value: Double): Self = this.set("maxNumberOfPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumberOfPlans: Self = this.set("maxNumberOfPlans", js.undefined)
    
    @scala.inline
    def setMaxTransactionsSize(value: Double): Self = this.set("maxTransactionsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTransactionsSize: Self = this.set("maxTransactionsSize", js.undefined)
    
    @scala.inline
    def setMaxWarningCount(value: Double): Self = this.set("maxWarningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWarningCount: Self = this.set("maxWarningCount", js.undefined)
    
    @scala.inline
    def setMemoryLimit(value: Double): Self = this.set("memoryLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryLimit: Self = this.set("memoryLimit", js.undefined)
    
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setSkipInaccessibleCollections(value: Boolean): Self = this.set("skipInaccessibleCollections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipInaccessibleCollections: Self = this.set("skipInaccessibleCollections", js.undefined)
    
    @scala.inline
    def setStream(value: Boolean): Self = this.set("stream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStream: Self = this.set("stream", js.undefined)
  }
}
