package typings
package awsDashSdkLib.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComprehendMedical
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ComprehendMedical: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.ClientConfiguration = js.native
  /**
     *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
     */
  def detectEntities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
     */
  def detectEntities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
     */
  def detectEntities(params: awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for a variety of medical entities and returns specific information about them such as entity category, location, and confidence score on that information .
     */
  def detectEntities(
    params: awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectEntitiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
     */
  def detectPHI(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
     */
  def detectPHI(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
     */
  def detectPHI(params: awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  Inspects the clinical text for personal health information (PHI) entities and entity category, location, and confidence score on that information.
     */
  def detectPHI(
    params: awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsComprehendmedicalMod.ComprehendMedicalNs.DetectPHIResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

