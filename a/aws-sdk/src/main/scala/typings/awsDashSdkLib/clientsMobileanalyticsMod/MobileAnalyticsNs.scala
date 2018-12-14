package typings
package awsDashSdkLib.clientsMobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mobileanalytics", "MobileAnalytics")
@js.native
object MobileAnalyticsNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Event extends js.Object {
    /**
         * A collection of key-value pairs that give additional context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
         */
    var attributes: js.UndefOr[MapOfStringToString] = js.undefined
    /**
         * A name signifying an event that occurred in your app. This is used for grouping and aggregating like events together for reporting purposes.
         */
    var eventType: String50Chars
    /**
         * A collection of key-value pairs that gives additional, measurable context to the event. The key-value pairs are specified by the developer. This collection can be empty or the attribute object can be omitted.
         */
    var metrics: js.UndefOr[MapOfStringToNumber] = js.undefined
    /**
         * The session the event occured within. 
         */
    var session: js.UndefOr[Session] = js.undefined
    /**
         * The time the event occurred in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
         */
    var timestamp: ISO8601Timestamp
    /**
         * The version of the event.
         */
    var version: js.UndefOr[String10Chars] = js.undefined
  }
  
  
  trait MapOfStringToNumber
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Double]
  
  
  trait MapOfStringToString
    extends /* key */ org.scalablytyped.runtime.StringDictionary[String0to1000Chars]
  
  
  trait PutEventsInput extends js.Object {
    /**
         * The client context including the client ID, app title, app version and package name.
         */
    var clientContext: String
    /**
         * The encoding used for the client context.
         */
    var clientContextEncoding: js.UndefOr[String] = js.undefined
    /**
         * An array of Event JSON objects
         */
    var events: EventListDefinition
  }
  
  
  trait Session extends js.Object {
    /**
         * The duration of the session.
         */
    var duration: js.UndefOr[Long] = js.undefined
    /**
         * A unique identifier for the session
         */
    var id: js.UndefOr[String50Chars] = js.undefined
    /**
         * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
         */
    var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
    /**
         * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
         */
    var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
       */
    def putEvents(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
       */
    def putEvents(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
       */
    def putEvents(params: PutEventsInput): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * The PutEvents operation records one or more events. You can have up to 1,500 unique custom events per app, any combination of up to 40 attributes and metrics per custom event, and any number of attribute or metric values.
       */
    def putEvents(
      params: PutEventsInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Double = scala.Double
  type EventListDefinition = js.Array[Event]
  type ISO8601Timestamp = java.lang.String
  type Long = scala.Double
  type String = java.lang.String
  type String0to1000Chars = java.lang.String
  type String10Chars = java.lang.String
  type String50Chars = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2014-06-05` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

