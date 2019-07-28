package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchDimensionConfiguration extends js.Object {
  /**
    * The default value of the dimension that is published to Amazon CloudWatch if you don't provide the value of the dimension when you send an email. This value has to meet the following criteria:   It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var DefaultDimensionValue: typings.awsDashSdk.clientsPinpointemailMod.DefaultDimensionValue
  /**
    * The name of an Amazon CloudWatch dimension associated with an email sending metric. The name has to meet the following criteria:   It can only contain ASCII letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-).   It can contain no more than 256 characters.  
    */
  var DimensionName: typings.awsDashSdk.clientsPinpointemailMod.DimensionName
  /**
    * The location where Amazon Pinpoint finds the value of a dimension to publish to Amazon CloudWatch. If you want Amazon Pinpoint to use the message tags that you specify using an X-SES-MESSAGE-TAGS header or a parameter to the SendEmail/SendRawEmail API, choose messageTag. If you want Amazon Pinpoint to use your own email headers, choose emailHeader. If you want Amazon Pinpoint to use link tags, choose linkTags.
    */
  var DimensionValueSource: typings.awsDashSdk.clientsPinpointemailMod.DimensionValueSource
}

object CloudWatchDimensionConfiguration {
  @scala.inline
  def apply(
    DefaultDimensionValue: DefaultDimensionValue,
    DimensionName: DimensionName,
    DimensionValueSource: DimensionValueSource
  ): CloudWatchDimensionConfiguration = {
    val __obj = js.Dynamic.literal(DefaultDimensionValue = DefaultDimensionValue, DimensionName = DimensionName, DimensionValueSource = DimensionValueSource.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudWatchDimensionConfiguration]
  }
}

