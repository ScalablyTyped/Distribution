package typings.awsDashParamDashStore.awsDashParamDashStoreMod

import typings.awsDashSdk.clientsSsmMod.GetParametersResult
import typings.awsDashSdk.clientsSsmMod.PSParameterName
import typings.awsDashSdk.clientsSsmMod.Parameter
import typings.awsDashSdk.clientsSsmMod.ParameterList
import typings.awsDashSdk.clientsSsmMod.ParameterNameList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterQuery extends js.Object {
  def decryption(enabled: Boolean): ParameterQuery = js.native
  def execute(): js.Promise[ParameterList | Parameter | GetParametersResult] = js.native
  def executeSync(): ParameterList | Parameter | GetParametersResult = js.native
  def named(nameOrNames: PSParameterName): ParameterQuery = js.native
  def named(nameOrNames: ParameterNameList): ParameterQuery = js.native
  def path(path: PSParameterName): ParameterQuery = js.native
  def recursive(enabled: Boolean): ParameterQuery = js.native
}

