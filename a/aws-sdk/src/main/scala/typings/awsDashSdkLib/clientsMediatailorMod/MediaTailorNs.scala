package typings
package awsDashSdkLib.clientsMediatailorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/mediatailor", "MediaTailor")
@js.native
object MediaTailorNs extends js.Object {
  
  trait CdnConfiguration extends js.Object {
    /**
         * A non-default content delivery network (CDN) to serve ad segments. By default, AWS Elemental MediaTailor uses Amazon CloudFront with default cache settings as its CDN for ad segments. To set up an alternate CDN, create a rule in your CDN for the following origin: ads.mediatailor.&lt;region>.amazonaws.com. Then specify the rule's name in this AdSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for ad segments.
         */
    var AdSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
    /**
         * A content delivery network (CDN) to cache content segments, so that content requests don’t always have to go to the origin server. First, create a rule in your CDN for the content segment origin server. Then specify the rule's name in this ContentSegmentUrlPrefix. When AWS Elemental MediaTailor serves a manifest, it reports your CDN as the source for content segments.
         */
    var ContentSegmentUrlPrefix: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DeletePlaybackConfigurationRequest extends js.Object {
    /**
         * The identifier for the configuration.
         */
    var Name: __string
  }
  
  
  trait DeletePlaybackConfigurationResponse extends js.Object
  
  
  trait GetPlaybackConfigurationRequest extends js.Object {
    /**
         * The identifier for the configuration.
         */
    var Name: __string
  }
  
  
  trait GetPlaybackConfigurationResponse extends js.Object {
    /**
         * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25000 characters.
         */
    var AdDecisionServerUrl: js.UndefOr[__string] = js.undefined
    /**
         * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
         */
    var CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined
    /**
         * The configuration for HLS content. 
         */
    var HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined
    /**
         * The identifier for the configuration.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting. 
         */
    var PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined
    /**
         * The URL that the player uses to initialize a session that uses client-side reporting. 
         */
    var SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined
    /**
         * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
         */
    var SlateAdUrl: js.UndefOr[__string] = js.undefined
    /**
         * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
         */
    var VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait HlsConfiguration extends js.Object {
    /**
         * The URL that is used to initiate a playback session for devices that support Apple HLS. The session uses server-side reporting.
         */
    var ManifestEndpointPrefix: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListPlaybackConfigurationsRequest extends js.Object {
    /**
         * Maximum number of records to return. 
         */
    var MaxResults: js.UndefOr[__integerMin1Max100] = js.undefined
    /**
         * Pagination token returned by the GET list request when results overrun the meximum allowed. Use the token to fetch the next page of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait ListPlaybackConfigurationsResponse extends js.Object {
    /**
         * Array of playback configurations. This may be all of the available configurations or a subset, depending on the settings you provide and on the total number of configurations stored. 
         */
    var Items: js.UndefOr[__listOfPlaybackConfigurations] = js.undefined
    /**
         * Pagination token returned by the GET list request when results overrun the meximum allowed. Use the token to fetch the next page of results.
         */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  
  trait PlaybackConfiguration extends js.Object {
    /**
         * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25000 characters.
         */
    var AdDecisionServerUrl: js.UndefOr[__string] = js.undefined
    /**
         * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
         */
    var CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined
    /**
         * The identifier for the configuration.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
         */
    var SlateAdUrl: js.UndefOr[__string] = js.undefined
    /**
         * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
         */
    var VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait PutPlaybackConfigurationRequest extends js.Object {
    /**
         * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is 25000 characters.
         */
    var AdDecisionServerUrl: js.UndefOr[__string] = js.undefined
    /**
         * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
         */
    var CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined
    /**
         * The identifier for the configuration.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
         */
    var SlateAdUrl: js.UndefOr[__string] = js.undefined
    /**
         * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
         */
    var VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
  }
  
  
  trait PutPlaybackConfigurationResponse extends js.Object {
    /**
         * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed when calling the ADS. Alternately, for testing, you can provide a static VAST URL. The maximum length is 25000 characters.
         */
    var AdDecisionServerUrl: js.UndefOr[__string] = js.undefined
    /**
         * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment management. 
         */
    var CdnConfiguration: js.UndefOr[CdnConfiguration] = js.undefined
    /**
         * The configuration for HLS content. 
         */
    var HlsConfiguration: js.UndefOr[HlsConfiguration] = js.undefined
    /**
         * The identifier for the configuration.
         */
    var Name: js.UndefOr[__string] = js.undefined
    /**
         * The URL that the player accesses to get a manifest from AWS Elemental MediaTailor. This session will use server-side reporting. 
         */
    var PlaybackEndpointPrefix: js.UndefOr[__string] = js.undefined
    /**
         * The URL that the player uses to initialize a session that uses client-side reporting. 
         */
    var SessionInitializationEndpointPrefix: js.UndefOr[__string] = js.undefined
    /**
         * URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the slate is required because AWS Elemental MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a high-quality asset that contains both audio and video. 
         */
    var SlateAdUrl: js.UndefOr[__string] = js.undefined
    /**
         * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
         */
    var VideoContentSourceUrl: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes the configuration for the specified name. 
       */
    def deletePlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration for the specified name. 
       */
    def deletePlaybackConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration for the specified name. 
       */
    def deletePlaybackConfiguration(params: DeletePlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes the configuration for the specified name. 
       */
    def deletePlaybackConfiguration(
      params: DeletePlaybackConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeletePlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeletePlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration for the specified name. 
       */
    def getPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration for the specified name. 
       */
    def getPlaybackConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration for the specified name. 
       */
    def getPlaybackConfiguration(params: GetPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the configuration for the specified name. 
       */
    def getPlaybackConfiguration(
      params: GetPlaybackConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetPlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
       */
    def listPlaybackConfigurations(): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
       */
    def listPlaybackConfigurations(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlaybackConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
       */
    def listPlaybackConfigurations(params: ListPlaybackConfigurationsRequest): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of the configurations defined in AWS Elemental MediaTailor. You can specify a max number of configurations to return at a time. The default max is 50. Results are returned in pagefuls. If AWS Elemental MediaTailor has more configurations than the specified max, it provides parameters in the response that you can use to retrieve the next pageful. 
       */
    def listPlaybackConfigurations(
      params: ListPlaybackConfigurationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListPlaybackConfigurationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListPlaybackConfigurationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new configuration to AWS Elemental MediaTailor.
       */
    def putPlaybackConfiguration(): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new configuration to AWS Elemental MediaTailor.
       */
    def putPlaybackConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new configuration to AWS Elemental MediaTailor.
       */
    def putPlaybackConfiguration(params: PutPlaybackConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds a new configuration to AWS Elemental MediaTailor.
       */
    def putPlaybackConfiguration(
      params: PutPlaybackConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutPlaybackConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutPlaybackConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type __integerMin1Max100 = scala.Double
  type __listOfPlaybackConfigurations = js.Array[PlaybackConfiguration]
  type __string = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-04-23` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

