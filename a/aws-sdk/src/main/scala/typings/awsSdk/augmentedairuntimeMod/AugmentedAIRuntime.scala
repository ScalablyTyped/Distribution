package typings.awsSdk.augmentedairuntimeMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AugmentedAIRuntime extends Service {
  
  @JSName("config")
  var config_AugmentedAIRuntime: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes the specified human loop for a flow definition. If the human loop was deleted, this operation will return a ResourceNotFoundException. 
    */
  def deleteHumanLoop(): Request[DeleteHumanLoopResponse, AWSError] = js.native
  def deleteHumanLoop(callback: js.Function2[/* err */ AWSError, /* data */ DeleteHumanLoopResponse, Unit]): Request[DeleteHumanLoopResponse, AWSError] = js.native
  /**
    * Deletes the specified human loop for a flow definition. If the human loop was deleted, this operation will return a ResourceNotFoundException. 
    */
  def deleteHumanLoop(params: DeleteHumanLoopRequest): Request[DeleteHumanLoopResponse, AWSError] = js.native
  def deleteHumanLoop(
    params: DeleteHumanLoopRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteHumanLoopResponse, Unit]
  ): Request[DeleteHumanLoopResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified human loop. If the human loop was deleted, this operation will return a ResourceNotFoundException error. 
    */
  def describeHumanLoop(): Request[DescribeHumanLoopResponse, AWSError] = js.native
  def describeHumanLoop(callback: js.Function2[/* err */ AWSError, /* data */ DescribeHumanLoopResponse, Unit]): Request[DescribeHumanLoopResponse, AWSError] = js.native
  /**
    * Returns information about the specified human loop. If the human loop was deleted, this operation will return a ResourceNotFoundException error. 
    */
  def describeHumanLoop(params: DescribeHumanLoopRequest): Request[DescribeHumanLoopResponse, AWSError] = js.native
  def describeHumanLoop(
    params: DescribeHumanLoopRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeHumanLoopResponse, Unit]
  ): Request[DescribeHumanLoopResponse, AWSError] = js.native
  
  /**
    * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not be included.
    */
  def listHumanLoops(): Request[ListHumanLoopsResponse, AWSError] = js.native
  def listHumanLoops(callback: js.Function2[/* err */ AWSError, /* data */ ListHumanLoopsResponse, Unit]): Request[ListHumanLoopsResponse, AWSError] = js.native
  /**
    * Returns information about human loops, given the specified parameters. If a human loop was deleted, it will not be included.
    */
  def listHumanLoops(params: ListHumanLoopsRequest): Request[ListHumanLoopsResponse, AWSError] = js.native
  def listHumanLoops(
    params: ListHumanLoopsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListHumanLoopsResponse, Unit]
  ): Request[ListHumanLoopsResponse, AWSError] = js.native
  
  /**
    * Starts a human loop, provided that at least one activation condition is met.
    */
  def startHumanLoop(): Request[StartHumanLoopResponse, AWSError] = js.native
  def startHumanLoop(callback: js.Function2[/* err */ AWSError, /* data */ StartHumanLoopResponse, Unit]): Request[StartHumanLoopResponse, AWSError] = js.native
  /**
    * Starts a human loop, provided that at least one activation condition is met.
    */
  def startHumanLoop(params: StartHumanLoopRequest): Request[StartHumanLoopResponse, AWSError] = js.native
  def startHumanLoop(
    params: StartHumanLoopRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartHumanLoopResponse, Unit]
  ): Request[StartHumanLoopResponse, AWSError] = js.native
  
  /**
    * Stops the specified human loop.
    */
  def stopHumanLoop(): Request[StopHumanLoopResponse, AWSError] = js.native
  def stopHumanLoop(callback: js.Function2[/* err */ AWSError, /* data */ StopHumanLoopResponse, Unit]): Request[StopHumanLoopResponse, AWSError] = js.native
  /**
    * Stops the specified human loop.
    */
  def stopHumanLoop(params: StopHumanLoopRequest): Request[StopHumanLoopResponse, AWSError] = js.native
  def stopHumanLoop(
    params: StopHumanLoopRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopHumanLoopResponse, Unit]
  ): Request[StopHumanLoopResponse, AWSError] = js.native
}
