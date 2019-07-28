package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionConfigWithTags extends js.Object {
  /**
    * A distribution configuration.
    */
  var DistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.DistributionConfig
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsDashSdk.clientsCloudfrontMod.Tags
}

object DistributionConfigWithTags {
  @scala.inline
  def apply(DistributionConfig: DistributionConfig, Tags: Tags): DistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(DistributionConfig = DistributionConfig, Tags = Tags)
  
    __obj.asInstanceOf[DistributionConfigWithTags]
  }
}

