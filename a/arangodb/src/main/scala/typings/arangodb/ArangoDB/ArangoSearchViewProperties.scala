package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StringDictionary
import typings.arangodb.anon.SegmentThreshold
import typings.arangodb.arangodbStrings.arangosearch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArangoSearchViewProperties extends js.Object {
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
  implicit class ArangoSearchViewPropertiesOps[Self <: ArangoSearchViewProperties] (val x: Self) extends AnyVal {
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
    def setConsolidationIntervalMsec(value: Double): Self = this.set("consolidationIntervalMsec", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsolidationPolicy(value: SegmentThreshold): Self = this.set("consolidationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinks(value: StringDictionary[js.UndefOr[ArangoSearchViewCollectionLink]]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: arangosearch): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

