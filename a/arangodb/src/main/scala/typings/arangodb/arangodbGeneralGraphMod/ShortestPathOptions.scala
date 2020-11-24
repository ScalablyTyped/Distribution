package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShortestPathOptions extends js.Object {
  
  var defaultWeight: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[EdgeDirection] = js.native
  
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var endVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var startVertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var weight: js.UndefOr[String] = js.native
}
object ShortestPathOptions {
  
  @scala.inline
  def apply(): ShortestPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortestPathOptions]
  }
  
  @scala.inline
  implicit class ShortestPathOptionsOps[Self <: ShortestPathOptions] (val x: Self) extends AnyVal {
    
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
    def setDefaultWeight(value: Double): Self = this.set("defaultWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultWeight: Self = this.set("defaultWeight", js.undefined)
    
    @scala.inline
    def setDirection(value: EdgeDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setEdgeCollectionRestrictionVarargs(value: String*): Self = this.set("edgeCollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setEdgeCollectionRestriction(value: js.Array[String] | String): Self = this.set("edgeCollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeCollectionRestriction: Self = this.set("edgeCollectionRestriction", js.undefined)
    
    @scala.inline
    def setEndVertexCollectionRestrictionVarargs(value: String*): Self = this.set("endVertexCollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setEndVertexCollectionRestriction(value: js.Array[String] | String): Self = this.set("endVertexCollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndVertexCollectionRestriction: Self = this.set("endVertexCollectionRestriction", js.undefined)
    
    @scala.inline
    def setStartVertexCollectionRestrictionVarargs(value: String*): Self = this.set("startVertexCollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setStartVertexCollectionRestriction(value: js.Array[String] | String): Self = this.set("startVertexCollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartVertexCollectionRestriction: Self = this.set("startVertexCollectionRestriction", js.undefined)
    
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
