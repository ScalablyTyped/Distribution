package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArangoSearchViewPropertiesOptions extends js.Object {
  
  var cleanupIntervalStep: js.UndefOr[Double] = js.native
  
  var consolidationIntervalMsec: js.UndefOr[Double] = js.native
  
  var consolidationPolicy: js.UndefOr[Threshold] = js.native
  
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.native
}
object ArangoSearchViewPropertiesOptions {
  
  @scala.inline
  def apply(): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
  
  @scala.inline
  implicit class ArangoSearchViewPropertiesOptionsOps[Self <: ArangoSearchViewPropertiesOptions] (val x: Self) extends AnyVal {
    
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
    def setCleanupIntervalStep(value: Double): Self = this.set("cleanupIntervalStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanupIntervalStep: Self = this.set("cleanupIntervalStep", js.undefined)
    
    @scala.inline
    def setConsolidationIntervalMsec(value: Double): Self = this.set("consolidationIntervalMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsolidationIntervalMsec: Self = this.set("consolidationIntervalMsec", js.undefined)
    
    @scala.inline
    def setConsolidationPolicy(value: Threshold): Self = this.set("consolidationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsolidationPolicy: Self = this.set("consolidationPolicy", js.undefined)
    
    @scala.inline
    def setLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
  }
}
