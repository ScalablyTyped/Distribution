package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArangoSearchViewPropertiesOptions extends StObject {
  
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
  implicit class ArangoSearchViewPropertiesOptionsMutableBuilder[Self <: ArangoSearchViewPropertiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupIntervalStep(value: Double): Self = StObject.set(x, "cleanupIntervalStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCleanupIntervalStepUndefined: Self = StObject.set(x, "cleanupIntervalStep", js.undefined)
    
    @scala.inline
    def setConsolidationIntervalMsec(value: Double): Self = StObject.set(x, "consolidationIntervalMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationIntervalMsecUndefined: Self = StObject.set(x, "consolidationIntervalMsec", js.undefined)
    
    @scala.inline
    def setConsolidationPolicy(value: Threshold): Self = StObject.set(x, "consolidationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationPolicyUndefined: Self = StObject.set(x, "consolidationPolicy", js.undefined)
    
    @scala.inline
    def setLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
  }
}
