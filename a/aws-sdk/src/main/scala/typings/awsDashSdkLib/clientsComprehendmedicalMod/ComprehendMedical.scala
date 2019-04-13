package typings
package awsDashSdkLib.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedical
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ComprehendMedical: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
    */
  def detectEntities(params: DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectEntities(
    params: DetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectEntitiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectPHI(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectPHIResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
    */
  def detectPHI(params: DetectPHIRequest): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def detectPHI(
    params: DetectPHIRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DetectPHIResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DetectPHIResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

