package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.Threshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArangoSearchViewPropertiesOptions extends StObject {
  
  var cleanupIntervalStep: js.UndefOr[Double] = js.undefined
  
  var consolidationIntervalMsec: js.UndefOr[Double] = js.undefined
  
  var consolidationPolicy: js.UndefOr[Threshold] = js.undefined
  
  var links: js.UndefOr[StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]] = js.undefined
}
object ArangoSearchViewPropertiesOptions {
  
  inline def apply(): ArangoSearchViewPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArangoSearchViewPropertiesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArangoSearchViewPropertiesOptions] (val x: Self) extends AnyVal {
    
    inline def setCleanupIntervalStep(value: Double): Self = StObject.set(x, "cleanupIntervalStep", value.asInstanceOf[js.Any])
    
    inline def setCleanupIntervalStepUndefined: Self = StObject.set(x, "cleanupIntervalStep", js.undefined)
    
    inline def setConsolidationIntervalMsec(value: Double): Self = StObject.set(x, "consolidationIntervalMsec", value.asInstanceOf[js.Any])
    
    inline def setConsolidationIntervalMsecUndefined: Self = StObject.set(x, "consolidationIntervalMsec", js.undefined)
    
    inline def setConsolidationPolicy(value: Threshold): Self = StObject.set(x, "consolidationPolicy", value.asInstanceOf[js.Any])
    
    inline def setConsolidationPolicyUndefined: Self = StObject.set(x, "consolidationPolicy", js.undefined)
    
    inline def setLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
  }
}
