package typings.arangodb.arangodbGeneralGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectingEdgesOptions extends js.Object {
  
  var edgeCollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var edgeExamples: js.UndefOr[Example] = js.native
  
  var vertex1CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
  
  var vertex2CollectionRestriction: js.UndefOr[js.Array[String] | String] = js.native
}
object ConnectingEdgesOptions {
  
  @scala.inline
  def apply(): ConnectingEdgesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectingEdgesOptions]
  }
  
  @scala.inline
  implicit class ConnectingEdgesOptionsOps[Self <: ConnectingEdgesOptions] (val x: Self) extends AnyVal {
    
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
    def setVertex1CollectionRestrictionVarargs(value: String*): Self = this.set("vertex1CollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setVertex1CollectionRestriction(value: js.Array[String] | String): Self = this.set("vertex1CollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertex1CollectionRestriction: Self = this.set("vertex1CollectionRestriction", js.undefined)
    
    @scala.inline
    def setVertex2CollectionRestrictionVarargs(value: String*): Self = this.set("vertex2CollectionRestriction", js.Array(value :_*))
    
    @scala.inline
    def setVertex2CollectionRestriction(value: js.Array[String] | String): Self = this.set("vertex2CollectionRestriction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertex2CollectionRestriction: Self = this.set("vertex2CollectionRestriction", js.undefined)
  }
}
