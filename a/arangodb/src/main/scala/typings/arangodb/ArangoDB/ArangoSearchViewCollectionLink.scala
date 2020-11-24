package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.arangodbStrings.id
import typings.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArangoSearchViewCollectionLink extends js.Object {
  
  var analyzers: js.UndefOr[js.Array[String]] = js.native
  
  var fields: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.native
  
  var includeAllFields: js.UndefOr[Boolean] = js.native
  
  var storeValues: js.UndefOr[none | id] = js.native
  
  var trackListPositions: js.UndefOr[Boolean] = js.native
}
object ArangoSearchViewCollectionLink {
  
  @scala.inline
  def apply(): ArangoSearchViewCollectionLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewCollectionLink]
  }
  
  @scala.inline
  implicit class ArangoSearchViewCollectionLinkOps[Self <: ArangoSearchViewCollectionLink] (val x: Self) extends AnyVal {
    
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
    def setAnalyzersVarargs(value: String*): Self = this.set("analyzers", js.Array(value :_*))
    
    @scala.inline
    def setAnalyzers(value: js.Array[String]): Self = this.set("analyzers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalyzers: Self = this.set("analyzers", js.undefined)
    
    @scala.inline
    def setFields(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setIncludeAllFields(value: Boolean): Self = this.set("includeAllFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAllFields: Self = this.set("includeAllFields", js.undefined)
    
    @scala.inline
    def setStoreValues(value: none | id): Self = this.set("storeValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreValues: Self = this.set("storeValues", js.undefined)
    
    @scala.inline
    def setTrackListPositions(value: Boolean): Self = this.set("trackListPositions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackListPositions: Self = this.set("trackListPositions", js.undefined)
  }
}
