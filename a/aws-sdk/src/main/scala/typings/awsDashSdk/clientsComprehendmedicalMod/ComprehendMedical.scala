package typings.awsDashSdk.clientsComprehendmedicalMod

import typings.awsDashSdk.libConfigMod.ConfigBase
import typings.awsDashSdk.libErrorMod.AWSError
import typings.awsDashSdk.libRequestMod.Request
import typings.awsDashSdk.libServiceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedical extends Service {
  @JSName("config")
  var config_ComprehendMedical: ConfigBase with ClientConfiguration = js.native
  /**
    *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(params: DetectEntitiesRequest): Request[DetectEntitiesResponse, AWSError] = js.native
  def detectEntities(
    params: DetectEntitiesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectEntitiesResponse, Unit]
  ): Request[DetectEntitiesResponse, AWSError] = js.native
  /**
    *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(): Request[DetectPHIResponse, AWSError] = js.native
  def detectPHI(callback: js.Function2[/* err */ AWSError, /* data */ DetectPHIResponse, Unit]): Request[DetectPHIResponse, AWSError] = js.native
  /**
    *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(params: DetectPHIRequest): Request[DetectPHIResponse, AWSError] = js.native
  def detectPHI(
    params: DetectPHIRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DetectPHIResponse, Unit]
  ): Request[DetectPHIResponse, AWSError] = js.native
}

