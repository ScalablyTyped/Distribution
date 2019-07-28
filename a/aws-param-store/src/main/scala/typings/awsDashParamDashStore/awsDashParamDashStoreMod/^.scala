package typings.awsDashParamDashStore.awsDashParamDashStoreMod

import typings.awsDashSdk.clientsSsmMod.ClientConfiguration
import typings.awsDashSdk.clientsSsmMod.GetParametersResult
import typings.awsDashSdk.clientsSsmMod.PSParameterName
import typings.awsDashSdk.clientsSsmMod.Parameter
import typings.awsDashSdk.clientsSsmMod.ParameterList
import typings.awsDashSdk.clientsSsmMod.ParameterNameList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getParameter(name: PSParameterName): js.Promise[Parameter] = js.native
  def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = js.native
  def getParameterSync(name: PSParameterName): Parameter = js.native
  def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = js.native
  def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = js.native
  def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = js.native
  def getParametersByPath(path: ParameterNameList): js.Promise[ParameterList] = js.native
  def getParametersByPath(path: ParameterNameList, options: ClientConfiguration): js.Promise[ParameterList] = js.native
  def getParametersByPathSync(path: ParameterNameList): ParameterList = js.native
  def getParametersByPathSync(path: ParameterNameList, options: ClientConfiguration): ParameterList = js.native
  def getParametersSync(names: ParameterNameList): GetParametersResult = js.native
  def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = js.native
  def parameterQuery(): ParameterQuery = js.native
  def parameterQuery(options: ClientConfiguration): ParameterQuery = js.native
}

