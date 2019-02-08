package typings
package awsDashParamDashStoreLib.awsDashParamDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-param-store", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getParameter(name: awsDashSdkLib.clientsSsmMod.SSMNs.PSParameterName): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.Parameter] = js.native
  def getParameter(
    name: awsDashSdkLib.clientsSsmMod.SSMNs.PSParameterName,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.Parameter] = js.native
  def getParameterSync(name: awsDashSdkLib.clientsSsmMod.SSMNs.PSParameterName): awsDashSdkLib.clientsSsmMod.SSMNs.Parameter = js.native
  def getParameterSync(
    name: awsDashSdkLib.clientsSsmMod.SSMNs.PSParameterName,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.SSMNs.Parameter = js.native
  def getParameters(names: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.GetParametersResult] = js.native
  def getParameters(
    names: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.GetParametersResult] = js.native
  def getParametersByPath(path: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.ParameterList] = js.native
  def getParametersByPath(
    path: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): js.Promise[awsDashSdkLib.clientsSsmMod.SSMNs.ParameterList] = js.native
  def getParametersByPathSync(path: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList): awsDashSdkLib.clientsSsmMod.SSMNs.ParameterList = js.native
  def getParametersByPathSync(
    path: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.SSMNs.ParameterList = js.native
  def getParametersSync(names: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList): awsDashSdkLib.clientsSsmMod.SSMNs.GetParametersResult = js.native
  def getParametersSync(
    names: awsDashSdkLib.clientsSsmMod.SSMNs.ParameterNameList,
    options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration
  ): awsDashSdkLib.clientsSsmMod.SSMNs.GetParametersResult = js.native
  def parameterQuery(): awsDashParamDashStoreLib.awsDashParamDashStoreMod.ParameterQuery = js.native
  def parameterQuery(options: awsDashSdkLib.clientsSsmMod.SSMNs.ClientConfiguration): awsDashParamDashStoreLib.awsDashParamDashStoreMod.ParameterQuery = js.native
}

