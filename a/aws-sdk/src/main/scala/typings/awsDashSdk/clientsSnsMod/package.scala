package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSnsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Uint8Array

  type ActionsList = js.Array[action]
  type AmazonResourceName = java.lang.String
  type Binary = Buffer | Uint8Array | Blob | java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type DelegatesList = js.Array[delegate]
  type ListOfEndpoints = js.Array[Endpoint]
  type ListOfPlatformApplications = js.Array[PlatformApplication]
  type ListString = js.Array[String]
  type MapStringToString = StringDictionary[String]
  type MessageAttributeMap = StringDictionary[MessageAttributeValue]
  type PhoneNumber = java.lang.String
  type PhoneNumberList = js.Array[PhoneNumber]
  type String = java.lang.String
  type SubscriptionAttributesMap = StringDictionary[attributeValue]
  type SubscriptionsList = js.Array[Subscription]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TopicAttributesMap = StringDictionary[attributeValue]
  type TopicsList = js.Array[Topic]
  type account = java.lang.String
  type action = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-03-31`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type attributeName = java.lang.String
  type attributeValue = java.lang.String
  type authenticateOnUnsubscribe = java.lang.String
  type delegate = java.lang.String
  type endpoint = java.lang.String
  type label = java.lang.String
  type message = java.lang.String
  type messageId = java.lang.String
  type messageStructure = java.lang.String
  type nextToken = java.lang.String
  type protocol = java.lang.String
  type subject = java.lang.String
  type subscriptionARN = java.lang.String
  type token = java.lang.String
  type topicARN = java.lang.String
  type topicName = java.lang.String
}
