package typings.awsSdk.clientsS3outpostsMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Outposts extends Service {
  
  @JSName("config")
  var config_S3Outposts: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an endpoint and associates it with the specified Outpost.  It can take up to 5 minutes for this action to finish.   Related actions include:    DeleteEndpoint     ListEndpoints   
    */
  def createEndpoint(): Request[CreateEndpointResult, AWSError] = js.native
  def createEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]): Request[CreateEndpointResult, AWSError] = js.native
  /**
    * Creates an endpoint and associates it with the specified Outpost.  It can take up to 5 minutes for this action to finish.   Related actions include:    DeleteEndpoint     ListEndpoints   
    */
  def createEndpoint(params: CreateEndpointRequest): Request[CreateEndpointResult, AWSError] = js.native
  def createEndpoint(
    params: CreateEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateEndpointResult, Unit]
  ): Request[CreateEndpointResult, AWSError] = js.native
  
  /**
    * Deletes an endpoint.  It can take up to 5 minutes for this action to finish.   Related actions include:    CreateEndpoint     ListEndpoints   
    */
  def deleteEndpoint(): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an endpoint.  It can take up to 5 minutes for this action to finish.   Related actions include:    CreateEndpoint     ListEndpoints   
    */
  def deleteEndpoint(params: DeleteEndpointRequest): Request[js.Object, AWSError] = js.native
  def deleteEndpoint(
    params: DeleteEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Lists endpoints associated with the specified Outpost.  Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listEndpoints(): Request[ListEndpointsResult, AWSError] = js.native
  def listEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]): Request[ListEndpointsResult, AWSError] = js.native
  /**
    * Lists endpoints associated with the specified Outpost.  Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listEndpoints(params: ListEndpointsRequest): Request[ListEndpointsResult, AWSError] = js.native
  def listEndpoints(
    params: ListEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListEndpointsResult, Unit]
  ): Request[ListEndpointsResult, AWSError] = js.native
  
  /**
    * Lists the Outposts with S3 on Outposts capacity for your Amazon Web Services account. Includes S3 on Outposts that you have access to as the Outposts owner, or as a shared user from Resource Access Manager (RAM). 
    */
  def listOutpostsWithS3(): Request[ListOutpostsWithS3Result, AWSError] = js.native
  def listOutpostsWithS3(callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsWithS3Result, Unit]): Request[ListOutpostsWithS3Result, AWSError] = js.native
  /**
    * Lists the Outposts with S3 on Outposts capacity for your Amazon Web Services account. Includes S3 on Outposts that you have access to as the Outposts owner, or as a shared user from Resource Access Manager (RAM). 
    */
  def listOutpostsWithS3(params: ListOutpostsWithS3Request): Request[ListOutpostsWithS3Result, AWSError] = js.native
  def listOutpostsWithS3(
    params: ListOutpostsWithS3Request,
    callback: js.Function2[/* err */ AWSError, /* data */ ListOutpostsWithS3Result, Unit]
  ): Request[ListOutpostsWithS3Result, AWSError] = js.native
  
  /**
    * Lists all endpoints associated with an Outpost that has been shared by Amazon Web Services Resource Access Manager (RAM). Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listSharedEndpoints(): Request[ListSharedEndpointsResult, AWSError] = js.native
  def listSharedEndpoints(callback: js.Function2[/* err */ AWSError, /* data */ ListSharedEndpointsResult, Unit]): Request[ListSharedEndpointsResult, AWSError] = js.native
  /**
    * Lists all endpoints associated with an Outpost that has been shared by Amazon Web Services Resource Access Manager (RAM). Related actions include:    CreateEndpoint     DeleteEndpoint   
    */
  def listSharedEndpoints(params: ListSharedEndpointsRequest): Request[ListSharedEndpointsResult, AWSError] = js.native
  def listSharedEndpoints(
    params: ListSharedEndpointsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSharedEndpointsResult, Unit]
  ): Request[ListSharedEndpointsResult, AWSError] = js.native
}
