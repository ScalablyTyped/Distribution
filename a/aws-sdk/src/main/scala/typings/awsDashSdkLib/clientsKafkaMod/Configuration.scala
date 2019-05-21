package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Configuration extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the configuration.
    */
  var Arn: __string
  /**
    * The time when the configuration was created.
    */
  var CreationTime: __timestampIso8601
  /**
    * The description of the configuration.
    */
  var Description: __string
  /**
    * An array of the versions of Apache Kafka with which you can use this MSK configuration. You can use this configuration for an MSK cluster only if the Apache Kafka version specified for the cluster appears in this array.
    */
  var KafkaVersions: __listOf__string
  /**
    * Latest revision of the configuration.
    */
  var LatestRevision: ConfigurationRevision
  /**
    * The name of the configuration.
    */
  var Name: __string
}

object Configuration {
  @scala.inline
  def apply(
    Arn: __string,
    CreationTime: __timestampIso8601,
    Description: __string,
    KafkaVersions: __listOf__string,
    LatestRevision: ConfigurationRevision,
    Name: __string
  ): Configuration = {
    val __obj = js.Dynamic.literal(Arn = Arn, CreationTime = CreationTime, Description = Description, KafkaVersions = KafkaVersions, LatestRevision = LatestRevision, Name = Name)
  
    __obj.asInstanceOf[Configuration]
  }
}

