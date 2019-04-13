package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RDSDataService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_RDSDataService: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Executes any SQL statement on the target database synchronously
    */
  def executeSql(): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeSql(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Executes any SQL statement on the target database synchronously
    */
  def executeSql(params: ExecuteSqlRequest): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def executeSql(
    params: ExecuteSqlRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ExecuteSqlResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ExecuteSqlResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

