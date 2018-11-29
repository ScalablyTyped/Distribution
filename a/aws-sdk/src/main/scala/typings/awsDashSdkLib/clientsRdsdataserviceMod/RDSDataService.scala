package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDataService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RDSDataService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ClientConfiguration = js.native
  /**
     * Executes any SQL statement on the target database synchronously
     */
  def executeSql(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes any SQL statement on the target database synchronously
     */
  def executeSql(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes any SQL statement on the target database synchronously
     */
  def executeSql(params: awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Executes any SQL statement on the target database synchronously
     */
  def executeSql(
    params: awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsRdsdataserviceMod.RDSDataServiceNs.ExecuteSqlResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

