package typings
package awsDashParamDashStoreLib.awsDashParamDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterQuery extends js.Object {
  def decryption(enabled: scala.Boolean): ParameterQuery = js.native
  def execute(): js.Promise[
    awsDashSdkLib.clientsSsmMod.ParameterList | awsDashSdkLib.clientsSsmMod.Parameter | awsDashSdkLib.clientsSsmMod.GetParametersResult
  ] = js.native
  def executeSync(): awsDashSdkLib.clientsSsmMod.ParameterList | awsDashSdkLib.clientsSsmMod.Parameter | awsDashSdkLib.clientsSsmMod.GetParametersResult = js.native
  def named(nameOrNames: awsDashSdkLib.clientsSsmMod.PSParameterName): ParameterQuery = js.native
  def named(nameOrNames: awsDashSdkLib.clientsSsmMod.ParameterNameList): ParameterQuery = js.native
  def path(path: awsDashSdkLib.clientsSsmMod.PSParameterName): ParameterQuery = js.native
  def recursive(enabled: scala.Boolean): ParameterQuery = js.native
}

