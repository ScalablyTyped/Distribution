package typings.awsDashParamDashStore

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
object awsDashParamDashStoreMod extends js.Object {
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
  
  def getParameter(name: PSParameterName): js.Promise[Parameter] = js.native
  def getParameter(name: PSParameterName, options: ClientConfiguration): js.Promise[Parameter] = js.native
  def getParameterSync(name: PSParameterName): Parameter = js.native
  def getParameterSync(name: PSParameterName, options: ClientConfiguration): Parameter = js.native
  def getParameters(names: ParameterNameList): js.Promise[GetParametersResult] = js.native
  def getParameters(names: ParameterNameList, options: ClientConfiguration): js.Promise[GetParametersResult] = js.native
  def getParametersByPath(path: PSParameterName): js.Promise[ParameterList] = js.native
  def getParametersByPath(path: PSParameterName, options: ClientConfiguration): js.Promise[ParameterList] = js.native
  def getParametersByPathSync(path: PSParameterName): ParameterList = js.native
  def getParametersByPathSync(path: PSParameterName, options: ClientConfiguration): ParameterList = js.native
  def getParametersSync(names: ParameterNameList): GetParametersResult = js.native
  def getParametersSync(names: ParameterNameList, options: ClientConfiguration): GetParametersResult = js.native
  def parameterQuery(): ParameterQuery = js.native
  def parameterQuery(options: ClientConfiguration): ParameterQuery = js.native
}

