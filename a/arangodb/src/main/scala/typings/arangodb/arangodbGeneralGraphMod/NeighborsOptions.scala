package typings.arangodb.arangodbGeneralGraphMod

import typings.arangodb.ArangoDB.EdgeDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeighborsOptions extends js.Object {
  
  var direction: js.UndefOr[EdgeDirection] = js.native
  
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var edgeExamples: js.UndefOr[Example] = js.native
  
  var maxDepth: js.UndefOr[Double] = js.native
  
  var minDepth: js.UndefOr[Double] = js.native
  
  var neighborExamples: js.UndefOr[Example] = js.native
  
  var vertexCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
}
object NeighborsOptions {
  
  @scala.inline
  def apply(): NeighborsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NeighborsOptions]
  }
  
  @scala.inline
  implicit class NeighborsOptionsOps[Self <: NeighborsOptions] (val x: Self) extends AnyVal {
    
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
    def setEdgeExamplesVarargs(value: (js.Object | String)*): Self = this.set("edgeExamples", js.Array(value :_*))
    
    @scala.inline
    def setEdgeExamples(value: Example): Self = this.set("edgeExamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdgeExamples: Self = this.set("edgeExamples", js.undefined)
    
    @scala.inline
    def setEdgeExamplesNull: Self = this.set("edgeExamples", null)
    
    @scala.inline
    def setMaxDepth(value: Double): Self = this.set("maxDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxDepth: Self = this.set("maxDepth", js.undefined)
    
    @scala.inline
    def setMinDepth(value: Double): Self = this.set("minDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinDepth: Self = this.set("minDepth", js.undefined)
    
    @scala.inline
    def setNeighborExamplesVarargs(value: (js.Object | String)*): Self = this.set("neighborExamples", js.Array(value :_*))
    
    @scala.inline
    def setNeighborExamples(value: Example): Self = this.set("neighborExamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeighborExamples: Self = this.set("neighborExamples", js.undefined)
    
    @scala.inline
    def setNeighborExamplesNull: Self = this.set("neighborExamples", null)
    
    @scala.inline
    def setVertexCollectionRestrictionVarargs(value: String*): Self = this.set("vertexCollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setVertexCollectionRestriction(value: js.Array[String] | String): Self = this.set("vertexCollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertexCollectionRestriction: Self = this.set("vertexCollectionRestriction", js.undefined)
  }
}
