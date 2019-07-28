package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompatibleVersionsMap extends js.Object {
  /**
    * The current version of Elasticsearch on which a domain is.
    */
  var SourceVersion: js.UndefOr[ElasticsearchVersionString] = js.undefined
  var TargetVersions: js.UndefOr[ElasticsearchVersionList] = js.undefined
}

object CompatibleVersionsMap {
  @scala.inline
  def apply(SourceVersion: ElasticsearchVersionString = null, TargetVersions: ElasticsearchVersionList = null): CompatibleVersionsMap = {
    val __obj = js.Dynamic.literal()
    if (SourceVersion != null) __obj.updateDynamic("SourceVersion")(SourceVersion)
    if (TargetVersions != null) __obj.updateDynamic("TargetVersions")(TargetVersions)
    __obj.asInstanceOf[CompatibleVersionsMap]
  }
}

