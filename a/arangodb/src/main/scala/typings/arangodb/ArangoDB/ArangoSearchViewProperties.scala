package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.SegmentThreshold
import typings.arangodb.arangodbStrings.arangosearch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArangoSearchViewProperties extends StObject {
  
  var cleanupIntervalStep: Double = js.native
  
  var consolidationIntervalMsec: Double = js.native
  
  var consolidationPolicy: SegmentThreshold = js.native
  
  var id: String = js.native
  
  var links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]] = js.native
  
  var name: String = js.native
  
  var `type`: arangosearch = js.native
}
object ArangoSearchViewProperties {
  
  @scala.inline
  def apply(
    cleanupIntervalStep: Double,
    consolidationIntervalMsec: Double,
    consolidationPolicy: SegmentThreshold,
    id: String,
    links: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]],
    name: String,
    `type`: arangosearch
  ): ArangoSearchViewProperties = {
    val __obj = js.Dynamic.literal(cleanupIntervalStep = cleanupIntervalStep.asInstanceOf[js.Any], consolidationIntervalMsec = consolidationIntervalMsec.asInstanceOf[js.Any], consolidationPolicy = consolidationPolicy.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArangoSearchViewProperties]
  }
  
  @scala.inline
  implicit class ArangoSearchViewPropertiesMutableBuilder[Self <: ArangoSearchViewProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCleanupIntervalStep(value: Double): Self = StObject.set(x, "cleanupIntervalStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationIntervalMsec(value: Double): Self = StObject.set(x, "consolidationIntervalMsec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsolidationPolicy(value: SegmentThreshold): Self = StObject.set(x, "consolidationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: arangosearch): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
